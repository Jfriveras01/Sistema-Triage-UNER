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
import java.util.Locale;

/**
 *
 * @author Fran
 */
public class lpacientes {
    
    private int ultimoId = 0;
    
    ArrayList<Paciente> pacientes;
    
    public lpacientes(ArrayList<Paciente> pacientes){
        this.pacientes = pacientes;
    }
    
    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }
    
    public lpacientes(){
        this.pacientes = new ArrayList<Paciente>();
    }
    
    public void agregar (Paciente paci){
        
        ultimoId++;
        paci.setId(ultimoId);
        pacientes.add(paci);
    }
    
    public boolean eliminar (Paciente paci){
        if(pacientes.contains(paci)){
            pacientes.remove(paci);
            return true;
        }
        return false;
    }
    
    
    public boolean eliminar (int id){
        for (Paciente paci : pacientes){
            if(paci.getId() == id){
                pacientes.remove(paci);
                return true;
            }
        }
        return false;
    }
    
    public void leerArchivo (String archivo, String separador) throws IOException {
        BufferedReader br = null;
        Paciente paci; 
      
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
                paci.setDomicilio(campos[4]);
                paci.setDNI(Long.parseLong(campos[5]));                
                paci.setTelfijo(Long.parseLong(campos[6]));
                paci.setTelcelular(Long.parseLong(campos[7]));
                paci.setEstcivil(campos[8]);
                paci.setCorreo(campos[9]);
                paci.setMotivo(campos[10]);
               
                this.agregar(paci);                
                linea = br.readLine();
            }            
        } catch (Exception e) {
         
        } finally {
            if (null!=br) {
                br.close();
            }
        }
        
    }
    
    public void escribirArchivo(String archivo, String separador, boolean append) {
    FileWriter nuevo = null;
    PrintWriter pw = null;
    try {
        nuevo = new FileWriter(archivo, append); // Abre el archivo en modo anexar si append es true
        pw = new PrintWriter(nuevo);
        for (Paciente paci : pacientes) {
            String linea = paci.getId() + separador;
            linea += paci.getNombre() + separador;
            linea += paci.getApellido() + separador;
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            linea += df.format(paci.getFechaNac()) + separador;
            linea += paci.getDomicilio() + separador;
            linea += paci.getDNI() + separador;
            linea += paci.getTelfijo() + separador;
            linea += paci.getTelcelular() + separador;
            linea += paci.getEstcivil() + separador;
            linea += paci.getCorreo() + separador;
            linea += paci.getMotivo();

            pw.println(linea);
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        try {
            if (nuevo != null)
                nuevo.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
}