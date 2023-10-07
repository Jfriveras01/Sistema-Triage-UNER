package com.miapp.triage.triage;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;


@Entity
public class Funcionario extends Persona implements Serializable{

    public Funcionario() {
    }

    public Funcionario(int id, String nombre, String apellido, Date fechaNac, int DNI, int telfijo, int telcelular, String estcivil, String correo) {
        super(id, nombre, apellido, fechaNac, DNI, telfijo, telcelular, estcivil, correo);
    }

}
