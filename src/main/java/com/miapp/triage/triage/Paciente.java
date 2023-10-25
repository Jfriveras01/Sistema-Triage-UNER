package com.miapp.triage.triage;
import java.util.Date;
import java.util.List;

/**
 * Clase de Paciente.
 * 
 * @author Ramiro Borgo
 * @author Martin Bourlot
 * @author Fabian Brites
 * @author Juan Fracisco Riveras
 * @author Nicolas Ornetti
 * @version 1.0
 */

public class Paciente extends Persona {
    /**Numero de contacto del paciente*/
    private int Numcontacto;
    /** Motivo de la consulta*/
    private String Motivo;
    /** Lista de los estudios realizados */
    private List<InfomeEstudios> InformeEstudios;
    /** Lista de las consultas realizadas*/
    private List<Consulta> Consulta;
    /** Triage*/
    private Triage triage;
    /** Box a ser atendido*/
    private BoxAtencion boxAtencion;
    
    /** Constructor por defecto de Paciente*/
    public Paciente() {
    }
    /**
     * 
     * @param Numcontacto   Número de contacto del paciente
     * @param Motivo        Motivo de la consulta
     * @param InformeEstudios   Informe de los estudios realizados
     * @param Consulta      Consulta 
     * @param triage        Triage del paciente
     * @param boxAtencion   Box de atención designado
     * @param id            Identificador del paciente
     * @param nombre        Nombre del paciente 
     * @param apellido      Apellido del paciente
     * @param FechaNac      Fecha de nacimiento del paciente
     * @param domicilio     Domicilio del paciente
     * @param DNI           Número de documento del paciente
     * @param Telfijo       Teléfono fijo de contacto
     * @param Telcelular    Teléfono celular de contacto
     * @param Estcivil      Estado civil del paciente
     * @param correo        Correo electrónico del paciente
     */
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
    /** Retorna el número de contacto del paciente*/
    public int getNumcontacto(){
        return Numcontacto;
    }
    /** Permite modificar el número de contacto del paciente*/
    public void setNumcontacto(int numcontacto){
        Numcontacto = numcontacto;
    }
    /** Retorna la lista de informes*/
    public List<InfomeEstudios> getInformeEstudios() {
        return InformeEstudios;
    }
    /** Permite modificar el informe de estudios*/
    public void setInformeEstudios(List<InfomeEstudios> informeEstudios) {
        InformeEstudios = informeEstudios;
    }
    /** Retorna la lista de consultas realizadas al paciente*/
    public List<Consulta> getConsulta() {
        return Consulta;
    }
    /** Permite modificar la lista de consultas*/
    public void setConsulta(List<Consulta> consulta) {
        Consulta = consulta;
    }
    /** Retorna el triage realizado al paciente*/
    public Triage getTriage() {
        return triage;
    }
    /**
     * Permite modificar el triage
     * @param triage 
     */
    public void setTriage(Triage triage) {
        this.triage = triage;
    }
    /** Retorna el box de atención del paciente*/
    public BoxAtencion getBoxAtencion() {
        return boxAtencion;
    }
    /**
     * Permite modificar el box de atención
     * @param boxAtencion 
     */
    public void setBoxAtencion(BoxAtencion boxAtencion) {
        this.boxAtencion = boxAtencion;
    }
    /** Retorna el motivo de consulta del paciente*/
    public String getMotivo() {
        return Motivo;
    }
    /**
     * Permite modificar el motivo de consulta del paciente
     * @param Motivo 
     */
    public void setMotivo(String Motivo) {
        this.Motivo = Motivo;
    }
    
    
    
    @Override
    /** Convierte los atributos de la clase paciente a formarto String*/
    /** @return Representación en String de los atributos del paciente*/
    public String toString() {
        return "Paciente{" + "Nombre=" + getNombre() + ", Apellido=" + getApellido() + ", Fecha de nacimiento=" + getFechaNac() + ", DNI=" + getDNI() + ", Telefono fijo=" + getTelfijo() + ", Telefono celular=" + getTelcelular() + ", Estado Civil=" + getEstcivil() + ", Correo electronico=" + getCorreo() + ",id=" + getId() +  '}';
    }
}
