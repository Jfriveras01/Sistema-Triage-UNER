package com.miapp.triage.triage;
import java.util.Date;
import java.util.List;

public class AdministradorSistema extends Funcionario{


    public AdministradorSistema() {

    }

    public AdministradorSistema(String nombre, String apellido, Date fechaNac, int DNI, int telfijo, int telcelular, String estcivil, String correo, List<com.miapp.triage.triage.Rol> rol) {
        super(nombre, apellido, fechaNac, DNI, telfijo, telcelular, estcivil, correo, rol);
    }
}