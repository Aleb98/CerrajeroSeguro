package persistencia;

import dominio.Producto;
import dominio.repositorio.RepoProducto;
import java.util.ArrayList;

public class PersistenciaProductos implements RepoProducto{
    
    Producto productos[] = new Producto[5];
    {
        productos[0] = new Producto(100, "llave", 100);
        productos[1] = new Producto(101, "llave doble paleta", 110);
        productos[2] = new Producto(102, "llave candado", 120);
        productos[3] = new Producto(103, "cerradura paleta", 130);
        productos[4] = new Producto(104, "cerradura doble paleta", 140);
    }

    @Override
    public Producto obtenerProductoInventario(int codigoProducto) {
        for (Producto producto : productos) {
            if(producto.getCodigoProducto()==codigoProducto){
                return producto;
            }
        }
        return null;
    }

    @Override
    public void decrementarProductoInventario(ArrayList<Producto> productos) {
        System.out.println("Decrementando producto");
    }
    
    
    
}
