package com.miapp.triage.triage;

import java.util.Date;

/**
 * Clase de consulta.
 * 
 * @author Ramiro Borgo
 * @author Martin Bourlot
 * @author Fabian Brites
 * @author Juan Fracisco Riveras
 * @author Nicolas Ornetti
 * @version 1.0
 */

public class Consulta  {

    /**El numero de identificacion de la consulta */
    private int id_consulta;
    /**Fecha de la consulta */
    private Date Fecha;
    /**Hora de la consulta */
    private String Hora;
    /**Diagnostico de la consulta */
    private String Diagnostico;
    /**Lugar de la consulta */
    private String Lugar;
    /**Diagnostico clinico de la consulta */
    private String DiagClinico;
    /**Box de atencion asignado */
    private BoxAtencion boxAtencion;
    /**Paciente de la consulta */
    private Paciente consul;
    /**Medico de la consulta*/
    private Medicos medico;
    /**Puntuacion del triage */
    private Triage triage;

    /**
     * 
     * @param id_consul     identificador de la consulta
     * @param fecha         fecha de la consulta
     * @param hora          hora de la consulta
     * @param diagnostico   diagnostico de la consulta
     * @param lugar         lugar de la consulta
     * @param diagClinico   diagnostico clinico de la consulta
     * @param boxatencion   box de atencion asignado
     * @param consu         paciente de la consulta
     * @param triag         puntuacion del triage realizado
     * @param medic         medico de la consulta
     */
    public Consulta(int id_consul,Date fecha, String hora, String diagnostico, String lugar, String diagClinico, BoxAtencion boxatencion, Paciente consu, Triage triag, Medicos medic) {
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

    /**
     * 
     * @return id de la consulta
     */
    public int getId_consulta() {
        return id_consulta;
    }
    /**
     * Permite modificar la id de la consulta por una nueva
     * 
     * @param id_consulta 
     */
    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }

    /**
     * 
     * @return  fecha de consulta 
     */
    public Date getFecha() {
        return Fecha;
    }
    /**
     * Permite modificar la fecha de la consulta por una nueva
     * 
     * @param fecha     
     */
    public void setFecha(Date fecha) {
        Fecha = fecha;
    }
    /**
     * 
     * @return  hora de la consulta 
     */
    public String getHora() {
        return Hora;
    }
    /**
     * Permite modificar la hora de la consulta por una nueva
     * 
     * @param hora 
     */
    public void setHora(String hora) {
        Hora = hora;
    }
    /**
     * 
     * @return  diagnostico de la consulta 
     */
    public String getDiagnostico() {
        return Diagnostico;
    }
    /**
     * Permite modificar el diagnostico por uno nuevo
     * 
     * @param diagnostico 
     */
    public void setDiagnostico(String diagnostico) {
        Diagnostico = diagnostico;
    }
    /**
     * 
     * @return  lugar de la consulta 
     */
    public String getLugar() {
        return Lugar;
    }
    /**
     * Permite modificar el lugar por uno nuevo
     * 
     * @param lugar 
     */
    public void setLugar(String lugar) {
        Lugar = lugar;
    }
    /**
     * 
     * @return  Diagnostico clinico de la consulta 
     */
    public String getDiagClinico() {
        return DiagClinico;
    }
    /**
     * Permite modificar el diagnostico clinico por uno nuevo
     * 
     * @param diagClinico 
     */
    public void setDiagClinico(String diagClinico) {
        DiagClinico = diagClinico;
    }
    /**
     * 
     * @return el box de atencion asignado
     */
    public BoxAtencion getBoxAtencion() {
        return boxAtencion;
    }
    /**
     * Permite modificar el box de atencion por uno nuevo
     * 
     * @param boxAtencion 
     */
    public void setBoxAtencion(BoxAtencion boxAtencion) {
        this.boxAtencion = boxAtencion;
    }
    /**
     * 
     * @return el paciente de la consulta
     */
    public Paciente getConsul() {
        return consul;
    }
    /**
     * Permite modificar el paciente de la consulta por uno nuevo
     * 
     * @param consul    
     */
    public void setConsul(Paciente consul) {
        this.consul = consul;
    }
    /**
     * 
     * @return puntuacion del triage
     */
    public Triage getTriage() {
        return triage;
    }
    /**
     * Permite modificar la puntuacion del triage por una nueva
     * 
     * @param triage 
     */
    public void setTriage(Triage triage) {
        this.triage = triage;
    }
    /**
     * 
     * @return medico de la consulta
     */
    public Medicos getMedico() {
        return medico;
    }
    /**
     * Permite modificar el medico de la consulta por uno nuevo
     * 
     * @param medico 
     */
    public void setMedico(Medicos medico) {
        this.medico = medico;
    }
}
