package modelo;

public class Producto {
    
    private String nombreProducto;
    private int codigoProducto;
    private double precioProducto;

    public Producto(String nombreProducto, int codigoProducto, double precioProducto) {
        this.nombreProducto = nombreProducto;
        this.codigoProducto = codigoProducto;
        this.precioProducto = precioProducto;
    }

    public double getPrecioProducto() { return precioProducto; }

    public void setPrecioProducto(double precioProducto) { this.precioProducto = precioProducto; }

    public String getNombreProducto() { return nombreProducto; }

    public void setNombreProducto(String nombreProducto) { this.nombreProducto = nombreProducto; }

    public int getCodigoProducto() { return codigoProducto; }

    public void setCodigoProducto(int codigoProductoo) { this.codigoProducto = codigoProductoo; }

    @Override
    public String toString() {
        return "Producto: " + nombreProducto + " /" + codigoProducto + " /" + precioProducto;
    }
    
    
    
    
}
