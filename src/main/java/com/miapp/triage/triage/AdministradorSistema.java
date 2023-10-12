package com.miapp.triage.triage;
import java.util.Date;


public class AdministradorSistema extends Persona {


    public AdministradorSistema() {

    }

    public AdministradorSistema(int id, String nombre, String apellido, Date FechaNac, String domicilio, long DNI, long Telfijo, long Telcelular, String Estcivil, String correo) {
        super(id, nombre, apellido, FechaNac, domicilio, DNI, Telfijo, Telcelular, Estcivil, correo);
    }


   
}
