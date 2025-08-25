package modelo;

import java.util.*;

public class Venta {
    
    private Pago pago;
    private ArrayList<LineaDeVenta> lineas;
    private double total;
    
    public Venta(){
        this.lineas = new ArrayList<LineaDeVenta>();
        this.pago = new Pago();
    }
    
    public Pago getPago() {
        return pago;
    }
    public void setPago(Pago pago) {
        this.pago = pago;
    }
    public double getTotal() { 
        return total; 
    }
    public void setTotal(double total) { 
        this.total = total; 
    }
        
    public void agregarLineaDeVenta(LineaDeVenta lineaDeVenta){
        lineas.add(lineaDeVenta);
    }
    public double obtenerTotalLineasDeVenta(){
        this.total = 0;
        for (LineaDeVenta linea : lineas) {
            total =+ linea.obtenerSubTotal();
        }
        return total;
    } 
    
}
