/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miapp.triage.metodoscsv;

import com.miapp.triage.triage.BoxAtencion;
import com.miapp.triage.triage.Consulta;
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
public class lconsulta {
    
    ArrayList<Consulta> consulta;
 
    private ArrayList<String> nombresMedicos = new ArrayList<>();
    private ArrayList<String> dniPacientes = new ArrayList<>();
    private ArrayList<String> numBox = new ArrayList<>();
    
    public void agregarNumBox (String numeBox){
        numBox.add(numeBox);
    }
    
    public ArrayList<String> getNumBox(){
        return numBox;
    }
    
    public void agregarDniPaciente (String dniPaciente){
        dniPacientes.add(dniPaciente);
    }
    
    public ArrayList<String> getDniPaciente(){
        return dniPacientes;
    }
    
    public void agregarNombreMedico(String nombreMedico) {
        nombresMedicos.add(nombreMedico);
    }
    
    public ArrayList<String> getNombresMedicos() {
        return nombresMedicos;
    }
    
    public lconsulta(ArrayList<Consulta> consulta){
        this.consulta = consulta;
    }
    
    public ArrayList<Consulta> getEstudios() {
        return consulta;
    }
    
    public lconsulta(){
        this.consulta = new ArrayList<Consulta>();
    }
    
    public void agregar(Consulta est) {
        consulta.add(est);
    }
    
    public boolean eliminar (Consulta con){
        if(consulta.contains(con)){
            consulta.remove(con);
            return true;
        }
        return false;
    }
    
    
    public void leerArchivo(String archivo, String separador) throws IOException {
    BufferedReader br = null;
    Consulta con;

    try {
        br = new BufferedReader(new FileReader(archivo));
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        String linea = br.readLine();

        while (linea != null) {
            String[] campos = linea.split(separador);

            // Verifica si la línea contiene al menos dos campos
            if (campos.length >= 2) {
                con = new Consulta();
                
                String dniPaciente = campos[0];
                dniPacientes.add(dniPaciente);
                
                con.setFecha(df.parse(campos[1]));
                con.setHora((campos[2]));
                con.setLugar(campos[3]);
                
                String numeBox = campos[4];
                numBox.add(numeBox);
                
                // Obtener el nombre del médico si existe
                    String nombreMedico = campos[5];
                    // Agregar el nombre del médico a la lista de nombres de médicos
                    nombresMedicos.add(nombreMedico);
                
                con.setDiagnostico(campos[6]);

                this.agregar(con);
            } else {
                // Maneja el caso en el que la línea no contiene al menos dos campos
                System.err.println("La línea no contiene los campos necesarios: " + linea);
            }

            linea = br.readLine();
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        if (br != null) {
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
        for (Consulta con : consulta) {
            String linea = con.getConsul().getDNI() + separador;
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            linea += df.format(con.getFecha()) + separador;
            linea += con.getHora() + separador;
            linea += con.getLugar() + separador;
            linea += con.getDiagnostico() + separador;
            
            BoxAtencion boxAtencion = con.getBoxAtencion();
            if (boxAtencion != null) {
                linea += boxAtencion.getId_box() + separador;
            } else {
                
            }

            // Obtener el objeto Medico asociado a la Especialidad
            Medicos medico = con.getMedico();
            if (medico != null) {
                linea += medico.getNombre() ;
                // Si hay más propiedades del objeto Medico para escribir, agrégalas aquí
            } else {
                // Si no hay un médico asociado, coloca un valor por defecto o un separador
                
            }
            
            
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
