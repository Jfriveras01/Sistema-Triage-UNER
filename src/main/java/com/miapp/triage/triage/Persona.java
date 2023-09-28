package com.miapp.triage.triage;
import java.util.Date;

public class Persona {


    private String nombre;
    private String apellido;



    private Date FechaNac;
    private int DNI;
    private int Telfijo;
    private int Telcelular;
    private String Estcivil;
    private String correo;

    public Persona(String nombre, String apellido, Date fechaNac, int DNI, int telfijo, int telcelular, String estcivil, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        FechaNac = fechaNac;
        this.DNI = DNI;
        Telfijo = telfijo;
        Telcelular = telcelular;
        Estcivil = estcivil;
        this.correo = correo;
    }

    public Persona(){

    }

    //GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        FechaNac = fechaNac;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getTelfijo() {
        return Telfijo;
    }

    public void setTelfijo(int telfijo) {
        Telfijo = telfijo;
    }

    public int getTelcelular() {
        return Telcelular;
    }

    public void setTelcelular(int telcelular) {
        Telcelular = telcelular;
    }

    public String getEstcivil() {
        return Estcivil;
    }

    public void setEstcivil(String estcivil) {
        Estcivil = estcivil;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


}
