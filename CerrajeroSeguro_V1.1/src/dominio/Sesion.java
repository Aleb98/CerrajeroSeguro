package dominio;

import java.time.*;
import java.util.UUID;

public class Sesion {
    
    private String idSesion;
    private LocalDate fechaSesion;
    private LocalTime horaSesion;
    private Usuario usuario;

    public Sesion(Usuario usuario) {
        this.idSesion = UUID.randomUUID().toString();
        this.fechaSesion = LocalDate.now();
        this.horaSesion = LocalTime.now();
        this.usuario = usuario;
    }

    public String getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(String idSesion) {
        this.idSesion = idSesion;
    }

    public LocalDate getFechaSesion() {
        return fechaSesion;
    }

    public void setFechaSesion(LocalDate fechaSesion) {
        this.fechaSesion = fechaSesion;
    }

    public LocalTime getHoraSesion() {
        return horaSesion;
    }

    public void setHoraSesion(LocalTime horaSesion) {
        this.horaSesion = horaSesion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
