package dominio;

import java.util.ArrayList;
import java.util.UUID;

public class Venta {
    
    private String idVenta;
    private Usuario usuario;
    private ArrayList<LineaDeVenta> lineasDeVenta;
    private Pago pago;

    public Venta(Usuario usuario) {
        this.idVenta = UUID.randomUUID().toString();
        this.usuario = usuario;
        this.lineasDeVenta = new ArrayList<LineaDeVenta>();
    }
    
    public void agregarLineaDeVenta(LineaDeVenta lineaDeVenta){
        lineasDeVenta.add(lineaDeVenta);
    }
    public double totalVenta(){
        double total = 0;
        for (LineaDeVenta lineaDeVenta : lineasDeVenta) {
            total += lineaDeVenta.calcularSubTotal();
        }
        return total;
    }
    public Pago registrarPago(double monto){
        if(monto<totalVenta()){
            System.out.println("El monto ingresado es menor al monto de la venta");
        }
        this.pago = new Pago(monto);
        return pago;
    }
    public ArrayList<Producto> obtenerProductos(){
        ArrayList<Producto> productos = new ArrayList<Producto>();
        for (LineaDeVenta lineaDeVenta : lineasDeVenta) {
            productos.add(lineaDeVenta.getProducto());
        }
        return productos;
    }
}
