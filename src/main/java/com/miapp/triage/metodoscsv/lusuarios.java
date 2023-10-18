package com.miapp.triage.metodoscsv;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import com.miapp.triage.triage.Usuarios;

public class lusuarios {
 
    ArrayList<Usuarios> usuarios;
    
    public lusuarios(ArrayList<Usuarios> usuario){
        this.usuarios = usuario;
    }
    
    public lusuarios(){
        this.usuarios = new ArrayList<Usuarios>();
    }
    
    public void agregar (Usuarios usuario){
        usuarios.add(usuario);
    }
    
    public boolean eliminar (Usuarios usuario){
        if(usuarios.contains(usuario)){
            usuarios.remove(usuario);
            return true;
        }
        return false;
    }
    
    
    public boolean eliminar (String username){
        for (Usuarios usuario : usuarios){
            if(usuario.getUsername() == username){
                usuarios.remove(usuario);
                return true;
            }
        }
        return false;
    }
    
    public void leerArchivo (String archivo, String separador) throws IOException {
        BufferedReader br = null;
        Usuarios usuario;       
        try {         
            br = new BufferedReader(new FileReader(archivo));
            String linea = br.readLine();            
            while (null!=linea) {
                String [] campos = linea.split(separador);               
                usuario = new Usuarios();                 
                usuario.setRol(campos[0]);
                usuario.setUsername(campos[1]);
                usuario.setPassword (campos[2]);
                this.agregar(usuario);                
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
        for (Usuarios usuario : usuarios) {
            String linea = usuario.getRol() + separador;
            linea += usuario.getUsername() + separador;
            linea += usuario.getPassword() + separador;
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