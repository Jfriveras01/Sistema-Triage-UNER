package com.miapp.triage.triage;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Usuarios implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String username;
    private String password;
    @OneToOne
    private Rol unRol;

    public Usuarios(){

    }

    public Usuarios(String username, String password, Rol unrol) {
        this.username = username;
        this.password = password;
        this.unRol = unrol;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Rol getUnrol() {
        return unRol;
    }

    public void setUnrol(Rol unrol) {
        this.unRol = unrol;
    }
    
    
}
