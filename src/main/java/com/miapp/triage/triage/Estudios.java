package com.miapp.triage.triage;
import java.util.Date;


public class Estudios {

    private Date Fechatit;
    private String Universidad;
    private Medicos medicos;

    public Estudios(Date Fechatit, String Universidad, Medicos medicos) {
        this.Fechatit = Fechatit;
        this.Universidad = Universidad;
        this.medicos = medicos;
    }
    
    

    public Estudios(){

    }

    //GETTERS Y SETTERS

    public Date getFechatit() {
        return Fechatit;
    }

    public void setFechatit(Date Fechatit) {
        this.Fechatit = Fechatit;
    }

    public String getUniversidad() {
        return Universidad;
    }

    public void setUniversidad(String Universidad) {
        this.Universidad = Universidad;
    }

    public Medicos getMedicos() {
        return medicos;
    }

    public void setMedicos(Medicos medico) {
        this.medicos = medico;
    }

 
    
    
}
