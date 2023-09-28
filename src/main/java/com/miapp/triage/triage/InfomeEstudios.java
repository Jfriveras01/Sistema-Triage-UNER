package com.miapp.triage.triage;

import java.util.Date;


public class InfomeEstudios {




    private String TipoEstudio;
    private Date FechaEstudio;
    private String InformeRealizado;
    private Paciente paciente;

    public InfomeEstudios(String tipoEstudio, Date fechaEstudio, String informeRealizado, Paciente paciente) {
        TipoEstudio = tipoEstudio;
        FechaEstudio = fechaEstudio;
        InformeRealizado = informeRealizado;
        this.paciente = paciente;
    }
    public InfomeEstudios(){

    }

    //GETTERS Y SETTERS

    public String getTipoEstudio() {
        return TipoEstudio;
    }

    public void setTipoEstudio(String tipoEstudio) {
        TipoEstudio = tipoEstudio;
    }

    public Date getFechaEstudio() {
        return FechaEstudio;
    }

    public void setFechaEstudio(Date fechaEstudio) {
        FechaEstudio = fechaEstudio;
    }

    public String getInformeRealizado() {
        return InformeRealizado;
    }

    public void setInformeRealizado(String informeRealizado) {
        InformeRealizado = informeRealizado;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}
