package com.miapp.triage.triage;

import java.util.Date;


public class Persona  {

    private int id;
    private String nombre;
    private String apellido;
    private Date FechaNac;
    private long DNI;
    private long Telfijo;
    private long Telcelular;
    private String Estcivil;
    private String correo;

    public Persona(int id, String nombre, String apellido, Date FechaNac, long DNI, long Telfijo, long Telcelular, String Estcivil, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.FechaNac = FechaNac;
        this.DNI = DNI;
        this.Telfijo = Telfijo;
        this.Telcelular = Telcelular;
        this.Estcivil = Estcivil;
        this.correo = correo;
    }

    
    

    public Persona(){

    }

    //GETTERS Y SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public void setFechaNac(Date FechaNac) {
        this.FechaNac = FechaNac;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public long getTelfijo() {
        return Telfijo;
    }

    public void setTelfijo(long Telfijo) {
        this.Telfijo = Telfijo;
    }

    public long getTelcelular() {
        return Telcelular;
    }

    public void setTelcelular(long Telcelular) {
        this.Telcelular = Telcelular;
    }

    public String getEstcivil() {
        return Estcivil;
    }

    public void setEstcivil(String Estcivil) {
        this.Estcivil = Estcivil;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", FechaNac=" + FechaNac + ", DNI=" + DNI + ", Telfijo=" + Telfijo + ", Telcelular=" + Telcelular + ", Estcivil=" + Estcivil + ", correo=" + correo + '}';
    }

    
    

}
