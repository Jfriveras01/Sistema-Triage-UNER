/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miapp.triage.triage;

import com.miapp.triage.persistence.ControladoraPersistencia;

/**
 *
 * @author Fran
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearPaciente(Paciente paci){
        
        controlPersis.crearPaciente (paci);
    }
}
