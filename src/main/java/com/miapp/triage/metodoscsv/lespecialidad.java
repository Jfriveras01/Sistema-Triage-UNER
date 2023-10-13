package com.miapp.triage.metodoscsv;

import com.miapp.triage.triage.Especialidad;
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
import java.util.List;

/**
 *
 * @author Fran
 */
public class lespecialidad {
    
    private int Cod = 0;
    
    ArrayList<Especialidad> especialidad;
    
    private ArrayList<String> nombresMedicos = new ArrayList<>();
    
    public void agregarNombreMedico(String nombreMedico) {
        nombresMedicos.add(nombreMedico);
    }
    
    public ArrayList<String> getNombresMedicos() {
        return nombresMedicos;
    }
    
    public lespecialidad(ArrayList<Especialidad> especialidad){
        this.especialidad = especialidad;
        this.nombresMedicos = new ArrayList<>();
    }
    
  
    public ArrayList<Especialidad> getEspecialidad() {
        return especialidad;
    }
    
    public lespecialidad(){
        this.especialidad = new ArrayList<Especialidad>();
    }
    
    public void agregar (Especialidad espe){
        
        Cod++;
        espe.setCod(Cod);
        especialidad.add(espe);
    }
    
    public boolean eliminar (Especialidad espe){
        if(especialidad.contains(espe)){
            especialidad.remove(espe);
            return true;
        }
        return false;
    }
    
    public boolean eliminar (int cod){
        for (Especialidad espe : especialidad){
            if(espe.getCod() == cod){
                especialidad.remove(espe);
                return true;
            }
        }
        return false;
    }
    
   public void leerArchivo(String archivo, String separador) throws IOException {
    BufferedReader br = null;
    Especialidad espe;

    try {
        br = new BufferedReader(new FileReader(archivo));
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        String linea = br.readLine();

        while (linea != null) {
            String[] campos = linea.split(separador);

            // Verifica si la línea contiene al menos dos campos
            if (campos.length >= 2) {
                espe = new Especialidad();
                espe.setCod(Integer.parseInt(campos[0]));
                espe.setNombre(campos[1]);

                // Obtener el nombre del médico si existe
                if (campos.length > 2) {
                    String nombreMedico = campos[2];
                    // Agregar el nombre del médico a la lista de nombres de médicos
                    nombresMedicos.add(nombreMedico);
                }

                this.agregar(espe);
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
        for (Especialidad espe : especialidad) {
            String linea = espe.getCod() + separador;
            linea += espe.getNombre() + separador;

            // Obtener el objeto Medico asociado a la Especialidad
            Medicos medico = espe.getMedicos();
            if (medico != null) {
                linea += medico.getNombre() + separador;
                // Si hay más propiedades del objeto Medico para escribir, agrégalas aquí
            } else {
                linea +=null;
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
