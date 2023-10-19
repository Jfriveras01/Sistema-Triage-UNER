package com.miapp.triage.triage;
import java.util.Date;
import java.util.List;


public class Paciente extends Persona {

    private int Numcontacto;
    private String Motivo;
    private List<InfomeEstudios> InformeEstudios;
    private List<Consulta> Consulta;
    private Triage triage;
    private BoxAtencion boxAtencion;
    
    public Paciente() {
    }

    public Paciente(int Numcontacto, String Motivo, List<InfomeEstudios> InformeEstudios, List<Consulta> Consulta, Triage triage, BoxAtencion boxAtencion, int id, String nombre, String apellido, Date FechaNac, String domicilio, long DNI, long Telfijo, long Telcelular, String Estcivil, String correo) {
        super(id, nombre, apellido, FechaNac, domicilio, DNI, Telfijo, Telcelular, Estcivil, correo);
        this.Numcontacto = Numcontacto;
        this.Motivo = Motivo;
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

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String Motivo) {
        this.Motivo = Motivo;
    }
    
    
    
    @Override
    public String toString() {
        return "Paciente{" + "Nombre=" + getNombre() + ", Apellido=" + getApellido() + ", Fecha de nacimiento=" + getFechaNac() + ", DNI=" + getDNI() + ", Telefono fijo=" + getTelfijo() + ", Telefono celular=" + getTelcelular() + ", Estado Civil=" + getEstcivil() + ", Correo electronico=" + getCorreo() + ",id=" + getId() +  '}';
    }
}
