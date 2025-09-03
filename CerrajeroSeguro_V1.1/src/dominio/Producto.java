package dominio;

public class Producto {
    
    private int codigoProducto;
    private String nombreProducto;
    private double montoProducto;

    public Producto(int codigoProducto, String nombreProducto, double montoProducto) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.montoProducto = montoProducto;
    }

    public double getMontoProducto() {
        return montoProducto;
    }

    public void setMontoProducto(double montoProducto) {
        this.montoProducto = montoProducto;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    
    
    
}
