package com.miapp.triage;
import com.miapp.triage.gui.Login;
import com.miapp.triage.persistence.ControladoraPersistencia;
/**
 *
 * @author Fran
 */
public class Triage {

    public static void main(String[] args) {
        
        Login log = new Login();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
        
        ControladoraPersistencia controlPersis= new ControladoraPersistencia();
    }
    

}
