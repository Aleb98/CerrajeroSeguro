package usesCases.iniciarSesion;

import modelo.*;
import persistencia.*;

public class IniciarSesion {
    
    private RepoUsuario repoUsuario;
    private RepoSesion repoSesion;
    private Usuario usuario;
    private Sesion sesion;
    
    public IniciarSesion(){
        this.repoUsuario = new PersistenciaUsuario();//repoUsuario;
        this.repoSesion = new PersistenciaSesion();//repoSesion;
    }
    public boolean ejecutarIniciarSesion(String nombreUsuario, String contraseñaUsuario){
        this.usuario = repoUsuario.buscar(nombreUsuario, contraseñaUsuario);
        if(usuario != null){
            this.sesion = new Sesion();
            usuario.agregarSesion(sesion);
            UsuarioSingleton.getInstancia().setUsuario(usuario);
            System.out.println("Inicio de sesion exitoso");
            return true;
        }
        System.out.println("No se encontro el usuario");
        return false;
    }
}
