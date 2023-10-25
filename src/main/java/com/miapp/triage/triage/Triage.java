package com.miapp.triage.triage;
import java.io.Serializable;
import java.util.Date;

/**
 * Clase de Triage.
 * 
 * @author Ramiro Borgo
 * @author Martin Bourlot
 * @author Fabian Brites
 * @author Juan Fracisco Riveras
 * @author Nicolas Ornetti
 * @version 1.0
 */

public class Triage implements Serializable {
    /** Identificador del triage*/
    private int id_triage;
    /** Puntuación recibida de la respiración del triage*/
    private int PuntuacionRespiracion;
    /** Puntuación recibida del pulso de triage*/
    private int PuntuacionPulso;
    /** Puntuación recibida del estado mental de triage*/
    private int PuntuacionEstMental;
    /** Puntuación recibida de conciencia de triage*/
    private int PuntuacionConciencia;
    /** Puntuación recibida de dolores respiratorios de triage*/
    private int PuntuacionDolResp;
    /** Puntuación recibida de lesiones graves de triage*/
    private int PuntuacionLesGraves;
    /** Puntuación recibida de edad*/
    private int PuntuacionEdad;
    /** Puntuación recibida de fiebre de triage*/
    private int PuntuacionFiebre;
    /** Puntuación recibida de vómitos de triage*/
    private int PuntuacionVomitos;
    /** Puntuación recibida de dolor abdominal de triage*/
    private int PuntuacionDolAbdominal;
    /** Puntuación recibida de signos de shock de triage*/
    private int PuntuacionSignosShock;
    /** Puntuación recibida de lesiones leves de triage*/
    private int PuntuacionLesLeves;
    /** Puntuación recibida de sangrado de triage*/
    private int PuntuacionSangrado;
    /** Resultado de color asignado de triage*/
    private String ColorAsignado;
    /** Motivo del cambio de urgencia*/
    private String MotivoCambio;
    /** Fecha de cambio de triage*/
    private int FechaCambio;
    /** Hora de cambio de triage*/
    private int HoraDelCambio;
    /** Paciente de la clase Paciente*/
    private Paciente paciente;
    /** consulta de la clase Consulta*/
    private Consulta consulta;
    /** enfermero de personal de enfermeria*/
    private PersonalEnfermeria enfermero;
    /** Medico de la clase Medicos*/
    private Medicos Medico;
    /** Puntuación total del triage*/
    private int puntuacion;
    /** Tiempo de espera asignado en triage*/
    private String tiempoespera;
    /** Tipo de urgencia asignado en triage*/
    private String tipourgencia;
    /** Fecha*/
    Date fecha;

    
    /**
     * Crea una nueva instancia de triage
     * @param id_triage                 Identificador de triage
     * @param PuntuacionRespiracion     Puntuación de respiración
     * @param PuntuacionPulso
     * @param PuntuacionEstMental
     * @param PuntuacionConciencia
     * @param PuntuacionDolResp
     * @param PuntuacionLesGraves
     * @param PuntuacionEdad
     * @param PuntuacionFiebre
     * @param PuntuacionVomitos
     * @param PuntuacionDolAbdominal
     * @param PuntuacionSignosShock
     * @param PuntuacionLesLeves
     * @param PuntuacionSangrado
     * @param ColorAsignado
     * @param MotivoCambio
     * @param FechaCambio
     * @param HoraDelCambio
     * @param paciente
     * @param consulta
     * @param enfermero
     * @param Medico
     * @param puntuacion
     * @param tiempoespera
     * @param tipourgencia
     * @param fecha 
     */
    public Triage(int id_triage, int PuntuacionRespiracion, int PuntuacionPulso, int PuntuacionEstMental, int PuntuacionConciencia, int PuntuacionDolResp, int PuntuacionLesGraves, int PuntuacionEdad, int PuntuacionFiebre, int PuntuacionVomitos, int PuntuacionDolAbdominal, int PuntuacionSignosShock, int PuntuacionLesLeves, int PuntuacionSangrado, String ColorAsignado, String MotivoCambio, int FechaCambio, int HoraDelCambio, Paciente paciente, Consulta consulta, PersonalEnfermeria enfermero, Medicos Medico, int puntuacion, String tiempoespera, String tipourgencia, Date fecha) {
        this.id_triage = id_triage;
        this.PuntuacionRespiracion = PuntuacionRespiracion;
        this.PuntuacionPulso = PuntuacionPulso;
        this.PuntuacionEstMental = PuntuacionEstMental;
        this.PuntuacionConciencia = PuntuacionConciencia;
        this.PuntuacionDolResp = PuntuacionDolResp;
        this.PuntuacionLesGraves = PuntuacionLesGraves;
        this.PuntuacionEdad = PuntuacionEdad;
        this.PuntuacionFiebre = PuntuacionFiebre;
        this.PuntuacionVomitos = PuntuacionVomitos;
        this.PuntuacionDolAbdominal = PuntuacionDolAbdominal;
        this.PuntuacionSignosShock = PuntuacionSignosShock;
        this.PuntuacionLesLeves = PuntuacionLesLeves;
        this.PuntuacionSangrado = PuntuacionSangrado;
        this.ColorAsignado = ColorAsignado;
        this.MotivoCambio = MotivoCambio;
        this.FechaCambio = FechaCambio;
        this.HoraDelCambio = HoraDelCambio;
        this.paciente = paciente;
        this.consulta = consulta;
        this.enfermero = enfermero;
        this.Medico = Medico;
        this.puntuacion = puntuacion;
        this.tiempoespera = tiempoespera;
        this.tipourgencia = tipourgencia;
        this.fecha= fecha;
    }

       
    /** Constructor por defecto de Triage*/
    public Triage(){
    }

    //GETTERS Y SETTERS
    /** Retorna el identificador de triag
     * @return */
    public int getId_triage() {
        return id_triage;
    }
    /**
     * Permite modificar el identificador de triage
     * @param id_triage 
     */
    public void setId_triage(int id_triage) {
        this.id_triage = id_triage;
    }
    /**
     * Permite modificar la fecha de triage
     * @param fecha 
     */
    public void setFecha(Date fecha){
        this.fecha= fecha;
    }
    /** Retorna la fecha de triag
     * @return */
    public Date getFecha(){
        return fecha;
    }
    
    /** Retorna la puntuación de respiració
     * @return */
    public int getPuntuacionRespiracion() {
        return PuntuacionRespiracion;
    }
    /** Permite modificar la puntuación de respiració
     * @param puntuacionRespiracion*/
    public void setPuntuacionRespiracion(int puntuacionRespiracion) {
        PuntuacionRespiracion = puntuacionRespiracion;
    }
    /** Retorna la puntuación de puls
     * @return */
    public int getPuntuacionPulso() {
        return PuntuacionPulso;
    }
    /** Permite modificar la puntuación de puls
     * @param puntuacionPulso*/
    public void setPuntuacionPulso(int puntuacionPulso) {
        PuntuacionPulso = puntuacionPulso;
    }
    /** Retorna la puntuación de estado menta
     * @return */
    public int getPuntuacionEstMental() {
        return PuntuacionEstMental;
    }
    /** Permite modificar la puntuación de estado menta
     * @param puntuacionEstMental*/
    public void setPuntuacionEstMental(int puntuacionEstMental) {
        PuntuacionEstMental = puntuacionEstMental;
    }
    /** Retorna la puntuación de Concienci
     * @return */
    public int getPuntuacionConciencia() {
        return PuntuacionConciencia;
    }
    /** Permite modificar la puntuación de Concienci
     * @param puntuacionConciencia*/
    public void setPuntuacionConciencia(int puntuacionConciencia) {
        PuntuacionConciencia = puntuacionConciencia;
    }
    /** Retorna la puntuación de dolores respiratorio
     * @return */
    public int getPuntuacionDolResp() {
        return PuntuacionDolResp;
    }
    /** Permite modificar la puntuación de dolores respiratorio
     * @param puntuacionDolResp*/
    public void setPuntuacionDolResp(int puntuacionDolResp) {
        PuntuacionDolResp = puntuacionDolResp;
    }
    /** Retorna la puntuación de lesiones grave
     * @return */
    public int getPuntuacionLesGraves() {
        return PuntuacionLesGraves;
    }
    /** Permite modificar la puntuación de lesiones grave
     * @param puntuacionLesGraves*/
    public void setPuntuacionLesGraves(int puntuacionLesGraves) {
        PuntuacionLesGraves = puntuacionLesGraves;
    }
    /** Retorna la puntuación de eda
     * @return */
    public int getPuntuacionEdad() {
        return PuntuacionEdad;
    }
    /** Permite modificar la puntuación de eda
     * @param puntuacionEdad*/
    public void setPuntuacionEdad(int puntuacionEdad) {
        PuntuacionEdad = puntuacionEdad;
    }
    /** Retorna la puntuación de fiebr
     * @return */
    public int getPuntuacionFiebre() {
        return PuntuacionFiebre;
    }
    /** Permite modificar la puntuación de fiebr
     * @param puntuacionFiebre*/
    public void setPuntuacionFiebre(int puntuacionFiebre) {
        PuntuacionFiebre = puntuacionFiebre;
    }
    /** Retorna la puntuación de vómito
     * @return */
    public int getPuntuacionVomitos() {
        return PuntuacionVomitos;
    }
    /** Permite modificar la puntuación de vómito
     * @param puntuacionVomitos*/
    public void setPuntuacionVomitos(int puntuacionVomitos) {
        PuntuacionVomitos = puntuacionVomitos;
    }
    /** Retorna la puntuación de dolor abdomina
     * @return */
    public int getPuntuacionDolAbdominal() {
        return PuntuacionDolAbdominal;
    }
    /** Permite modificar la puntuación de dolor abdomina
     * @param puntuacionDolAbdominal*/
    public void setPuntuacionDolAbdominal(int puntuacionDolAbdominal) {
        PuntuacionDolAbdominal = puntuacionDolAbdominal;
    }
    /** Retorna la puntuación de signos de shoc
     * @return */
    public int getPuntuacionSignosShock() {
        return PuntuacionSignosShock;
    }
    /** Permite modificar la puntuación de signos de shoc
     * @param puntuacionSignosShock*/
    public void setPuntuacionSignosShock(int puntuacionSignosShock) {
        PuntuacionSignosShock = puntuacionSignosShock;
    }
    /** Retorna la puntuación de lesiones leve
     * @return */
    public int getPuntuacionLesLeves() {
        return PuntuacionLesLeves;
    }
    /** Permite modificar la puntuación de lesiones leve
     * @param puntuacionLesLeves*/
    public void setPuntuacionLesLeves(int puntuacionLesLeves) {
        PuntuacionLesLeves = puntuacionLesLeves;
    }
    /** Retorna la puntuación de sangrad
     * @return */
    public int getPuntuacionSangrado() {
        return PuntuacionSangrado;
    }
    /** Permite modificar la puntuación de sangrad
     * @param puntuacionSangrado*/
    public void setPuntuacionSangrado(int puntuacionSangrado) {
        PuntuacionSangrado = puntuacionSangrado;
    }
    /** Retorna el color asignado por el triag
     * @return */
    public String getColorAsignado() {
        return ColorAsignado;
    }
    /** Permite modificar el color asignado por el triag
     * @param colorAsignado*/
    public void setColorAsignado(String colorAsignado) {
        ColorAsignado = colorAsignado;
    }
    /** Retorna el motivo de cambi
     * @return */
    public String getMotivoCambio() {
        return MotivoCambio;
    }
    /** Permite modificar el motivo de cambi
     * @param motivoCambio*/
    public void setMotivoCambio(String motivoCambio) {
        MotivoCambio = motivoCambio;
    }
    /** Retorna la fecha de cambi
     * @return */
    public int getFechaCambio() {
        return FechaCambio;
    }
    /** Permite modificar la fecha de cambi
     * @param fechaCambio*/
    public void setFechaCambio(int fechaCambio) {
        FechaCambio = fechaCambio;
    }
    /** Retorna la hora de cambi
     * @return */
    public int getHoraDelCambio() {
        return HoraDelCambio;
    }
    /** Permite modificar la hora del cambi
     * @param horaDelCambio*/
    public void setHoraDelCambio(int horaDelCambio) {
        HoraDelCambio = horaDelCambio;
    }
    /** Retorna el paciente de la clase Pacient
     * @return */
    public Paciente getPaciente() {
        return paciente;
    }
    /** Permite modificar el paciente de la clase Pacient
     * @param paciente*/
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    /** Retorna consulta de la clase Consult
     * @return */
    public Consulta getConsulta() {
        return consulta;
    }
    /** 
     * Permite modificar la consulta de la clase Consulta
     * @return
     * /
    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
    /**
     * Retorna enfermero de la clase PersonalEnfermeria 
     */
    public PersonalEnfermeria getEnfermero() {
        return enfermero;
    }
    /**
     * Permite modificar enfermero de la clase PersonalEnfermeria
     * @param enfermero 
     */
    public void setEnfermeria(PersonalEnfermeria enfermero) {
        this.enfermero= enfermero;
    }
       /** Retorna el Medico de la clase Medico
     * @return */
    public Medicos getMedico() {
        return Medico;
    }
    /**
     * Permite modificar el medico de clase Medicos
     * @param medico 
     */
    public void setMedico(Medicos medico) {
        Medico = medico;
    }
    /**
     * Permite modificar la puntuación obtenida
     * @param puntuacion 
     */
    public void setpuntuacion(int puntuacion){
        this.puntuacion=puntuacion;
    }
    /** Retorna la puntuación obtenid
     * @return */
    public int getpuntuacion(){
        return puntuacion;
    }
    /** Retorna el tiempo de esper
     * @return */
    public String getTiempoespera() {
        return tiempoespera;
    }
    /**
     * Permite modificar el tiempo de espera
     * @param tiempoespera 
     */
    public void setTiempoespera(String tiempoespera) {
        this.tiempoespera = tiempoespera;
    }
    /** Retorna el tipo de urgenci
     * @return */
    public String getTipourgencia() {
        return tipourgencia;
    }
    /**
     * Permite modificar el tipo de urgencia
     * @param tipourgencia 
     */
    public void setTipourgencia(String tipourgencia) {
        this.tipourgencia = tipourgencia;
    }
    
    /**
     * Calcula la puntuación a partir de los resultados obtenidos
     * @param PuntuacionRespiracion
     * @param PuntuacionPulso
     * @param PuntuacionEstMental
     * @param PuntuacionConciencia
     * @param PuntuacionDolResp
     * @param PuntuacionLesGraves
     * @param PuntuacionEdad
     * @param PuntuacionFiebre
     * @param PuntuacionVomitos
     * @param PuntuacionDolAbdominal
     * @param PuntuacionSignosShock
     * @param PuntuacionLesLeves
     * @param PuntuacionSangrado 
     */
    public void calcularPuntuacion(String PuntuacionRespiracion, String PuntuacionPulso, String PuntuacionEstMental, String PuntuacionConciencia,
    String PuntuacionDolResp, String PuntuacionLesGraves, String PuntuacionEdad, String PuntuacionFiebre,
    String PuntuacionVomitos, String PuntuacionDolAbdominal, String PuntuacionSignosShock,
    String PuntuacionLesLeves, String PuntuacionSangrado) {
    int puntuacion = 0;

    // Puntuación para la Respiración
    if ("Moderada".equals(PuntuacionRespiracion)) {
        puntuacion += 1;
    } else if ("Grave".equals(PuntuacionRespiracion)) {
        puntuacion += 2;
    } else{
        puntuacion +=0;
    }

    // Puntuación para el Pulso
    if ("Anormal".equals(PuntuacionPulso)) {
        puntuacion += 1;
    } else {
        puntuacion +=0;
    }

    // Puntuación para el Estado Mental
    if ("Confusion leve".equals(PuntuacionEstMental)) {
        puntuacion += 1;
    } else if ("Confusion Grave".equals(PuntuacionEstMental)) {
        puntuacion += 2;
    } else{
        puntuacion +=0;
    }

    // Puntuación para la Conciencia
    if ("Perdida de conciencia".equals(PuntuacionConciencia)) {
        puntuacion += 3;
    } else {
        puntuacion +=0;
    }

    // Puntuación para el Dolor en el Pecho o Dificultad para Respirar
    if ("Presente".equals(PuntuacionDolResp)) {
        puntuacion += 1;
    }else{
        puntuacion +=0;
    }

    // Puntuación para las Lesiones Graves
    if ("Presentes".equals(PuntuacionLesGraves)) {
        puntuacion += 2;
    } else{
        puntuacion +=0;
    }

    // Puntuación para la Edad
    if ("Niño o anciano".equals(PuntuacionEdad)) {
        puntuacion += 1;
    }else{
        puntuacion +=0;
    }

    // Puntuación para la Fiebre
    if ("Fiebre moderada".equals(PuntuacionFiebre)) {
        puntuacion += 1;
    } else if ("Fiebre alta".equals(PuntuacionFiebre)) {
        puntuacion += 2;
    } else{
        puntuacion +=0;
    }

    // Puntuación para los Vómitos
    if ("Vómitos moderados".equals(PuntuacionVomitos)) {
        puntuacion += 1;
    } else if ("Vómitos intesos".equals(PuntuacionVomitos)) {
        puntuacion += 2;
    }else{
        puntuacion +=0;
    }

    // Puntuación para el Dolor Abdominal
    if ("Dolor moderado".equals(PuntuacionDolAbdominal)) {
        puntuacion += 1;
    } else if ("Dolor severo".equals(PuntuacionDolAbdominal)) {
        puntuacion += 2;
    }else{
        puntuacion +=0;
    }

    // Puntuación para los Signos de Shock
    if ("presentes".equals(PuntuacionSignosShock)) {
        puntuacion += 3;
    } else{
        puntuacion +=0;
    }

    // Puntuación para las Lesiones Leves
    if ("Presentes".equals(PuntuacionLesLeves)) {
        puntuacion += 1;
    } else{
        puntuacion +=0;
    }

    // Puntuación para el Sangrado
    if ("Sangrado moderado".equals(PuntuacionSangrado)) {
        puntuacion += 1;
    } else if ("Sangrado intenso".equals(PuntuacionSangrado)) {
        puntuacion += 2;
    } else{
        puntuacion +=0;
    }

    this.setpuntuacion(puntuacion);
    }
    
 
    /** Método para calcular el tiempo de esper
     * @param puntuacion
     * @return */
    public String calcularTiempoEspera(int puntuacion){
        String tiempoespera= null;
        
        if(puntuacion == 0){
            tiempoespera = "4 horas";
        }
        if (puntuacion>0 && puntuacion<= 4){
            tiempoespera= "2 horas";
        }

        if (puntuacion>=5 && puntuacion<= 9){
            tiempoespera= "60 minutos";
        }
        if (puntuacion>=10 && puntuacion<= 14){
            tiempoespera= "10-15 minutos";
        }
        if (puntuacion>15){
            tiempoespera= "Atencion inmediata";
        }
        return tiempoespera;
    }
    
    /** Método que retorna un color dependiendo de la puntuación obtenid
     * @param puntuacion
     * @return */
    public String calcularColor(int puntuacion){
        
        String color = null;
        if (puntuacion == 0){
            color = "azul";
        }
        if (puntuacion>0 && puntuacion<= 4){
            color= "Verde";
        }
        if (puntuacion>=5 && puntuacion<= 9){
            color= "Amarillo";
        }
        if (puntuacion>=10 && puntuacion<= 14){
            color= "Naranja";
        }
        if (puntuacion>= 15){
            color= "Rojo";
        }
        return color;
        
    }
    /**
     * Metodo que devuelve el tipo de urgencia dependiendo de la puntuación obtenida
     * @param puntuacion
     * @return 
     */
    public String calcularTipoUrgencia(int puntuacion){
        
        String urgencia = null;
        
        if (puntuacion == 0){
            urgencia = "No urgente";
        }
        if (puntuacion>0 && puntuacion<= 4){
            urgencia= "Normal";
        }
        if (puntuacion>=5 && puntuacion<= 9){
            urgencia= "Urgente";
        }
        if (puntuacion>=10 && puntuacion<= 14){
            urgencia= "Muy urgente";
        }
        if (puntuacion>= 15){
            urgencia= "Riesgo vital inmediato";
        }
        return urgencia;
    }
}
