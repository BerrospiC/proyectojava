
package Modelo;

public class Asistencia {
    String nombre,hora,fecha;

    public Asistencia() {
    }

    public Asistencia(String nombre, String hora, String fecha) {
        this.nombre = nombre;
        this.hora = hora;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
