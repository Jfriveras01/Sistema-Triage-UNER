/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miapp.triage.metodoscsv;

import com.miapp.triage.triage.Funcionario;
import com.miapp.triage.triage.Medicos;
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
public class lfuncionarios {
    
    private int ultimoId = 0;
    
    ArrayList<Funcionario> funcionario;
    
    public lfuncionarios(ArrayList<Funcionario> funcionario){
        this.funcionario = funcionario;
    }
    
    public ArrayList<Funcionario> getFuncionarios() {
        return funcionario;
    }
    
    public lfuncionarios(){
        this.funcionario = new ArrayList<Funcionario>();
    }
    
    public void agregar (Funcionario func){
        
        ultimoId++;
        func.setId(ultimoId);
        funcionario.add(func);
    }
    
    public boolean eliminar (Funcionario func){
        if(funcionario.contains(func)){
            funcionario.remove(func);
            return true;
        }
        return false;
    }
    
    
    public boolean eliminar (int id){
        for (Funcionario func : funcionario){
            if(func.getId() == id){
                funcionario.remove(func);
                return true;
            }
        }
        return false;
    }
    
    public void leerArchivo (String archivo, String separador) throws IOException {
        BufferedReader br = null;
        Funcionario func; 
      
        try {         
            br = new BufferedReader(new FileReader(archivo));
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            
            String linea = br.readLine();
            
            while (null!=linea) {
                String [] campos = linea.split(separador);
                
                func = new Funcionario(); 
                
                func.setId(Integer.parseInt(campos[0]));
                func.setNombre(campos[1]);
                func.setApellido (campos[2]);
                func.setFechaNac (df.parse(campos[3]));
                func.setDomicilio(campos[4]);
                func.setDNI(Long.parseLong(campos[5]));                
                func.setTelfijo(Long.parseLong(campos[6]));
                func.setTelcelular(Long.parseLong(campos[7]));
                func.setEstcivil(campos[8]);
                func.setCorreo(campos[9]);
                func.setSector((campos[10]));
                
                this.agregar(func);                
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
        for (Funcionario func : funcionario) {
            String linea = func.getId() + separador;
            linea += func.getNombre() + separador;
            linea += func.getApellido() + separador;
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            linea += df.format(func.getFechaNac()) + separador;
            linea += func.getDomicilio() + separador;
            linea += func.getDNI() + separador;
            linea += func.getTelfijo() + separador;
            linea += func.getTelcelular() + separador;
            linea += func.getEstcivil() + separador;
            linea += func.getCorreo() + separador;
            linea += func.getSector();

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

