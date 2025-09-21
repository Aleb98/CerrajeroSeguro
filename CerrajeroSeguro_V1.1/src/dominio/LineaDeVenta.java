package dominio;

public class LineaDeVenta {
    
    private int cantidadProducto;
    private Producto producto;
    private double subtotal;

    public LineaDeVenta(int cantidadProducto, Producto producto) {
        this.cantidadProducto = cantidadProducto;
        this.producto = producto;
    }
    
    public double calcularSubTotal(){
        return this.subtotal = cantidadProducto * producto.getMontoProducto();
    }

    public int getCantidadProducto() { return cantidadProducto; }
    public void setCantidadProducto(int cantidadProducto) { this.cantidadProducto = cantidadProducto; }

    public Producto getProducto() { return producto; }
    public void setProducto(Producto producto) { this.producto = producto; }

    public double getSubtotal() { return subtotal; }
    public void setSubtotal(double subtotal) { this.subtotal = subtotal; }
    
}
