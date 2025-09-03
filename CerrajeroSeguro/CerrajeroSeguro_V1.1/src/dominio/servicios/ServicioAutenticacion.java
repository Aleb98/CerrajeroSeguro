package dominio.servicios;

import dominio.*;

public class ServicioAutenticacion {
    
    public Sesion autenticarUsuario(Usuario usuario, String contraUsuario){
        if(usuario.verificarUsuario(contraUsuario)){
            return new Sesion(usuario);
        }
        return null;
    }
    
}
