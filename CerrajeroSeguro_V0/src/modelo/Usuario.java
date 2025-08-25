package modelo;

import java.util.*;

public class Usuario {
    
    private String nombreUsuario;
    private String contraseñaUsuario;
    private ArrayList<Sesion> sesiones;
    private ArrayList<Venta> ventas;
    
    public Usuario(String nombreUsuario, String contraseñaUsuario){
        this.nombreUsuario = nombreUsuario;
        this.contraseñaUsuario = contraseñaUsuario;
        this.ventas = new ArrayList<Venta>();
        this.sesiones = new ArrayList<Sesion>();
    }

    public String getNombreUsuario() { return nombreUsuario; }
    public void setNombreUsuario(String nombreUsuario) { this.nombreUsuario = nombreUsuario; }
    public String getContraseñaUsuario() { return contraseñaUsuario; }
    public void setContraseñaUsuario(String contraseñaUsuario) { this.contraseñaUsuario = contraseñaUsuario;}
    
    public void agergarVenta(Venta venta){
        ventas.add(venta);
    }
    public void agregarSesion(Sesion sesion){
        sesiones.add(sesion);
    }
    @Override
    public String toString() {
        return "Usuario: " + nombreUsuario + "; Contraseña:" + contraseñaUsuario;
    }    
    
}
