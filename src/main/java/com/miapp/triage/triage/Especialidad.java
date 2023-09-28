package com.miapp.triage.triage;
import java.util.List;
public class Especialidad {

    private String nombre;
    private int Cod;

    private List<Medicos> Medicos;

    public Especialidad(String nombre, int cod, List<Medicos> medicos) {
        this.nombre = nombre;
        Cod = cod;
        Medicos = medicos;
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

    public List<Medicos> getMedicos() {
        return Medicos;
    }

    public void setMedicos(List<Medicos> medicos) {
        Medicos = medicos;
    }
}
