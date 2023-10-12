/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miapp.triage.metodoscsv;

import com.miapp.triage.triage.Medicos;
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
public class lmedicos {
    
    private int ultimoId = 0;
    
    ArrayList<Medicos> medicos;
    
    public lmedicos(ArrayList<Medicos> medicos){
        this.medicos = medicos;
    }
    
    public ArrayList<Medicos> getMedicos() {
        return medicos;
    }
    
    public lmedicos(){
        this.medicos = new ArrayList<Medicos>();
    }
    
    public void agregar (Medicos medi){
        
        ultimoId++;
        medi.setId(ultimoId);
        medicos.add(medi);
    }
    
    public boolean eliminar (Medicos medi){
        if(medicos.contains(medi)){
            medicos.remove(medi);
            return true;
        }
        return false;
    }
    
    
    public boolean eliminar (int id){
        for (Medicos medi : medicos){
            if(medi.getId() == id){
                medicos.remove(medi);
                return true;
            }
        }
        return false;
    }
    
    public void leerArchivo (String archivo, String separador) throws IOException {
        BufferedReader br = null;
        Medicos medi; 
      
        try {         
            br = new BufferedReader(new FileReader(archivo));
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            
            String linea = br.readLine();
            
            while (null!=linea) {
                String [] campos = linea.split(separador);
                
                medi = new Medicos(); 
                
                medi.setId(Integer.parseInt(campos[0]));
                medi.setNombre(campos[1]);
                medi.setApellido (campos[2]);
                medi.setFechaNac (df.parse(campos[3]));
                medi.setDNI(Long.parseLong(campos[4]));                
                medi.setTelfijo(Long.parseLong(campos[5]));
                medi.setTelcelular(Long.parseLong(campos[6]));
                medi.setEstcivil(campos[7]);
                medi.setCorreo(campos[8]);
                medi.setMatricula(Integer.parseInt(campos[9]));
                
                this.agregar(medi);                
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
        for (Medicos medi : medicos) {
            String linea = medi.getId() + separador;
            linea += medi.getNombre() + separador;
            linea += medi.getApellido() + separador;
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            linea += df.format(medi.getFechaNac()) + separador;
            linea += medi.getDNI() + separador;
            linea += medi.getTelfijo() + separador;
            linea += medi.getTelcelular() + separador;
            linea += medi.getEstcivil() + separador;
            linea += medi.getCorreo() + separador;
            linea += medi.getMatricula();

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
