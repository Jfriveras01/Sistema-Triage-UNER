package com.miapp.triage.triage;

import java.util.Date;


public class InfomeEstudios {


    private int id_informe;
    private String TipoEstudio;
    private Date FechaEstudio;
    private String InformeRealizado;
    private Paciente paciente;

    
    public InfomeEstudios(int id_info, String tipoEstudio, Date fechaEstudio, String informeRealizado, Paciente paciente) {
        id_informe = id_info;
        TipoEstudio = tipoEstudio;
        FechaEstudio = fechaEstudio;
        InformeRealizado = informeRealizado;
        this.paciente = paciente;
    }
    public InfomeEstudios(){

    }

    //GETTERS Y SETTERS

    public int getId_informe() {
        return id_informe;
    }

    public void setId_informe(int id_informe) {
        this.id_informe = id_informe;
    }
    
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

    public Paciente getInforme() {
        return paciente;
    }

    public void setInforme(Paciente informe) {
        this.paciente = informe;
    }

   

}
