package com.miapp.triage.triage;
import java.util.List;
import javax.persistence.OneToMany;
public class Rol {

    private int id;
    private String NombreRol;
    private String Descripcion;
    private List<Funcionario> Funcionario;
    @OneToMany
    private List<Usuarios> Usuarios;

    public Rol(int id,String NombreRol, String descripcion, List<Funcionario> funcionario, List<Usuarios> usuarios) {
        this.id = id;
        this.NombreRol = NombreRol;
        Descripcion = descripcion;
        Funcionario = funcionario;
        Usuarios = usuarios;
    }

    public Rol(){

    }

    //GETTERS Y SETTERS

    public List<Usuarios> getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(List<Usuarios> Usuarios) {
        this.Usuarios = Usuarios;
    }
    

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
