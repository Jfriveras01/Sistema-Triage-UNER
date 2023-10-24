package com.miapp.triage.triage;

import java.util.Date;


/**
 * Clase de Funcionario Administrativo.
 * 
 * @author Ramiro Borgo
 * @author Martin Bourlot
 * @author Fabian Brites
 * @author Juan Fracisco Riveras
 * @author Nicolas Ornetti
 * @version 1.0
 */


public class FuncionarioAdministrativo extends Persona {

    /**Sector del funcionario administrativo*/
    private Sector sector;

    public FuncionarioAdministrativo() {
    }
    /**
     * 
     * @param sector        sector del funcionario administrativo
     * @param id            identificador del funcionario
     * @param nombre        nombre
     * @param apellido      apellido
     * @param FechaNac      fecha de nacimiento
     * @param domicilio     domicilio   
     * @param DNI           Documento Nacional de Identificacion
     * @param Telfijo       Numero de Telefono Fijo
     * @param Telcelular    Numero de celular
     * @param Estcivil      Estado Civil
     * @param correo        Correo electronico
     */
    public FuncionarioAdministrativo(Sector sector, int id, String nombre, String apellido, Date FechaNac, String domicilio, long DNI, long Telfijo, long Telcelular, String Estcivil, String correo) {
        super(id, nombre, apellido, FechaNac, domicilio, DNI, Telfijo, Telcelular, Estcivil, correo);
        this.sector = sector;
    }

    /**
     * 
     * @return el sector del funcionario
     */
    public Sector getSector() {
        return sector;
    }
    /**
     * Permite modificar el sector del funcionario por uno nuevo
     * 
     * @param sector 
     */
    public void setSector(Sector sector) {
        this.sector = sector;
    }

    //CREAR METODO PARA OBTENER SECTOR DE TRABAJO
}
