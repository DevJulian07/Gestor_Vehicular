/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Vehiculo;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class GestorVehiculos {
    private ArrayList<Vehiculo> listaVehiculos;
    
    public GestorVehiculos() {
        this.listaVehiculos = new ArrayList<>();  
    }
    
     public void agregarVehiculo(String pais, String marca, String tipoVehiculo, String modelo, int anioFabricacion, boolean esNuevo){
         Vehiculo nuevoVehiculo = new Vehiculo(pais, marca, tipoVehiculo, modelo, anioFabricacion, esNuevo);
         this.listaVehiculos.add(nuevoVehiculo);
        }
     public String eliminarVehiculo(int indice){
         if (indice >=0 && indice < this.listaVehiculos.size()){
             Vehiculo eliminado = this.listaVehiculos.get(indice);
             this.listaVehiculos.remove(indice);
             return "vehiculo eliminado: " + eliminado.getMarca() + "" + eliminado.getModelo();
         } else {
             return "Error: indice invalido.";
         }
     }
     
     public String buscarVehiculo(String marca){
     String resultado = ""; 
      for (int i = 0; i < this.listaVehiculos.size(); i++) {
      Vehiculo vehiculoActual = this.listaVehiculos.get(i);
      if (vehiculoActual.getMarca().equalsIgnoreCase(marca)){
        resultado = resultado + "[" + i + "]" + vehiculoActual.toString();
      }
      }
      
      if (resultado.isEmpty()) {
        return "No se encontro ningun vehiculo de la marca: " + marca;
      }
      
      return resultado;
     }
     
     public String obtenerTodos() {
     
        if (this.listaVehiculos.isEmpty()){
            return "no hay vehiculos registrados.";
        }
     
        String resultado = "";
        
        for (int i=0; i < this.listaVehiculos.size(); i++){
            resultado = resultado + "[" + i + "]" + this.listaVehiculos.get(i).toString();
        } 
        
        return resultado;
     }
     
     public ArrayList<Vehiculo> getListaVehiculos() {
        return this.listaVehiculos;
    }
     
     
}
