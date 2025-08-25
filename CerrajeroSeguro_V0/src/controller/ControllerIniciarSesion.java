package controller;

import modelo.*;
import usesCases.iniciarSesion.*;

public class ControllerIniciarSesion {
    
    private IniciarSesion iniciarSesion;
    //private Sesion sesion;
    
    public ControllerIniciarSesion(){
        this.iniciarSesion = new IniciarSesion();
        //this.sesion = new Sesion();
    }
    
    public boolean iniciarSesion(String nombreUsuario, String contraUsuario){
        if(iniciarSesion.ejecutarIniciarSesion(nombreUsuario, contraUsuario)){
            System.out.println("Se inicio sesion correctamente");
            return true;
        }
        System.out.println("No se reconoce el usuario");
        return false;
    }
    
}
