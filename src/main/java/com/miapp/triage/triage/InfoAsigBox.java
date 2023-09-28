package com.miapp.triage.triage;
import java.util.Date;

public class InfoAsigBox {

    private int hora;
    private Date fecha;

    public InfoAsigBox(int hora, Date fecha) {
        this.hora = hora;
        this.fecha = fecha;
    }

    public InfoAsigBox(){

    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
