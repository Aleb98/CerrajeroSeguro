package controllerVistas;

import controller.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import persistencia.PersistenciaProducto;
import usesCases.RegistrarVenta.RepoProducto;
import vista.*;

public class ControllerVistaPrincipal {
    
    private Producto producto;
    private LineaDeVenta lineaDeVenta;
    private RepoProducto repoProducto;
    private VistaPrincipal vistaPrincipal;
    private ControllerRegistrarVenta controllerRegistrarVenta;
    
    public ControllerVistaPrincipal(){
        this.vistaPrincipal = new VistaPrincipal();
        this.repoProducto = new PersistenciaProducto();
        this.controllerRegistrarVenta = new ControllerRegistrarVenta();
        listarProductos();
        vistaPrincipal.setVisible(true);
        this.vistaPrincipal.getBotonIngresarProducto().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ControllerVistaPrincipal.this.ingresarProducto();
            }
            
        });
    }
    
    private void listarProductos(){
        DefaultTableModel modelo = (DefaultTableModel) vistaPrincipal.getTablaProductos().getModel();
        modelo.setRowCount(0);
        for (Producto p : ((PersistenciaProducto)repoProducto).obtenerTodos()) {
            if(p != null){
                modelo.addRow(new Object[]{
                    p.getCodigoProducto(),
                    p.getNombreProducto(),
                    p.getPrecioProducto()
                });
            }
        }
    }
    
    public LineaDeVenta ingresarProducto(){
        int codigo = 0;
        try{
            codigo = Integer.parseInt(vistaPrincipal.getCampoCodigoProducto().getText().trim());
            lineaDeVenta = controllerRegistrarVenta.ingresarProducto(codigo);
            if(lineaDeVenta != null){
                System.out.println("Agregando: " + lineaDeVenta.getProducto().getNombreProducto());
                agregarProductoTablaVenta(lineaDeVenta);
                return lineaDeVenta;
            }else{
                JOptionPane.showMessageDialog(vistaPrincipal, "Producto no encontrado");
            }
        }catch(Exception e){
            return null;
        }
        return lineaDeVenta;
    }
    private void agregarProductoTablaVenta(LineaDeVenta lineaDeVenta){
        DefaultTableModel modelo = (DefaultTableModel) vistaPrincipal.getTablaLineaDeVenta().getModel();
        lineaDeVenta.setCantidad(1);
        //modelo.setRowCount(0);
        Object[] fila = {
            lineaDeVenta.getCantidad(),
            lineaDeVenta.getProducto().getNombreProducto(),
            lineaDeVenta.getProducto().getPrecioProducto(),
            lineaDeVenta.obtenerSubTotal()
        };
        modelo.addRow(fila);
        SwingUtilities.invokeLater(() -> {
        vistaPrincipal.getTablaLineaDeVenta().revalidate();
        vistaPrincipal.getTablaLineaDeVenta().repaint();
    });
    }
        
    public Venta finalizarVenta(){
        return null;
    }

}
