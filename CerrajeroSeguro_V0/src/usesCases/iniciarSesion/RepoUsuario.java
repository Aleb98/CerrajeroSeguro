package usesCases.iniciarSesion;

import modelo.Usuario;

public interface RepoUsuario {
    
    //1.1.usuario := buscar (nombreUsuario, contraseñaUsuario)
    Usuario buscar(String nombreUsuario, String contraseñaUsuario);
    
}
