package com.miapp.triage.triage;
import java.util.Date;
import java.util.List;

/**
 * Clase de PersonalEnfermeria
 * 
 * @author Ramiro Borgo
 * @author Martin Bourlot
 * @author Fabian Brites
 * @author Juan Fracisco Riveras
 * @author Nicolas Ornetti
 * @version 1.0
 */

public class PersonalEnfermeria extends Persona {
    /** Lista de los triage realizados*/
    private List<Triage> triage;
    /**
     * Crea una instancia nueva de PersonalEnfermeria
     * @param triage    Triage realizado
     * @param id        Identificador del personal de enfermeria
     * @param nombre    Nombre del personal de enfermeria
     * @param apellido  Apellido del personal de enfermeria
     * @param FechaNac  Fecha de nacimiento del persona de enfermeria
     * @param domicilio Domicilio del personal de enfermeria
     * @param DNI       Número de documento del personal de enfermeria
     * @param Telfijo   Número del teléfono fijo del personal de enfermeria
     * @param Telcelular Número del teléfono celular del personal de enfermeria
     * @param Estcivil  Estado civil del personal de enfermeria
     * @param correo    Correo electrónico del personal de enfermeria
     */
    public PersonalEnfermeria(List<Triage> triage, int id, String nombre, String apellido, Date FechaNac, String domicilio, long DNI, long Telfijo, long Telcelular, String Estcivil, String correo) {
        super(id, nombre, apellido, FechaNac, domicilio, DNI, Telfijo, Telcelular, Estcivil, correo);
        this.triage = triage;
    }
    
    /**
     * Triage realizado por el personal de enfermeria
     * @param triage 
     */
    public PersonalEnfermeria(Triage triage) {
        this.triage = (List<Triage>) triage;
    }
    /** Constructor por defecto de PersonalEnfermeria*/
    public PersonalEnfermeria(){
    }
    /** Retorna la lista de triages realizados por el personal de enfermeria*/
    public List<Triage> getTriage() {
        return triage;
    }
    /**
     * Permite modificar el triage realizado por el personal de enfermeria
     * @param triage 
     */
    public void setTriage(Triage triage) {
        this.triage = (List<Triage>) triage;
    }
}
