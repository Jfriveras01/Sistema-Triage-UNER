package com.miapp.triage.triage;

import java.util.Date;


public class Consulta  {


    private int id_consulta;
    private Date Fecha;
    private int Hora;
    private String Diagnostico;
    private String Lugar;
    private String DiagClinico;
    private BoxAtencion boxAtencion;



    private Paciente consul;


    private Medicos medico;

    
    private Triage triage;

    public Consulta(int id_consul,Date fecha, int hora, String diagnostico, String lugar, String diagClinico, BoxAtencion boxatencion, Paciente consu, Triage triag, Medicos medic) {
        id_consulta = id_consul;
        Fecha = fecha;
        Hora = hora;
        Diagnostico = diagnostico;
        Lugar = lugar;
        DiagClinico = diagClinico;
        boxAtencion = boxatencion;
        consul = consu;
        triage = triag;
        medico = medic;
    }

    public Consulta(){

    }

    //GETTERS Y SETTERS

    public int getId_consulta() {
        return id_consulta;
    }

    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public int getHora() {
        return Hora;
    }

    public void setHora(int hora) {
        Hora = hora;
    }

    public String getDiagnostico() {
        return Diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        Diagnostico = diagnostico;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String lugar) {
        Lugar = lugar;
    }

    public String getDiagClinico() {
        return DiagClinico;
    }

    public void setDiagClinico(String diagClinico) {
        DiagClinico = diagClinico;
    }

    public BoxAtencion getBoxAtencion() {
        return boxAtencion;
    }

    public void setBoxAtencion(BoxAtencion boxAtencion) {
        this.boxAtencion = boxAtencion;
    }

    public Paciente getConsul() {
        return consul;
    }

    public void setConsul(Paciente consul) {
        this.consul = consul;
    }


    public Triage getTriage() {
        return triage;
    }

    public void setTriage(Triage triage) {
        this.triage = triage;
    }

    public Medicos getMedico() {
        return medico;
    }

    public void setMedico(Medicos medico) {
        this.medico = medico;
    }
}
