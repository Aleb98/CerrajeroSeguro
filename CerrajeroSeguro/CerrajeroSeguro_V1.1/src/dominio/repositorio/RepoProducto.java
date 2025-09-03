package dominio.repositorio;

import dominio.Producto;
import java.util.ArrayList;

public interface RepoProducto {
    
    Producto obtenerProductoInventario(int codigoProducto);
    void decrementarProductoInventario(ArrayList<Producto> productos);
    
}
