package controllerVistas;

import controller.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.*;
//import usesCases.iniciarSesion.IniciarSesion;
import vista.*;

public class ControllerVistaIniciarSesion {
    
    private ControllerIniciarSesion controllerIniciarSesion;
    private ControllerVistaPrincipal controllerVistaPrincipal;
    private VistaIniciarSesion vistaIniciarSesion;
    private Sesion sesion;
    
    public ControllerVistaIniciarSesion(){
        
        this.vistaIniciarSesion = new VistaIniciarSesion();
        this.controllerIniciarSesion = new ControllerIniciarSesion();
        vistaIniciarSesion.setVisible(true);
        
        
        this.vistaIniciarSesion.getBotonIniciarSesion().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreUsuario = vistaIniciarSesion.getCampoNombreUsuario().getText();
                String contraseñaUsuario = new String(vistaIniciarSesion.getCampoContraseñaUsuario().getPassword());
                if(iniciarSesion(nombreUsuario, contraseñaUsuario)){
                    ControllerVistaIniciarSesion.this.vistaIniciarSesion.dispose();
                    ControllerVistaIniciarSesion.this.controllerVistaPrincipal = new ControllerVistaPrincipal();
                }
            }
            
        });
    }
    
    public boolean iniciarSesion(String nombreUsuario, String contraseñaUsuario){
        if(controllerIniciarSesion.iniciarSesion(nombreUsuario, contraseñaUsuario)){
            return true;
        }
        return false;
    }
    
}
