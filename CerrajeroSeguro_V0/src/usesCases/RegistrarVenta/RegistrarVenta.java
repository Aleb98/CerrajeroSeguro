package usesCases.RegistrarVenta;

import java.util.*;
import modelo.*;
import usesCases.iniciarSesion.*;

public class RegistrarVenta {
    
    private Pago pago;
    private Venta venta;
    private Recibo recibo;
    private Usuario usuario;
    private Producto producto;
    private RepoVenta repoVenta;
    private LineaDeVenta lineaDeVenta;
    private RepoProducto repoProducto;
    private IniciarSesion iniciarSesion;
        
    public RegistrarVenta(/*IniciarSesion iniciarSesion*/){
        //this.iniciarSesion = iniciarSesion;
    }
    //CORRESPONDIENTE AL PRIMER EVENTO: "INICIAR VENTA ()"
    public void iniciarVenta(){
        this.usuario = UsuarioSingleton.getInstancia().getUsuario();
        this.venta = new Venta();
        //return venta;
    }
    //CORRESPONDIENTE AL SEGUNDO METODO: "INGRESAR CODIGO (CODIGO)"
    public LineaDeVenta ingresarProducto(int codigo){
        this.producto = repoProducto.obtenerProducto(codigo);
        if(producto != null){
            this.lineaDeVenta = new LineaDeVenta(producto);
            venta.agregarLineaDeVenta(lineaDeVenta);
            venta.obtenerTotalLineasDeVenta();
        }
        return lineaDeVenta;
    }
    /*
    public Producto ingresarCodigo(int codigo){
        this.producto = repoProducto.obtenerProducto(codigo);
        if(producto != null){
            this.lineaDeVenta = new LineaDeVenta(producto);
            venta.agregarLineaDeVenta(lineaDeVenta);
            venta.obtenerTotalLineasDeVenta();
            return producto;
        }
        return null;
    }
    */
    //CORRESPONDIENTE AL TERCER METODO: "FINALIZAR VENTA (FORMA DE PAGO)"
    public Venta finalizarVenta(){
        if(venta != null){
            venta.setTotal(venta.obtenerTotalLineasDeVenta());
            venta.getPago().setMonto(venta.obtenerTotalLineasDeVenta());
            return venta;
        }
        return null;
    }
    //CORRESPONDIENTE AL CUARTO EVENTO: "REALIZAR PAGO"
    public void relaliarPago(){
        if(venta != null){
            this.repoVenta.guardarVenta(venta);
            this.recibo = new Recibo(venta);
        }
    }
    private void decrementarAlmacen(Producto producto){
        //CONECTARSE CON EL REPO Y DAR DE BAJA EL PRODUCTO DE LA BASE DE DATOS
        
    }
    
}
