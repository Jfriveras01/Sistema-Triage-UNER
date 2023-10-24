package com.miapp.triage.triage;
import java.util.Date;
import java.util.List;

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

public class PersonalEnfermeria extends Persona {

    private List<Triage> triage;
    
    public PersonalEnfermeria(List<Triage> triage, int id, String nombre, String apellido, Date FechaNac, String domicilio, long DNI, long Telfijo, long Telcelular, String Estcivil, String correo) {
        super(id, nombre, apellido, FechaNac, domicilio, DNI, Telfijo, Telcelular, Estcivil, correo);
        this.triage = triage;
    }
    

    public PersonalEnfermeria(Triage triage) {
        this.triage = (List<Triage>) triage;
    }
    public PersonalEnfermeria(){
    }

    public List<Triage> getTriage() {
        return triage;
    }

    public void setTriage(Triage triage) {
        this.triage = (List<Triage>) triage;
    }
}
