package com.miapp.triage.triage;

import java.util.Date;

public class Consulta {



    private Date Fecha;
    private int Hora;
    private String Diagnostico;
    private String Lugar;
    private String DiagClinico;
    private BoxAtencion boxAtencion;
    private Paciente paciente;

    private Medicos medico;

    private Triage triage;

    public Consulta(Date fecha, int hora, String diagnostico, String lugar, String diagClinico, BoxAtencion boxatencion, Paciente pacient, Triage triag, Medicos medic) {
        Fecha = fecha;
        Hora = hora;
        Diagnostico = diagnostico;
        Lugar = lugar;
        DiagClinico = diagClinico;
        boxAtencion = boxatencion;
        paciente = pacient;
        triage = triag;
        medico = medic;
    }

    public Consulta(){

    }

    //GETTERS Y SETTERS

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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
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
