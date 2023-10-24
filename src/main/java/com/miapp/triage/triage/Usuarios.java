package com.miapp.triage.triage;

/**
 * Clase de Administrador del Sistema.
 * 
 * @author Ramiro Borgo
 * @author Martin Bourlot
 * @author Fabian Brites
 * @author Juan Fracisco Riveras
 * @author Nicolas Ornetti
 * @version 1.0
 */

public class Usuarios  {

    private String rol;
    private String username;
    private String password;

    
    public Usuarios(){

    }

    public Usuarios(String username, String password, String rol) {
        this.username = username;
        this.password = password;
        this.rol= rol;
    }


    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
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

}
