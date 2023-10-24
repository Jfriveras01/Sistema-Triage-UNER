package com.miapp.triage.metodoscsv;
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
    
    private static int ultimoId = 0; 
    ArrayList<Triage> triage;
    ArrayList<String> nombresMedico = new ArrayList<>();
    ArrayList<Long> DniPaciente = new ArrayList<>();
    
    public ArrayList<Triage> getTriages() {
        return triage;
    }

    public void agregarNombreMedico(String nombreMedico) {
        nombresMedico.add(nombreMedico);
    }
    
    public ArrayList<String> getNombresMedicos() {
        return nombresMedico;
    }
    
    public void agregarDniPaciente(long dniPacientes) {
        DniPaciente.add(dniPacientes);
    }
    
    public ArrayList<Long> getDniPaciente() {
        return DniPaciente;
    }
    
    public ltriage(ArrayList<Triage> triage) {
        this.triage = triage;
    }
    
    public ltriage() {
        this.triage = new ArrayList<Triage>();
        // No es necesario inicializar ultimoId aquí
    }
    
    public void agregar(Triage tria) {
        ultimoId++; // Incrementa el ID de manera única
        tria.setId_triage(ultimoId);
        triage.add(tria);
    }
    
    public boolean eliminar(Triage tria) {
        if (triage.contains(tria)) {
            triage.remove(tria);
            return true;
        }
        return false;
    }
    
    public boolean eliminar (int id){
        for (Triage tria : triage){
            if(tria.getId_triage() == id){
                triage.remove(tria);
                return true;
            }
        }
        return false;
    }
    
    
   public void leerArchivo(String archivo, String separador) throws IOException {
    BufferedReader br = null;

    try {
        br = new BufferedReader(new FileReader(archivo));
        String linea = br.readLine();

        while (linea != null) {
            String[] campos = linea.split(separador);

            if (campos.length >= 4) { // Asegúrate de que haya al menos 4 campos
                Triage triage = new Triage();
                triage.setId_triage(Integer.parseInt(campos[0]));
                triage.setTipourgencia(campos[1]);
                triage.setColorAsignado(campos[2]);
                triage.setTiempoespera(campos[3]);
                triage.setpuntuacion(Integer.parseInt(campos[4]));
                String nombreMedico = campos[5];
                nombresMedico.add(nombreMedico);
                Long DniPacientes = Long.parseLong(campos[6]);
                DniPaciente.add(DniPacientes);

                this.agregar(triage);
            } else {
                
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
 
    
    
    public void escribirArchivo (String archivo, String separador, boolean append) {        
        FileWriter nuevo = null;
        PrintWriter pw = null;
    try {
        nuevo = new FileWriter(archivo, append); 
        pw = new PrintWriter(nuevo);
        for (Triage tria: triage) {

            String linea = tria.getId_triage() + separador;
            linea += tria.getTipourgencia() + separador;
            linea += tria.getColorAsignado() + separador;
            linea += tria.getTiempoespera() + separador;
            linea += tria.getpuntuacion() + separador;
            
            // Obtener el objeto Medico asociado a la Especialidad
            Medicos medico = tria.getMedico();
            if (medico != null) {
                linea += medico.getNombre() + separador;
            } else {
                linea +=null;
            }
            
            Paciente paci = tria.getPaciente();
            if(paci != null){
                linea += paci.getDNI() ;
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
    
    
 
  
