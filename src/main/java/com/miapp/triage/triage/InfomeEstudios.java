package com.miapp.triage.triage;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class InfomeEstudios implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_informe;
    private String TipoEstudio;
    @Temporal(TemporalType.DATE)
    private Date FechaEstudio;
    private String InformeRealizado;
    
    @ManyToOne
    @JoinColumn(name="id_informe")
    private Paciente informe;

    public InfomeEstudios(int id_info, String tipoEstudio, Date fechaEstudio, String informeRealizado, Paciente infor) {
        id_informe = id_info;
        TipoEstudio = tipoEstudio;
        FechaEstudio = fechaEstudio;
        InformeRealizado = informeRealizado;
        informe = infor;
    }
    public InfomeEstudios(){

    }

    //GETTERS Y SETTERS

    public int getId_informe() {
        return id_informe;
    }

    public void setId_informe(int id_informe) {
        this.id_informe = id_informe;
    }

    
    
    public String getTipoEstudio() {
        return TipoEstudio;
    }

    public void setTipoEstudio(String tipoEstudio) {
        TipoEstudio = tipoEstudio;
    }

    public Date getFechaEstudio() {
        return FechaEstudio;
    }

    public void setFechaEstudio(Date fechaEstudio) {
        FechaEstudio = fechaEstudio;
    }

    public String getInformeRealizado() {
        return InformeRealizado;
    }

    public void setInformeRealizado(String informeRealizado) {
        InformeRealizado = informeRealizado;
    }

    public Paciente getInforme() {
        return informe;
    }

    public void setInforme(Paciente informe) {
        this.informe = informe;
    }

   

}
