package com.miapp.triage;
import com.miapp.triage.gui.Login;
import java.io.IOException;
import java.text.ParseException;
import com.miapp.triage.metodoscsv.lpacientes;
import com.miapp.triage.metodoscsv.ltriage;

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
        listapaci.eliminar(1);
        
        
        ltriage listita= new ltriage();
        String archivo2= "src\\main\\java\\com\\miapp\\triage\\csv\\triage.csv";
       
        listita.leerArchivo(archivo2, ";");
    
       }   
}