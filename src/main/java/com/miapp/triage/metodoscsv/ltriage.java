package com.miapp.triage.metodoscsv;
import com.miapp.triage.triage.Especialidad;
import com.miapp.triage.triage.Triage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import com.miapp.triage.triage.Medicos;
import com.miapp.triage.triage.Paciente;
import java.io.FileWriter;
import java.io.PrintWriter;
public class ltriage {
    
    
  
    ArrayList<Triage> triage;
    ArrayList<String> nombresMedico;
    ArrayList<String> apellidosMedico;
    ArrayList<Long> DniPaciente;
    
    public void agregarNombreMedico(String nombreMedico) {
        nombresMedico.add(nombreMedico);
    }
    
    public ArrayList<String> getNombresMedicos() {
        return nombresMedico;
    }
    
    public void agregarApellidoMedico(String apellidoMedico) {
        apellidosMedico.add(apellidoMedico);
    }
    
    public ArrayList<String> getApellidosMedicos() {
        return apellidosMedico;
    }
    
    public void agregarDniPaciente(long dniPacientes) {
        DniPaciente.add(dniPacientes);
    }
    
    public ArrayList<Long> getDniPaciente() {
        return DniPaciente;
    }
    
    public ltriage(ArrayList<Triage> triage) {
        this.triage = triage;
        this.DniPaciente= DniPaciente;
        this.apellidosMedico= apellidosMedico;
        this.nombresMedico= nombresMedico;
    }
    
    public ltriage() {
        this.triage = new ArrayList<Triage>();
    }
    
    public void agregar (Triage tria) {
        triage.add(tria);
    }
    
    public boolean eliminar (Triage tria) {
        if (triage.contains(tria)) {
            triage.remove(tria);
            return true;
        }
        return false;
    }
    
    public boolean eliminar (int id) {
        for (Triage tria: triage) {
            if (tria.getId_triage() == id) {
                triage.remove(tria);                
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
        String linea = br.readLine();

        while (linea != null) {
            String[] campos = linea.split(separador);
            Triage triage= new Triage();
            triage.setColorAsignado(campos[0]);
            triage.setpuntuacion(Integer.parseInt(campos[1]));
            String nombreMedico = campos[2];
            nombresMedico.add(nombreMedico);
            String apellidoMedico = campos[3];
            apellidosMedico.add(apellidoMedico);
            Long DniPacientes = Long.parseLong(campos[4]);
            DniPaciente.add(DniPacientes);
            
            this.agregar(triage);
          
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
        
    
    
    public void escribirArchivo (String archivo, String separador, boolean append) {        
        FileWriter nuevo = null;
        PrintWriter pw = null;
    try {
        nuevo = new FileWriter(archivo, append); // Abre el archivo en modo anexar si append es true
        pw = new PrintWriter(nuevo);
        for (Triage tria: triage) {
            String linea= "";
            linea += tria.getColorAsignado() + separador;
            linea += tria.getpuntuacion() + separador;
            
            // Obtener el objeto Medico asociado a la Especialidad
            Medicos medico = tria.getMedico();
            if (medico != null) {
                linea += medico.getNombre() + separador;
                linea += medico.getApellido() + separador;
            } else {
                linea +=null;
            }
            
            Paciente paci = tria.getPaciente();
            if(paci != null){
                linea += paci.getDNI() + separador;
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
    
    
 
  
