package com.miapp.triage.triage;
import java.util.List;
public class Rol {

    private String Descripcion;
    private List<Funcionario> Funcionario;

    public Rol(String descripcion, List<Funcionario> funcionario) {
        Descripcion = descripcion;
        Funcionario = funcionario;
    }

    public Rol(){

    }

    //GETTERS Y SETTERS

    public String getDescripcion() {

        return Descripcion;
    }

    public void setDescripcion(String descripcion) {

        Descripcion = descripcion;
    }

    public List<Funcionario> getFuncionario() {
        return Funcionario;
    }

    public void setFuncionario(List<Funcionario> funcionario) {
        Funcionario = funcionario;
    }
}
