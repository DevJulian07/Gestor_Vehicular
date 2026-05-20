/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ASUS
 */
public class Vehiculo {

    public Vehiculo(String pais, String marca, String tipoVehiculo, String modelo, int anioFabricacion, boolean esNuevo) {
        this.pais = pais;
        this.marca = marca;
        this.tipoVehiculo = tipoVehiculo;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.esNuevo = esNuevo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public boolean isEsNuevo() {
        return esNuevo;
    }

    public void setEsNuevo(boolean esNuevo) {
        this.esNuevo = esNuevo;
    }
    
    private String pais;
    private String marca;
    private String tipoVehiculo;
    private String modelo;
    private int anioFabricacion;
    private boolean esNuevo;
    
    @Override
    
    public String toString(){
        return "pais: " + this.pais + "\n" + 
               "Marca: " + this.marca + "\n" + 
               "Tipo de Vehiculo: " + this.tipoVehiculo + "\n" + 
               "Modelo: " + this.modelo + "\n" + 
               "Año: " + this.anioFabricacion + "\n" + 
               "Estado: " + (this.esNuevo ? "nuevo" : "usado" )+ "\n" +  "-----------------------------" + "\n";
    }

}
