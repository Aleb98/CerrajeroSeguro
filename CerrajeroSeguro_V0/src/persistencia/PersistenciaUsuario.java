package persistencia;

import modelo.*;
import usesCases.iniciarSesion.*;

public class PersistenciaUsuario implements RepoUsuario{

    @Override
    public Usuario buscar(String nombreUsuario, String contraseñaUsuario) {
        System.out.println("Buscando en la base de datos...");
        if(nombreUsuario.equals("ale") && contraseñaUsuario.equals("123")){
            return new Usuario(nombreUsuario, contraseñaUsuario);                       
        }else{
            return null;
        }        
    }    
}
