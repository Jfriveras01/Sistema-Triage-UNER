package com.miapp.triage.triage;

import java.util.Date;
import java.util.List;
public class Paciente extends Persona{

    private int Numcontacto;

    private List<InfomeEstudios> InformeEstudios;

    private List<Consulta> Consulta;

    private Triage triage;
    private BoxAtencion boxAtencion;
    public Paciente() {
    }

    public Paciente(String nombre, String apellido, Date fechaNac, int DNI, int telfijo, int telcelular, String estcivil, String correo, int numcontacto, List<InfomeEstudios> informeEstudios, List<Consulta> consulta, Triage triag, BoxAtencion boxatencion) {
        super(nombre, apellido, fechaNac, DNI, telfijo, telcelular, estcivil, correo);
        Numcontacto = numcontacto;
        InformeEstudios = informeEstudios;
        Consulta = consulta;
        triage = triag;
        boxAtencion = boxatencion;
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
