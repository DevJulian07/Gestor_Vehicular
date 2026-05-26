/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Vehiculo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class GestorArchivos {
    
    public String guardarArchivo(ArrayList<Vehiculo> lista, String rutaArchivo){
        
        if (lista.isEmpty()){
            return "No hay vehiculos para guardar.";
        }
        
        try {
            FileWriter escritor = new FileWriter(rutaArchivo, false);
            
            for (int i =0; i<lista.size(); i++){
                escritor.write("[" + i + "]" + lista.get(i).toString());
            }
            
            escritor.close();
            return "Archivo guardado correctamente en:\n" + rutaArchivo;
        } catch (IOException e){
            return "Error al guardar: "+ e.getMessage();
        }
        
        
    }
    
    public String leerArchivo(String rutaArchivo) {
        File archivo = new File(rutaArchivo);
        if (!archivo.exists()){
            return "El Archivo no existe en: \n" + rutaArchivo;
        }
        
        try {
            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
            String linea;
            String contenido = "";
            while ((linea = lector.readLine()) != null){
                contenido = contenido + linea + "\n";
            }
            lector.close();
            return contenido;
        } catch (IOException e){
            return "Error al leer: " + e.getMessage();
        }
        
    }
    
    public String eliminarArchivo(String rutaArchivo){
        File archivo = new File(rutaArchivo);
        
        if (!archivo.exists()){
                return "No existe ningun archivo en:\n" + rutaArchivo;
        }
        
        if (!archivo.delete()){
            return "Archivo eliminado correctamente.";
        } else {
            return "No se pudo eliminar el archivo.";
        }
    }
    
}
