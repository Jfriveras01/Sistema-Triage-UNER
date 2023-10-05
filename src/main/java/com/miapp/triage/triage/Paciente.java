package com.miapp.triage.triage;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Paciente extends Persona implements Serializable{

    private int Numcontacto;

    @OneToMany(mappedBy="informe")
    private List<InfomeEstudios> InformeEstudios;

    @OneToMany(mappedBy="consul")
    private List<Consulta> Consulta;

    @OneToOne
    private Triage triage;
    
    @OneToOne
    private BoxAtencion boxAtencion;
    
    public Paciente() {
    }

    public Paciente(int Numcontacto, List<InfomeEstudios> InformeEstudios, List<Consulta> Consulta, Triage triage, BoxAtencion boxAtencion, int id, String nombre, String apellido, Date fechaNac, int DNI, int telfijo, int telcelular, String estcivil, String correo) {
        super(id, nombre, apellido, fechaNac, DNI, telfijo, telcelular, estcivil, correo);
        this.Numcontacto = Numcontacto;
        this.InformeEstudios = InformeEstudios;
        this.Consulta = Consulta;
        this.triage = triage;
        this.boxAtencion = boxAtencion;
    }

    //GETTERS Y SETTERS
    public int getNumcontacto() {

        return Numcontacto;
    }

    public void setNumcontacto(int numcontacto) {

        Numcontacto = numcontacto;
    }

    public List<InfomeEstudios> getInformeEstudios() {
        return InformeEstudios;
    }

    public void setInformeEstudios(List<InfomeEstudios> informeEstudios) {
        InformeEstudios = informeEstudios;
    }

    public List<Consulta> getConsulta() {
        return Consulta;
    }

    public void setConsulta(List<Consulta> consulta) {
        Consulta = consulta;
    }

    public Triage getTriage() {
        return triage;
    }

    public void setTriage(Triage triage) {
        this.triage = triage;
    }
    public BoxAtencion getBoxAtencion() {
        return boxAtencion;
    }

    public void setBoxAtencion(BoxAtencion boxAtencion) {
        this.boxAtencion = boxAtencion;
    }
}
