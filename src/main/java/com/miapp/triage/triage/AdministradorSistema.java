package com.miapp.triage.triage;
import java.util.Date;


public class AdministradorSistema extends Persona {


    public AdministradorSistema() {

    }

    public AdministradorSistema(int id, String nombre, String apellido, Date fechaNac, int DNI, int telfijo, int telcelular, String estcivil, String correo) {
        super(id, nombre, apellido, fechaNac, DNI, telfijo, telcelular, estcivil, correo);
    }

   
}
