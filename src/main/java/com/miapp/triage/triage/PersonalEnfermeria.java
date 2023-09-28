package com.miapp.triage.triage;

public class PersonalEnfermeria {

    private Triage triage;

    public PersonalEnfermeria(Triage triage) {
        this.triage = triage;
    }
    public PersonalEnfermeria(){
    }

    public Triage getTriage() {
        return triage;
    }

    public void setTriage(Triage triage) {
        this.triage = triage;
    }
}
