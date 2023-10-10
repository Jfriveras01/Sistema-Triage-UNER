package com.miapp.triage.metodoscsv;

import com.miapp.triage.triage.Paciente;
import com.miapp.triage.triage.Persona;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Fran
 */
public class lpacientes {
    
    ArrayList<Persona> pacientes;
    
    public lpacientes(ArrayList<Persona> pacientes){
        this.pacientes = pacientes;
    }
    
    public lpacientes(){
        this.pacientes = new ArrayList<Persona>();
    }
    
    public void agregar (Persona paci){
        pacientes.add(paci);
    }
    
    public boolean eliminar (Persona paci){
        if(pacientes.contains(paci)){
            pacientes.remove(paci);
            return true;
        }
        return false;
    }
    
    
    public boolean eliminar (int id){
        for (Persona paci : pacientes){
            if(paci.getId() == id){
                pacientes.remove(paci);
                return true;
            }
        }
        return false;
    }
    
    public void leerArchivo (String archivo, String separador) throws IOException {
        BufferedReader br = null;
        Persona paci; 
      
        try {         
            br = new BufferedReader(new FileReader(archivo));
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            
            String linea = br.readLine();
            
            while (null!=linea) {
                String [] campos = linea.split(separador);
                
                paci = new Paciente(); 
                
                paci.setId(Integer.parseInt(campos[0]));
                paci.setNombre(campos[1]);
                paci.setApellido (campos[2]);
                paci.setFechaNac (df.parse(campos[3]));
                paci.setDNI(Long.parseLong(campos[4]));                
                paci.setTelfijo(Long.parseLong(campos[5]));
                paci.setTelcelular(Long.parseLong(campos[6]));
                paci.setEstcivil(campos[7]);
                paci.setCorreo(campos[8]);
               
                this.agregar(paci);                
                linea = br.readLine();
            }            
        } catch (Exception e) {
         
        } finally {
            if (null!=br) {
                br.close();
            }
        }
        System.out.println("cant " + this.pacientes.size());
        for (Persona pacie: pacientes) {
            System.out.println(pacie.toString());
        }
    }
    
    public void escribirArchivo (String archivo, String separador) {        
        FileWriter nuevo = null;
        PrintWriter pw = null;
        try
        {
            nuevo = new FileWriter(archivo);
            pw = new PrintWriter(nuevo);
            String linea;
            for (Persona paci: pacientes) {
                linea = paci.getId() + separador;
                linea += paci.getNombre() + separador;
                linea += paci.getApellido() + separador;
                linea += paci.getFechaNac() + separador;
                linea += paci.getDNI() + separador;
                linea += paci.getTelfijo() + separador;
                linea += paci.getTelcelular() + separador;
                linea += paci.getEstcivil() + separador;
                linea += paci.getCorreo();
                   
                pw.println(linea);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        } 
        finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != nuevo)
              nuevo.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }   
    }
}