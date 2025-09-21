package dominio.servicios;

import dominio.*;

public class ServicioVenta {
    
    public Venta iniciarVenta(Usuario usuario){
        if(usuario != null){
            return new Venta(usuario);
        }
        //IMPLEMETAR EXCEPTION
        return null;
    }
    public void agregarProductoAVenta(Venta venta, Producto producto, int cantidad){
        venta.agregarLineaDeVenta(new LineaDeVenta(cantidad, producto));
    }
    
    public double finalizarVenta(Venta venta, double cantidad){
        venta.registrarPago(cantidad);
        return 0;
    }
}
