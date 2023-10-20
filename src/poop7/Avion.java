/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author López Hernández Miriam Amisadai y Martínez Cano Tania
 * Avion es un transporte con extencion aereo que recibe el aeropuerto y el nombre del piloto
 */
public class Avion extends Aereo {
    private String aeropuerto, piloto; 
/**
 * constructor vacio
 */
    public Avion() {
    }
/**
 * 
 * @param aeropuerto recibe el aeropuesto
 * @param piloto recibe el nombre del piloto
 * @param capacidad recibe la capacidad del avion
 * @param velocidad recibe la velocidad del avion
 * @param nombre recibe el nombre
 * @param combustible recibe el tipo de combustible
 */
    public Avion(String aeropuerto, String piloto, String capacidad, int velocidad, String nombre, String combustible) {
        super(capacidad, velocidad, nombre, combustible);
        this.aeropuerto = aeropuerto;
        this.piloto = piloto;
    }
/**
 * 
 * @return retorna el aeropuerto
 */
    public String getAeropuerto() {
        return aeropuerto;
    }
/**
 * 
 * @param aeropuerto recibe el nombre del aeropuerto
 */
    public void setAeropuerto(String aeropuerto) {
        this.aeropuerto = aeropuerto;
    }
/**
 * 
 * @return retorna el piloto
 */
    public String getPiloto() {
        return piloto;
    }
/**
 * 
 * @param piloto recibe el nombre del piloto
 */
    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }
    /**
     * 
     * @param destino lugar al que va el avion
     */
    public void despegar(String destino){
        System.out.println("Avion despegando"+destino);
    }
    /**
     * 
     * @param aeropuerto aeropuerto donde aterriza el avion
     */
    public void aterrizar(String aeropuerto){
        System.out.println("Avion aterrizando"+aeropuerto);
    }
/**
 * 
 * @return retorna los atributos del Avion mas los de la extencion aereo
 */
    @Override
    public String toString() {
        return "Avion{" + "aeropuerto=" + aeropuerto + ", piloto=" + piloto +super.toString()+ '}';
    }  
}
