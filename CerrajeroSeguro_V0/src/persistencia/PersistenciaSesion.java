package persistencia;

import modelo.Sesion;
import usesCases.iniciarSesion.RepoSesion;

public class PersistenciaSesion implements RepoSesion{

    @Override
    public boolean agregarSesion(Sesion sesion) {
        if(sesion!=null){
            System.out.println("La sesion: " + sesion + " fue guardada en la base de datos con exito");
            return true;
        }else{
            return false;
        }
    }
    
}
