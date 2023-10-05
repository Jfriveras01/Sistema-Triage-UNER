package com.miapp.triage.persistence;

import com.miapp.triage.triage.Paciente;


public class ControladoraPersistencia {
  
    BoxAtencionJpaController boxJPA = new BoxAtencionJpaController();
    ConsultaJpaController consulJPA = new ConsultaJpaController();
    InfomeEstudiosJpaController infoJPA = new InfomeEstudiosJpaController();
    PacienteJpaController paciJPA = new PacienteJpaController();
    PersonaJpaController persoJPA = new PersonaJpaController();
    UsuariosJpaController usuJPA = new UsuariosJpaController();
    
    public ControladoraPersistencia(){
        
    }

    public void crearPaciente(Paciente paci) {
       paciJPA.create(paci);
    }
}
