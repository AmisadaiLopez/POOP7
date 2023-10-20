/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author López Hernández Miriam Amisadai y Martínez Cano Tania
 * Helicoptero medio de transpoete aereo con ubicacion y numero de registro
 */
public class Helicoptero extends Aereo {
    private String ubicacion;
    private int numeroRegistro;
/**
 * constructor vacio
 */
    public Helicoptero() {
    }
/**
 * 
 * @param ubicacion recibe la ubicacion
 * @param numeroRegistro recibe el numero de registro
 * @param capacidad recibe la capacidad 
 * @param velocidad recibe la velocidad
 * @param nombre recibe el nombre
 * @param combustible recibe el tipo de combustible
 */
    public Helicoptero(String ubicacion, int numeroRegistro, String capacidad, int velocidad, String nombre, String combustible) {
        super(capacidad, velocidad, nombre, combustible);
        this.ubicacion = ubicacion;
        this.numeroRegistro = numeroRegistro;
    }
/**
 * 
 * @return retorna la ubicacion
 */
    public String getUbicacion() {
        return ubicacion;
    }
/**
 * 
 * @param ubicacion recibe la ubicacion del helicoptero
 */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
/**
 * 
 * @return retorna el numero de resgistro
 */
    public int getNumeroRegistro() {
        return numeroRegistro;
    }
/**
 * 
 * @param numeroRegistro recibe el numero de registro del helicoptero
 */
    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
    /**
     * 
     * @param destino metodo que dice el destino
     */
    public void despegar(String destino){
        System.out.println("El destino es"+destino);
    }
    /**
     * 
     * @param coordenadas metodo que dice donde aterriza el helicoptero
     */
    public void aterrizar(String coordenadas){
        System.out.println("El helicoptero aterrizo en"+coordenadas);
    }
/**
 * 
 * @return retorna los atributos de la clase helicoptero mas los de la extencion aereo
 */
    @Override
    public String toString() {
        return "Helicoptero{" + "ubicacion=" + ubicacion + ", numeroRegistro=" + numeroRegistro +super.toString()+ '}';
    }   
}
