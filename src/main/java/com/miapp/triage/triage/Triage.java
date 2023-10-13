package com.miapp.triage.triage;
import java.io.Serializable;
import java.util.List;


public class Triage implements Serializable {

    private int id_triage;
    private int PuntuacionRespiracion;
    private int PuntuacionPulso;
    private int PuntuacionEstMental;
    private int PuntuacionConciencia;
    private int PuntuacionDolResp;
    private int PuntuacionLesGraves;
    private int PuntuacionEdad;
    private int PuntuacionFiebre;
    private int PuntuacionVomitos;
    private int PuntuacionDolAbdominal;
    private int PuntuacionSignosShock;
    private int PuntuacionLesLeves;
    private int PuntuacionSangrado;
    private String ColorAsignado;
    private String MotivoCambio;
    private int FechaCambio;
    private int HoraDelCambio;
    private Paciente paciente;
    private Consulta consulta;
    private PersonalEnfermeria enfermero;
    private Medicos Medico;
    private int puntuacion;
    private String tiempoespera;
    private String tipourgencia;

    public Triage(int id_triage, int PuntuacionRespiracion, int PuntuacionPulso, int PuntuacionEstMental, int PuntuacionConciencia, int PuntuacionDolResp, int PuntuacionLesGraves, int PuntuacionEdad, int PuntuacionFiebre, int PuntuacionVomitos, int PuntuacionDolAbdominal, int PuntuacionSignosShock, int PuntuacionLesLeves, int PuntuacionSangrado, String ColorAsignado, String MotivoCambio, int FechaCambio, int HoraDelCambio, Paciente paciente, Consulta consulta, PersonalEnfermeria enfermero, Medicos Medico, int puntuacion, String tiempoespera, String tipourgencia) {
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
    }

    
    

    
    
    public Triage(){
    }

    //GETTERS Y SETTERS

    public int getId_triage() {
        return id_triage;
    }

    public void setId_triage(int id_triage) {
        this.id_triage = id_triage;
    }
    
    public int getPuntuacionRespiracion() {
        return PuntuacionRespiracion;
    }

    public void setPuntuacionRespiracion(int puntuacionRespiracion) {
        PuntuacionRespiracion = puntuacionRespiracion;
    }

    public int getPuntuacionPulso() {
        return PuntuacionPulso;
    }

    public void setPuntuacionPulso(int puntuacionPulso) {
        PuntuacionPulso = puntuacionPulso;
    }

    public int getPuntuacionEstMental() {
        return PuntuacionEstMental;
    }

    public void setPuntuacionEstMental(int puntuacionEstMental) {
        PuntuacionEstMental = puntuacionEstMental;
    }

    public int getPuntuacionConciencia() {
        return PuntuacionConciencia;
    }

    public void setPuntuacionConciencia(int puntuacionConciencia) {
        PuntuacionConciencia = puntuacionConciencia;
    }

    public int getPuntuacionDolResp() {
        return PuntuacionDolResp;
    }

    public void setPuntuacionDolResp(int puntuacionDolResp) {
        PuntuacionDolResp = puntuacionDolResp;
    }

    public int getPuntuacionLesGraves() {
        return PuntuacionLesGraves;
    }

    public void setPuntuacionLesGraves(int puntuacionLesGraves) {
        PuntuacionLesGraves = puntuacionLesGraves;
    }

    public int getPuntuacionEdad() {
        return PuntuacionEdad;
    }

    public void setPuntuacionEdad(int puntuacionEdad) {
        PuntuacionEdad = puntuacionEdad;
    }

    public int getPuntuacionFiebre() {
        return PuntuacionFiebre;
    }

    public void setPuntuacionFiebre(int puntuacionFiebre) {
        PuntuacionFiebre = puntuacionFiebre;
    }

    public int getPuntuacionVomitos() {
        return PuntuacionVomitos;
    }

    public void setPuntuacionVomitos(int puntuacionVomitos) {
        PuntuacionVomitos = puntuacionVomitos;
    }

    public int getPuntuacionDolAbdominal() {
        return PuntuacionDolAbdominal;
    }

    public void setPuntuacionDolAbdominal(int puntuacionDolAbdominal) {
        PuntuacionDolAbdominal = puntuacionDolAbdominal;
    }

    public int getPuntuacionSignosShock() {
        return PuntuacionSignosShock;
    }

    public void setPuntuacionSignosShock(int puntuacionSignosShock) {
        PuntuacionSignosShock = puntuacionSignosShock;
    }

    public int getPuntuacionLesLeves() {
        return PuntuacionLesLeves;
    }

    public void setPuntuacionLesLeves(int puntuacionLesLeves) {
        PuntuacionLesLeves = puntuacionLesLeves;
    }

    public int getPuntuacionSangrado() {
        return PuntuacionSangrado;
    }

    public void setPuntuacionSangrado(int puntuacionSangrado) {
        PuntuacionSangrado = puntuacionSangrado;
    }


    public String getColorAsignado() {
        return ColorAsignado;
    }

    public void setColorAsignado(String colorAsignado) {
        ColorAsignado = colorAsignado;
    }

    public String getMotivoCambio() {
        return MotivoCambio;
    }

    public void setMotivoCambio(String motivoCambio) {
        MotivoCambio = motivoCambio;
    }

    public int getFechaCambio() {
        return FechaCambio;
    }

    public void setFechaCambio(int fechaCambio) {
        FechaCambio = fechaCambio;
    }

    public int getHoraDelCambio() {
        return HoraDelCambio;
    }

    public void setHoraDelCambio(int horaDelCambio) {
        HoraDelCambio = horaDelCambio;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
    public PersonalEnfermeria getEnfermero() {
        return enfermero;
    }

    public void setEnfermeria(PersonalEnfermeria enfermero) {
        this.enfermero= enfermero;
    }
    
    public Medicos getMedico() {
        return Medico;
    }

    public void setMedico(Medicos medico) {
        Medico = medico;
    }
    
    public void setpuntuacion(int puntuacion){
        this.puntuacion=puntuacion;
    }
    
    public int getpuntuacion(){
        return puntuacion;
    }

    public String getTiempoespera() {
        return tiempoespera;
    }

    public void setTiempoespera(String tiempoespera) {
        this.tiempoespera = tiempoespera;
    }

    public String getTipourgencia() {
        return tipourgencia;
    }

    public void setTipourgencia(String tipourgencia) {
        this.tipourgencia = tipourgencia;
    }
    
    
    
    
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
