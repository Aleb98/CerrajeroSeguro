package persistencia;

import dominio.Usuario;
import dominio.repositorio.RepoUsuario;
import java.util.ArrayList;

public class PersistenciaUsuario implements RepoUsuario{
    
    Usuario[] usuarios = new Usuario[3];
    {
        usuarios[0] = new Usuario(41184109, "ale", "123");
        usuarios[1] = new Usuario(14660884, "mama", "123");
        usuarios[2] = new Usuario(45512018, "mari", "ciro");
    }
    
    @Override
    public Usuario obtenerUsuarioNombre(String nombreUsuario) {
        for (Usuario usuario : usuarios) {
            if(usuario.equals(nombreUsuario)){
                return usuario;
            }
        }
        return null;
    }
    
}
