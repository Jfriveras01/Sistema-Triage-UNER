package com.miapp.triage.triage;
import java.util.Date;


public class Funcionario extends Persona {

    private String Sector;
    
    public Funcionario() {
    }

    public Funcionario(String Sector, int id, String nombre, String apellido, Date FechaNac, String domicilio, long DNI, long Telfijo, long Telcelular, String Estcivil, String correo) {
        super(id, nombre, apellido, FechaNac, domicilio, DNI, Telfijo, Telcelular, Estcivil, correo);
        this.Sector = Sector;
    }

    public String getSector() {
        return Sector;
    }

    public void setSector(String Sector) {
        this.Sector = Sector;
    }

   

}
