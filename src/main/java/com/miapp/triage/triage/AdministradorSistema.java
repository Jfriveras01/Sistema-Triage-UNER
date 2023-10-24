package com.miapp.triage.triage;
import java.util.Date;

/**
 * Clase de Administrador del Sistema.
 * 
 * @author Ramiro Borgo
 * @author Martin Bourlot
 * @author Fabian Brites
 * @author Juan Fracisco Riveras
 * @author Nicolas Ornetti
 * @version 1.0
 */

public class AdministradorSistema extends Persona {

    /** Rol de Administrador de Sistemas. */
    public AdministradorSistema() {

    }
    
     /**
     * Crea una nueva instancia de la clase.
     * 
     * @param id                id
     * @param nombre            nombre
     * @param apellido          apellido
     * @param FechaNac          fecha de nacimiento
     * @param domicilio         domicilio
     * @param DNI               Documento Nacional de identidad
     * @param Telfijo           numero de telefono fijo
     * @param Telcelular        numero de celular
     * @param Estcivil          estado civil
     * @param correo            correo electronico
     */

    public AdministradorSistema(int id, String nombre, String apellido, Date FechaNac, String domicilio, long DNI, long Telfijo, long Telcelular, String Estcivil, String correo) {
        super(id, nombre, apellido, FechaNac, domicilio, DNI, Telfijo, Telcelular, Estcivil, correo);
    }


   
}
