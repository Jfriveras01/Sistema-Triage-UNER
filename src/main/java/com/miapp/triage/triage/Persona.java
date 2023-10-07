package com.miapp.triage.triage;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Persona implements Serializable  {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
    @Temporal(TemporalType.DATE)
    private Date FechaNac;
    private int DNI;
    private int Telfijo;
    private int Telcelular;
    private String Estcivil;
    private String correo;

    public Persona(int id, String nombre, String apellido, Date fechaNac, int DNI, int telfijo, int telcelular, String estcivil, String correo) {
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
