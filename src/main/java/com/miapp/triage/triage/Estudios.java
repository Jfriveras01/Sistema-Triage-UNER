package com.miapp.triage.triage;
import java.util.Date;

/**
 * Clase de los estudios del medico.
 * 
 * @author Ramiro Borgo
 * @author Martin Bourlot
 * @author Fabian Brites
 * @author Juan Fracisco Riveras
 * @author Nicolas Ornetti
 * @version 1.0
 */

public class Estudios {
    
    /**fecha del titulo*/
    private Date Fechatit;
    /**Universidad del medico*/
    private String Universidad;
    /**Medico vinculado a los estudios*/
    private Medicos medicos;
    
    /**
     * 
     * @param Fechatit      Fecha del titulo
     * @param Universidad   Universidad de los estudios
     * @param medicos       Medico que cuenta con los estudios
     */
    public Estudios(Date Fechatit, String Universidad, Medicos medicos) {
        this.Fechatit = Fechatit;
        this.Universidad = Universidad;
        this.medicos = medicos;
    }
    
    

    public Estudios(){

    }

    //GETTERS Y SETTERS

    /**
     * 
     * @return  fecha del titulo
     */
    public Date getFechatit() {
        return Fechatit;
    }
    /**
     * Permite modificar la fecha por una nueva
     * 
     * @param Fechatit 
     */
    public void setFechatit(Date Fechatit) {
        this.Fechatit = Fechatit;
    }
    /**
     * 
     * @return universidad del titulo
     */
    public String getUniversidad() {
        return Universidad;
    }
    /**
     * Permite modificar la universidad por una nueva
     * 
     * @param Universidad 
     */
    public void setUniversidad(String Universidad) {
        this.Universidad = Universidad;
    }
    /**
     * 
     * @return medico del titulo
     */
    public Medicos getMedicos() {
        return medicos;
    }
    /**
     * Permite modificar el medico por uno nuevo
     * 
     * @param medico 
     */
    public void setMedicos(Medicos medico) {
        this.medicos = medico;
    }

 
    
    
}
