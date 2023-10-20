/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author López Hernández Miriam Amisadai y Martínez Cano Tania
 * Barco, transporte acuatico con numero de tripulacion, puerto de origen y puerto de destino, mas los atributos de la extencion acuatico
 */
public class Barco extends Acuatico {
    private String tripulacion, puertoOrigen, puertoDestino;
/**
 * constructor vacio
 */
    public Barco() {
    }
/**
 * 
 * @param tripulacion recibe el numero de tripulacion
 * @param puertoOrigen recibe el puerto de origen
 * @param puertoDestino recibe el puerto de destino
 * @param capacidad recibe la capacidad
 * @param velocidad recibe la velocidad
 * @param nombre recibe el nombre
 * @param combustible  recibe el tipo de combustible
 */
    public Barco(String tripulacion, String puertoOrigen, String puertoDestino, String capacidad, int velocidad, String nombre, String combustible) {
        super(capacidad, velocidad, nombre, combustible);
        this.tripulacion = tripulacion;
        this.puertoOrigen = puertoOrigen;
        this.puertoDestino = puertoDestino;
    }
/**
 * 
 * @return retorna la tripulacion
 */
    public String getTripulacion() {
        return tripulacion;
    }
/**
 * 
 * @param tripulacion recibe el numero de personas
 */
    public void setTripulacion(String tripulacion) {
        this.tripulacion = tripulacion;
    }
/**
 * 
 * @return retorna el puerto de origen
 */
    public String getPuertoOrigen() {
        return puertoOrigen;
    }
/**
 * 
 * @param puertoOrigen recibe el nombre del puerto de origen
 */
    public void setPuertoOrigen(String puertoOrigen) {
        this.puertoOrigen = puertoOrigen;
    }
/**
 * 
 * @return retorna puerto de destino
 */
    public String getPuertoDestino() {
        return puertoDestino;
    }
/**
 * 
 * @param puertoDestino recibe el puerto de destino
 */
    public void setPuertoDestino(String puertoDestino) {
        this.puertoDestino = puertoDestino;
    }
    /**
     * metodo que dice que los pasajeros estas abordando
     */
    public void abordarPasajeros(){
        System.out.println("Pasajeros abordando");
    }
    /**
     * metodo que dice que los pasajeros estas desembarcando
     */
    public void desembarcarPasajeros(){
        System.out.println("Pasajeros descendiendo");
    }
/**
 * 
 * @return retorna los atributos del barco mas los de la extencion Acuatico
 */
    @Override
    public String toString() {
        return "Barco{" + "tripulacion=" + tripulacion + ", puertoOrigen=" + puertoOrigen + ", puertoDestino=" + puertoDestino +super.toString()+ '}';
    }   
}
