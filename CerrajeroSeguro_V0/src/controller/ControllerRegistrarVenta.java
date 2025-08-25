package controller;

import modelo.*;
import usesCases.RegistrarVenta.*;

public class ControllerRegistrarVenta {
    
    private RegistrarVenta registrarVenta;
    private LineaDeVenta lineaDeVenta;
    private Producto producto;
    private Venta venta;
    
    public ControllerRegistrarVenta(){
        this.registrarVenta = new RegistrarVenta();
    }
    
    public LineaDeVenta ingresarProducto(int codigoProducto){
        if(venta == null){
            registrarVenta.iniciarVenta();
        }
        this.lineaDeVenta = registrarVenta.ingresarProducto(codigoProducto);
        return lineaDeVenta;
    }
    public Venta finalizarVenta(){
        venta = registrarVenta.finalizarVenta();
        return venta;
    }
    
}
