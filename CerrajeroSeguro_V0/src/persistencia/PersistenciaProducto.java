package persistencia;

import modelo.Producto;
import usesCases.RegistrarVenta.*;

public class PersistenciaProducto implements RepoProducto{

    Producto[] productos =  new Producto[5];
    {
        productos[0] = new Producto("Copia llave candado", 100, 1000);
        productos[1] = new Producto("Copia llave simple", 101, 1200);
        productos[2] = new Producto("Copia llave doble paleta", 102, 1500);
        productos[3] = new Producto("Candado", 103, 1700);
        productos[4] = new Producto("Cerradura", 104, 1800);
    }
    
    
    @Override
    public Producto obtenerProducto(int codigoProducto) {
        for (Producto producto1 : productos) {
            if(producto1 != null && producto1.getCodigoProducto() == codigoProducto){
                return producto1;
            }
        }
        return null;
    }
    public Producto[] obtenerTodos() {
        return productos;
    }
    
}
