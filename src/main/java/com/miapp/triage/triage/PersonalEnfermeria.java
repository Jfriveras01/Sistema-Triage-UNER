package com.miapp.triage.triage;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;


@Entity
public class PersonalEnfermeria extends Persona implements Serializable {

    
    public PersonalEnfermeria(int id, String nombre, String apellido, Date fechaNac, int DNI, int telfijo, int telcelular, String estcivil, String correo) {
        super(id, nombre, apellido, fechaNac, DNI, telfijo, telcelular, estcivil, correo);
    }
    
    
    private List<Triage> triage;

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
