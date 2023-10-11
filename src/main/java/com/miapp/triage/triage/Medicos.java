package com.miapp.triage.triage;


import java.util.Date;
import java.util.List;


public class Medicos extends Persona{

    private int Matricula;


    private List<Especialidad> Especialidad;

    private List<Estudios> estudios;
    
    private List<BoxAtencion> BoxAtencion;


    private List<Triage> triage;
    

    private List<Consulta> Consulta;

    public Medicos(int Matricula, List<Especialidad> Especialidad, List<BoxAtencion> BoxAtencion, Triage triage, List<Consulta> Consulta, int id, String nombre, String apellido, Date fechaNac, int DNI, int telfijo, int telcelular, String estcivil, String correo) {
        super(id, nombre, apellido, fechaNac, DNI, telfijo, telcelular, estcivil, correo);
        this.Matricula = Matricula;
        this.Especialidad = Especialidad;
        this.BoxAtencion = BoxAtencion;
        this.triage = (List<Triage>) triage;
        this.Consulta = Consulta;
    }
   

    public Medicos() {

    }


    //GETTERS Y SETTERS

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int matricula) {
        Matricula = matricula;
    }

    public List<Especialidad> getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(List<Especialidad> especialidad) {
        Especialidad = especialidad;
    }
    public List<com.miapp.triage.triage.BoxAtencion> getBoxAtencion() {
        return BoxAtencion;
    }

    public void setBoxAtencion(List<com.miapp.triage.triage.BoxAtencion> boxAtencion) {
        BoxAtencion = boxAtencion;
    }
    
    public List<Triage> getTriage() {
        return triage;
    }

    
    public void setTriage(List<Triage> triage) {
        this.triage = triage;
    }

    public List<com.miapp.triage.triage.Consulta> getConsulta() {
        return Consulta;
    }

    public void setConsulta(List<com.miapp.triage.triage.Consulta> consulta) {
        Consulta = consulta;
    }
}
