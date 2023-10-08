package com.miapp.triage.triage;
import java.util.List;


public class BoxAtencion  {



    private int id_box;
    private boolean Estado;
    private List<Medicos> Medicos;
    private List<Consulta> Consulta;
    private Paciente paciente;

    public BoxAtencion(int id, boolean estado, List<Medicos> medicos, List<Consulta> consulta, Paciente pacient) {
        this.id_box = id;
        Estado = estado;
        Medicos = medicos;
        Consulta = consulta;
        paciente = pacient;
    }

    public BoxAtencion(){

    }

    //GETTERS Y SETTERS
    public int getId_box() {
        return id_box;
    }

    public void setId_box(int ID) {
        this.id_box = ID;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean estado) {
        Estado = estado;
    }

    public List<Medicos> getMedicos() {
        return Medicos;
    }

    public void setMedicos(List<Medicos> medicos) {
        Medicos = medicos;
    }
    public List<Consulta> getConsulta() {
        return Consulta;
    }

    public void setConsulta(List<Consulta> consulta) {
        Consulta = consulta;
    }
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
