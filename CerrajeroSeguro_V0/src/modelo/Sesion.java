package modelo;

import java.time.*;

public class Sesion {
    
    private LocalDate fecha;
    private LocalTime hora;
    
    public Sesion(){
        this.fecha = LocalDate.now();
        this.hora = LocalTime.now();
    }

    public LocalDate getFecha() { return fecha; }

    public LocalTime getHora() { return hora; }

    @Override
    public String toString() {
        return "Sesion =>" + " Fecha: " + fecha + "; Hora: " + hora;
    }
    
}
