package aplicacion;

import dominio.*;
import dominio.repositorio.*;
import dominio.servicios.ServicioAutenticacion;

public class AppServicioIniciarSesion {
    
    private final RepoUsuario repoUsuario;
    private final RepoSesion repoSesion;
    private final ServicioAutenticacion servicioAutenticacion;

    public AppServicioIniciarSesion(
            RepoUsuario repoUsuario,
            RepoSesion repoSesion,
            ServicioAutenticacion servicioAutenticacion) {
        this.repoUsuario = repoUsuario;
        this.repoSesion = repoSesion;
        this.servicioAutenticacion = servicioAutenticacion;
    }
    
    public Sesion iniciarSesion(String nombreUsuario, String contraUsuario){
        Usuario usuario = repoUsuario.obtenerUsuarioNombre(nombreUsuario);
        if(usuario != null){
            Sesion sesion = servicioAutenticacion.autenticarUsuario(usuario, contraUsuario);
            repoSesion.guardarSesion(sesion);
            return sesion;
        }
        return null;
    }
    
}
