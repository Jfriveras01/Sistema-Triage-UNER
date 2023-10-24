package com.miapp.triage.triage;
import java.util.List;

/**
 * Clase del Box de Atencion.
 * 
 * @author Ramiro Borgo
 * @author Martin Bourlot
 * @author Fabian Brites
 * @author Juan Fracisco Riveras
 * @author Nicolas Ornetti
 * @version 1.0
 */

public class BoxAtencion  {

    /** id del box de atencion */
    private int id_box;
    /** Estado en el que se encuentra el box */
    private boolean Estado;
    /**Listado de medicos*/
    private List<Medicos> Medicos;
    /** Consultas realizadas */
    private List<Consulta> Consulta;
    /** Paciente a ser atentido */
    private Paciente paciente;

    /**
     * 
     * @param id        identificador del box
     * @param estado    estado del box
     * @param medicos   medicos asignados al box
     * @param consulta  consultas generadas
     * @param pacient   paciente en espera
     */
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
    
    /**
     * @return identificador del box
     */
    public int getId_box() {
        return id_box;
    }

    /**
     * Permite modificar el id por una nueva
     * 
     * @param ID
     */
    public void setId_box(int ID) {
        this.id_box = ID;
    }

    /**
     * @return el estado del box
     */
    public boolean isEstado() {
        return Estado;
    }

    /**
     * Permite modificar el estado por uno nuevo
     * 
     * @param estado
     */
    public void setEstado(boolean estado) {
        Estado = estado;
    }

    /**
     * @return los medicos asignados para el box
     */
    public List<Medicos> getMedicos() {
        return Medicos;
    }

    /**
     * Permite modificar el medico por uno nuevo
     * 
     * @param medicos
     */
    public void setMedicos(List<Medicos> medicos) {
        Medicos = medicos;
    }
    
    /**
     * @return la consulta para el box
     */
    public List<Consulta> getConsulta() {
        return Consulta;
    }

    /**
     * Permite modificar la consulta por una nueva
     * 
     * @param consulta
     */
    public void setConsulta(List<Consulta> consulta) {
        Consulta = consulta;
    }
    
    /**
     * @return el paciente en espera del box
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * Permite modificar el paciente por uno nuevo
     * 
     * @param paciente
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    /**
     * 
     * @return Si el estado esta disponible u ocupado
     */
    public boolean estaOcupado() {
    return Estado;
    }
}
