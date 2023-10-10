package com.miapp.triage;
import com.miapp.triage.gui.Login;
import com.miapp.triage.triage.Persona;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.miapp.triage.metodoscsv.lpacientes;
/**
 *
 * @author Fran
 */
public class Triage {
    
    
     

    public static void main(String[] args) throws IOException, ParseException {
       

        Login log = new Login();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
        
        String archivo = "src\\main\\java\\com\\miapp\\triage\\csv\\pacientes.csv";
                
        lpacientes listapaci = new lpacientes();
        
        listapaci.leerArchivo(archivo, ";");
        
        listapaci.escribirArchivo(archivo, ";", false);
        
        
       
       }   
}