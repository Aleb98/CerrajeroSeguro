package modelo;

public class LineaDeVenta {
    
    private Producto producto;
    private int cantidad;

    public LineaDeVenta(Producto producto) {
        this.producto = producto;
        this.cantidad = 0;
    }

    public int getCantidad() { return cantidad; }

    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public Producto getProducto() { return producto; }

    public void setProducto(Producto producto) { this.producto = producto; }
    
    public double obtenerSubTotal(){
        return cantidad * producto.getPrecioProducto();
    }
    
    
}
