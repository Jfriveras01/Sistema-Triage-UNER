package com.miapp.triage.triage;

import java.util.Date;





public class FuncionarioAdministrativo extends Persona {


    private Sector sector;

    public FuncionarioAdministrativo() {
    }

    public FuncionarioAdministrativo(Sector sector, int id, String nombre, String apellido, Date FechaNac, String domicilio, long DNI, long Telfijo, long Telcelular, String Estcivil, String correo) {
        super(id, nombre, apellido, FechaNac, domicilio, DNI, Telfijo, Telcelular, Estcivil, correo);
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
