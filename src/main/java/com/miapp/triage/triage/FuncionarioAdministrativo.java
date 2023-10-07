package com.miapp.triage.triage;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class FuncionarioAdministrativo extends Persona implements Serializable{

    @ManyToOne
    @JoinColumn(name="id_funcionario")
    private Sector sector;

    public FuncionarioAdministrativo() {
    }

    public FuncionarioAdministrativo(Sector sector, int id, String nombre, String apellido, Date fechaNac, int DNI, int telfijo, int telcelular, String estcivil, String correo) {
        super(id, nombre, apellido, fechaNac, DNI, telfijo, telcelular, estcivil, correo);
        this.sector = sector;
    }



    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    //CREAR METODO PARA OBTENER SECTOR DE TRABAJO
}
