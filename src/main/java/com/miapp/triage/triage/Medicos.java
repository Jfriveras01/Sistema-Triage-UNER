package com.miapp.triage.triage;

import java.util.Date;
import java.util.List;

/**
 * Clase de Médicos.
 * 
 * @author Ramiro Borgo
 * @author Martin Bourlot
 * @author Fabian Brites
 * @author Juan Fracisco Riveras
 * @author Nicolas Ornetti
 * @version 1.0
 */

public class Medicos extends Persona{
    /**Número de matrícula*/
    private int Matricula;
    /**Lista que proporciona las especialidades*/
    private List<Especialidad> Especialidad;
    /** Lista que muestra los estudios*/
    private List<Estudios> estudios;
    /** Lista de los boxes de atención*/
    private List<BoxAtencion> BoxAtencion;
    /** Lista de los triages*/
    private List<Triage> triage;
    /** Lista de consultas*/
    private List<Consulta> Consulta;

    /**
     * 
     * @param Matricula     Número de matrícula
     * @param Especialidad  Especialidad del médico
     * @param estudios      Estudios del médico
     * @param BoxAtencion   Número del box proporcionado al médico
     * @param triage        Triage realizado
     * @param Consulta      Consulta
     * @param id            Identificador del médico
     * @param nombre        Nombre del médico
     * @param apellido      Apellido del médico
     * @param FechaNac      Fecha de nacimiento del médico
     * @param domicilio     Domicilio del médico
     * @param DNI           Número de documento del médico
     * @param Telfijo       Teléfono fijo
     * @param Telcelular    Teléfono celular
     * @param Estcivil      Estado civil
     * @param correo        Correo electrónico del médico
     */
    public Medicos(int Matricula, List<Especialidad> Especialidad, List<Estudios> estudios, List<BoxAtencion> BoxAtencion, List<Triage> triage, List<Consulta> Consulta, int id, String nombre, String apellido, Date FechaNac, String domicilio, long DNI, long Telfijo, long Telcelular, String Estcivil, String correo) {
        super(id, nombre, apellido, FechaNac, domicilio, DNI, Telfijo, Telcelular, Estcivil, correo);
        this.Matricula = Matricula;
        this.Especialidad = Especialidad;
        this.estudios = estudios;
        this.BoxAtencion = BoxAtencion;
        this.triage = triage;
        this.Consulta = Consulta;
    }

    /** Constructor por defecto de Medicos*/
    public Medicos() {

    }


    //GETTERS Y SETTERS
    
    /** Retorna la matrícula del médico*/
    public int getMatricula() {
        return Matricula;
    }
    /** Permite modificar la matrícula del médico*/
    public void setMatricula(int matricula) {
        Matricula = matricula;
    }
    /**Retorna la lista de especialidades del médico*/
    public List<Especialidad> getEspecialidad() {
        return Especialidad;
    }
    /** Permite modificar la especialidad del médico*/
    public void setEspecialidad(List<Especialidad> especialidad) {
        Especialidad = especialidad;
    }
    /** Retorna el box de atención al médico*/
    public List<com.miapp.triage.triage.BoxAtencion> getBoxAtencion() {
        return BoxAtencion;
    }
    /** Permite modificar el box de atención*/
    public void setBoxAtencion(List<com.miapp.triage.triage.BoxAtencion> boxAtencion) {
        BoxAtencion = boxAtencion;
    }
    /** Retorna el triage*/
    public List<Triage> getTriage() {
        return triage;
    }
    /**
     * Permite modificar la lista de Triage
     * @param triage 
     */
    public void setTriage(List<Triage> triage) {
        this.triage = triage;
    }
    /** Retorna la lista de consultas*/
    public List<com.miapp.triage.triage.Consulta> getConsulta() {
        return Consulta;
    }
    /** Permite modificar la consulta*/
    public void setConsulta(List<com.miapp.triage.triage.Consulta> consulta) {
        Consulta = consulta;
    }
}
