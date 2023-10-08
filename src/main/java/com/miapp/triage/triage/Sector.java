package com.miapp.triage.triage;
import java.util.List;


public class Sector {

    private String nombre;
    private int Cod;
    private List<FuncionarioAdministrativo> Funadmins;

    public Sector(){

    }

    public Sector(String nombre, int cod, List<FuncionarioAdministrativo> funadmins) {
        this.nombre = nombre;
        Cod = cod;
        Funadmins = funadmins;
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

    public List<FuncionarioAdministrativo> getFunadmin() {
        return Funadmins;
    }

    public void setFunadmin(List<FuncionarioAdministrativo> funadmins) {
        Funadmins = funadmins;
    }
}
