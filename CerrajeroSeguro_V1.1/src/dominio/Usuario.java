package dominio;

import java.util.UUID;

public class Usuario {
    
    private int idUsuario;
    private String nombreUsuario;
    private String contraUsuario;

    public Usuario(int idUsuario, String nombreUsuario, String contraUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contraUsuario = contraUsuario;
    }
    
    public String getNombreUsuario() { return nombreUsuario; }
    public void setNombreUsuario(String nombreUsuario) { this.nombreUsuario = nombreUsuario; }

    public String getContraUsuario() { return contraUsuario; }
    public void setContraUsuario(String contraUsuario) { this.contraUsuario = contraUsuario; }

    public int getIdUsuario() { return idUsuario; }
    
    public boolean verificarUsuario(String contraIngresada){
        return this.contraUsuario.equals(contraIngresada);
    }
    
}
