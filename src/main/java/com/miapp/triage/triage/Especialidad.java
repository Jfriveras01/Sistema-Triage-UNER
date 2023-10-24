package com.miapp.triage.triage;

/**
 * Clase de la especialidad.
 * 
 * @author Ramiro Borgo
 * @author Martin Bourlot
 * @author Fabian Brites
 * @author Juan Fracisco Riveras
 * @author Nicolas Ornetti
 * @version 1.0
 */

public class Especialidad {

    /**Nombre de la especialidad*/
    private String nombre;
    /**Codigo de la especialidad*/
    private int Cod;
    /**Medico vinculado a la especialidad*/
    private Medicos medico;
    /**
     * 
     * @param nombre        Nombre de la especialidad
     * @param cod           Codigo de la especialidad
     * @param medico        Medico vinculado a la especialidad
     */
    public Especialidad(String nombre, int cod, Medicos medico) {
        this.nombre = nombre;
        this.Cod = cod;
        this.medico = medico;
    }

    public Especialidad(){

    }

    //GETTERS Y SETTERS
    /**
     * 
     * @return nombre de la especialidad
     */
    public String getNombre() {

        return nombre;
    }
    /**
     * Permite modificar el nombre de la especialidad por uno nuevo
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {

        this.nombre = nombre;
    }
    /**
     * 
     * @return codigo de la especialidad
     */
    public int getCod() {

        return Cod;
    }
    /**
     * Permite modificar el codigo por uno nuevo
     * 
     * @param cod 
     */
    public void setCod(int cod) {

        Cod = cod;
    }
    /**
     * 
     * @return medico especializado
     */
    public Medicos getMedicos() {
        return medico;
    }
    /**
     * Permite modificar el medico con la especialidad por uno nuevo
     * 
     * @param medico 
     */
    public void setMedicos(Medicos medico) {
        this.medico = medico;
    }
}
