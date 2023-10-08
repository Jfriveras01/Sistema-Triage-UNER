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
    private String ColorSugerido;
    private String ColorAsignado;
    private String MotivoCambio;
    private int FechaCambio;
    private int HoraDelCambio;
    private Paciente paciente;
    private Consulta consulta;
    private PersonalEnfermeria enfermero;
    private Medicos Medico;

    public Triage(int id_triag, int puntuacionRespiracion, int puntuacionPulso, int puntuacionEstMental, int puntuacionConciencia, int puntuacionDolResp, int puntuacionLesGraves, int puntuacionEdad, int puntuacionFiebre, int puntuacionVomitos, int puntuacionDolAbdominal, int puntuacionSignosShock, int puntuacionLesLeves, int puntuacionSangrado, String colorSugerido, String colorAsignado, String motivoCambio, int fechaCambio, int horaDelCambio, Paciente pacient, Consulta consult, PersonalEnfermeria enfermero, List<Medicos> medico) {
        id_triage = id_triag;
        PuntuacionRespiracion = puntuacionRespiracion;
        PuntuacionPulso = puntuacionPulso;
        PuntuacionEstMental = puntuacionEstMental;
        PuntuacionConciencia = puntuacionConciencia;
        PuntuacionDolResp = puntuacionDolResp;
        PuntuacionLesGraves = puntuacionLesGraves;
        PuntuacionEdad = puntuacionEdad;
        PuntuacionFiebre = puntuacionFiebre;
        PuntuacionVomitos = puntuacionVomitos;
        PuntuacionDolAbdominal = puntuacionDolAbdominal;
        PuntuacionSignosShock = puntuacionSignosShock;
        PuntuacionLesLeves = puntuacionLesLeves;
        PuntuacionSangrado = puntuacionSangrado;
        ColorSugerido = colorSugerido;
        ColorAsignado = colorAsignado;
        MotivoCambio = motivoCambio;
        FechaCambio = fechaCambio;
        HoraDelCambio = horaDelCambio;
        paciente = pacient;
        consulta = consult;
        this.enfermero = enfermero;
        Medico = (Medicos) medico;
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

    public String getColorSugerido() {
        return ColorSugerido;
    }

    public void setColorSugerido(String colorSugerido) {
        ColorSugerido = colorSugerido;
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

    public void setMedico(List<Medicos> medico) {
        Medico = (Medicos) medico;
    }
}
