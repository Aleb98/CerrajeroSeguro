package aplicacion;

import dominio.*;
import dominio.repositorio.*;
import dominio.servicios.ServicioVenta;

public class AppServicioRegistrarVenta {
    
    private final ServicioVenta servicioVenta;
    private final RepoProducto repoProducto;
    private final RepoVenta repoVenta;

    public AppServicioRegistrarVenta(ServicioVenta servicioVenta, RepoProducto repoProducto, RepoVenta repoVenta) {
        this.servicioVenta = servicioVenta;
        this.repoProducto = repoProducto;
        this.repoVenta = repoVenta;
    }
    
    public void iniciarVenta(Sesion sesion){
        servicioVenta.iniciarVenta(sesion.getUsuario());
    }
    
    public void ingresarProducto(Venta venta, int codigoProducto, int cantidad){
        Producto producto = repoProducto.obtenerProductoInventario(codigoProducto);
        if(producto != null){
            servicioVenta.agregarProductoAVenta(venta, producto, cantidad);
        }
    }
    public void finalizarVenta(int cantidad, Venta venta){
        repoProducto.decrementarProductoInventario(venta.obtenerProductos());
        servicioVenta.finalizarVenta(venta, cantidad);
        repoVenta.guardarVenta(venta);
    }
    
}
