package com.miapp.triage.triage;
import java.util.Date;


public class Estudios {

    private Date Fechatit;
    private String Universidad;

    public Estudios(Date fechatit, String universidad) {
        Fechatit = fechatit;
        Universidad = universidad;
    }

    public Estudios(){

    }

    //GETTERS Y SETTERS
    public Date getFechatit() {

        return Fechatit;
    }

    public void setFechatit(Date fechatit) {

        Fechatit = fechatit;
    }

    public String getUniversidad() {

        return Universidad;
    }

    public void setUniversidad(String universidad) {

        Universidad = universidad;
    }
}
