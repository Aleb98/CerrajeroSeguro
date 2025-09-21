package paquete;

import aplicacion.AppServicioIniciarSesion;
import dominio.repositorio.RepoUsuario;
import persistencia.PersistenciaUsuario;

public class Principal {

    public static void main(String[] args) {
        
        RepoUsuario repoUsuario = new PersistenciaUsuario();
        AppServicioIniciarSesion appServicioIniciarSesion = new AppServicioIniciarSesion();
        
    }
    
}
