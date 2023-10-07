package com.miapp.triage.persistence;

import com.miapp.triage.triage.Paciente;


public class ControladoraPersistencia {
  
    
    AdministradorSistemaJpaController admin= new AdministradorSistemaJpaController();
    FuncionarioAdministrativoJpaController funcioadmin= new FuncionarioAdministrativoJpaController();
    FuncionarioJpaController funcio = new FuncionarioJpaController();
    MedicosJpaController med = new  MedicosJpaController();
    PersonalEnfermeriaJpaController perso = new PersonalEnfermeriaJpaController();
    PacienteJpaController paciJPA = new PacienteJpaController();
    PersonaJpaController persoJPA = new PersonaJpaController();
    
    
    public ControladoraPersistencia(){
        
    }

    public void crearPaciente(Paciente paci) {
       paciJPA.create(paci);
    }
    
    
    
}
