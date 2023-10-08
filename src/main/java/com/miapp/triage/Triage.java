package com.miapp.triage;
import com.miapp.triage.gui.Login;
import com.miapp.triage.metodoscsv.lpacientes;
import com.miapp.triage.triage.Paciente;
import com.miapp.triage.triage.Persona;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Fran
 */
public class Triage {

    public static void main(String[] args) throws IOException, ParseException {
        
        Login log = new Login();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
        
        String archivo = "com/miapp/triage/csv/pacientes.csv";
                
        lpacientes listapaci = new lpacientes();
                
        listapaci.leerArchivo(archivo, ";");
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); // Define your date format
        Date fechaNacimiento = dateFormat.parse("22/05/2002");
        
        
        Persona fran = new Persona (2,"Nico","Ornetti",fechaNacimiento,44074299,0,345403689,"casado","nicoorneti@gmail.com");
        Persona nico = new Persona (3,"asd","Oasdasdnetti",fechaNacimiento,46074299,0,323403689,"soltero","pollo@gmail.com");

        listapaci.agregar(fran);
        listapaci.agregar(nico);
        
        listapaci.leerArchivo(archivo, ";");
        
    }
    

}
