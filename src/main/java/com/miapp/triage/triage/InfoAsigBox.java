package com.miapp.triage.triage;

import java.util.Date;

/**
 * Clase de la informacion del box.
 * 
 * @author Ramiro Borgo
 * @author Martin Bourlot
 * @author Fabian Brites
 * @author Juan Fracisco Riveras
 * @author Nicolas Ornetti
 * @version 1.0
 */

public class InfoAsigBox {
    /**Hora para el box*/
    private int hora;
    /**Fecha para el box*/
    private Date fecha;
    /**
     * 
     * @param hora      hora
     * @param fecha     fecha
     */
    public InfoAsigBox(int hora, Date fecha) {
        this.hora = hora;
        this.fecha = fecha;
    }

    public InfoAsigBox(){

    }
    /**
     * 
     * @return hora
     */
    public int getHora() {
        return hora;
    }
    /**
     * Permite modificar la hora por una nueva
     * 
     * @param hora 
     */
    public void setHora(int hora) {
        this.hora = hora;
    }
    /**
     * 
     * @return fecha
     */
    public Date getFecha() {
        return fecha;
    }
    /**
     * Permite modificar la fecha por una nueva
     * 
     * @param fecha 
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
