
package Modelo;

public class Finanzas {
    String asunto;
    Double monto;
    String fecha;

    public Finanzas() {
    }

    public Finanzas(String asunto, Double monto, String fecha) {
        this.asunto = asunto;
        this.monto = monto;
        this.fecha = fecha;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
