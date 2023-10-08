package com.miapp.triage.triage;


public class Especialidad {

    private String nombre;
    private int Cod;
    private Medicos medico;
    public Especialidad(String nombre, int cod, Medicos medico) {
        this.nombre = nombre;
        this.Cod = cod;
        this.medico = medico;
    }

    public Especialidad(){

    }

    //GETTERS Y SETTERS
    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public int getCod() {

        return Cod;
    }

    public void setCod(int cod) {

        Cod = cod;
    }

    public Medicos getMedicos() {
        return medico;
    }

    public void setMedicos(Medicos medico) {
        this.medico = medico;
    }
}
