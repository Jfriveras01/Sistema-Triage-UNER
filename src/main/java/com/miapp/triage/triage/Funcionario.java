package com.miapp.triage.triage;
import java.util.Date;


public class Funcionario extends Persona {

    public Funcionario() {
    }

    public Funcionario(int id, String nombre, String apellido, Date FechaNac, String domicilio, long DNI, long Telfijo, long Telcelular, String Estcivil, String correo) {
        super(id, nombre, apellido, FechaNac, domicilio, DNI, Telfijo, Telcelular, Estcivil, correo);
    }

    

}
