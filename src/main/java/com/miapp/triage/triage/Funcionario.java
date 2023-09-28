package com.miapp.triage.triage;
import java.util.Date;
import java.util.List;

public class Funcionario extends Persona{



    private List<Rol> Rol;
    public Funcionario() {
    }

    public Funcionario(String nombre, String apellido, Date fechaNac, int DNI, int telfijo, int telcelular, String estcivil, String correo, List<Rol> rol) {
        super(nombre, apellido, fechaNac, DNI, telfijo, telcelular, estcivil, correo);
        Rol = rol;
    }

    public List<Rol> getRol() {
        return Rol;
    }

    public void setRol(List<Rol> rol) {
        Rol = rol;
    }
}
