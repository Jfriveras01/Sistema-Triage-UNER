package com.miapp.triage.triage;
import java.util.Date;

/**
 * Clase de funcionario.
 * 
 * @author Ramiro Borgo
 * @author Martin Bourlot
 * @author Fabian Brites
 * @author Juan Fracisco Riveras
 * @author Nicolas Ornetti
 * @version 1.0
 */

public class Funcionario extends Persona {
    /**Sector en el cual se encuentra el funcionario*/
    private String Sector;
    
    public Funcionario() {
    }
    /**
     * 
     * @param Sector       sector
     * @param id           identificador del funcionario
     * @param nombre       nombre del funcionario
     * @param apellido     apellido del funcionario
     * @param FechaNac     fecha de nacimiento
     * @param domicilio    domicilio
     * @param DNI          Documento Nacional de Identificacion
     * @param Telfijo      Numero de Telefono Fijo
     * @param Telcelular   Numero de Celular
     * @param Estcivil     Estado civil
     * @param correo       Correo electronico
     */
    public Funcionario(String Sector, int id, String nombre, String apellido, Date FechaNac, String domicilio, long DNI, long Telfijo, long Telcelular, String Estcivil, String correo) {
        super(id, nombre, apellido, FechaNac, domicilio, DNI, Telfijo, Telcelular, Estcivil, correo);
        this.Sector = Sector;
    }
    
    /**
     * 
     * @return el sector del funcionario
     */
    public String getSector() {
        return Sector;
    }
    
    /**
     * Permite modificar el sector por uno nuevo
     * 
     * @param Sector 
     */
    public void setSector(String Sector) {
        this.Sector = Sector;
    }

   

}
