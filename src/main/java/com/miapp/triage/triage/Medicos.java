package com.miapp.triage.triage;

import java.util.Date;
import java.util.List;

public class Medicos extends Funcionario{

    private int Matricula;

    private List<Especialidad> Especialidad;

    private List<BoxAtencion> BoxAtencion;

    private Triage triage;

    private List<Consulta> Consulta;
        
    public Medicos(int id, String nombre, String apellido, Date fechaNac, int DNI, int telfijo, int telcelular, String estcivil, String correo, List<Rol> Rol, int matricula, List<Especialidad> especialidad, List<BoxAtencion> boxAtencion, Triage triag, List<Consulta> consulta) {
        super(id, nombre, apellido, fechaNac, DNI, telfijo, telcelular, estcivil, correo, Rol);
        Matricula = matricula;
        Especialidad = especialidad;
        BoxAtencion = boxAtencion;
        triage = triag;
        Consulta = consulta; 
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
    public Triage getTriage() {
        return triage;
    }

    public void setTriage(Triage triage) {
        this.triage = triage;
    }

    public List<com.miapp.triage.triage.Consulta> getConsulta() {
        return Consulta;
    }

    public void setConsulta(List<com.miapp.triage.triage.Consulta> consulta) {
        Consulta = consulta;
    }
}
