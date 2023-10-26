package com.miapp.triage.triage;
import java.util.List;

/**
 * Clase de Sector
 * 
 * @author Ramiro Borgo
 * @author Martin Bourlot
 * @author Fabian Brites
 * @author Juan Fracisco Riveras
 * @author Nicolas Ornetti
 * @version 1.0
 */

public class Sector {
    /** Nombre del sector*/
    private String nombre;
    /** Número del código de sector*/
    private int Cod;
    /** Lista de funcionarios administrativos de sector*/
    private List<FuncionarioAdministrativo> Funadmins;

    /** Constructor por defecto de Sector*/
    public Sector(){

    }
    /**
     * Crea una nueva instancia de Sector
     * @param nombre
     * @param cod
     * @param funadmins 
     */
    public Sector(String nombre, int cod, List<FuncionarioAdministrativo> funadmins) {
        this.nombre = nombre;
        Cod = cod;
        Funadmins = funadmins;
    }

    //GETTERS Y SETTERS
    /** Retorna el nombre del secto
     * @return r*/
    public String getNombre() {

        return nombre;
    }
    /**
     * Permite modificar el nombre del sector
     * @param nombre 
     */
    public void setNombre(String nombre) {

        this.nombre = nombre;
    }
    /** Retorna el código de secto
     * @return r*/
    public int getCod() {

        return Cod;
    }
    /**
     * Permite modificar el código de sector
     * @param cod 
     */
    public void setCod(int cod) {

        Cod = cod;
    }
    /** Retorna la lista de funcionarios administrativos de secto
     * @return r*/
    public List<FuncionarioAdministrativo> getFunadmin() {
        return Funadmins;
    }
    /**
     * Permite modificar la lista de funcionarios administrativos de sector
     * @param funadmins 
     */
    public void setFunadmin(List<FuncionarioAdministrativo> funadmins) {
        Funadmins = funadmins;
    }
}
