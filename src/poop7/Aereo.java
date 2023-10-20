/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author López Hernández Miriam Amisadai y Martínez Cano Tania
 * Es un transporte aereo con la extencion de medios de transporte y metodos capacidad y velocidad
 */
public class Aereo extends MediosDeTransporte {
    private String capacidad;
    private int velocidad;
/**
 * constructor vacio
 */
    public Aereo() {
    }
/**
 * 
 * @param capacidad recibe la capacidad
 * @param velocidad recibe la velocidad
 * @param nombre recibe el nombre 
 * @param combustible recibe el tipo de combustible
 */
    public Aereo(String capacidad, int velocidad, String nombre, String combustible) {
        super(nombre, combustible);
        this.capacidad = capacidad;
        this.velocidad = velocidad;
    }
/**
 * 
 * @return retorna la capacidad
 */
    public String getCapacidad() {
        return capacidad;
    }
/**
 * 
 * @param capacidad capacidad que aguanta el transporte
 */
    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
/**
 * 
 * @return  retorna la velocidad
 */
    public int getVelocidad() {
        return velocidad;
    }
/**
 * 
 * @param velocidad velocidad a la que va el transporte
 */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    /**
     * metodo que dice que esta despegando 
     */
    public void despegar(){
        System.out.println("El transporte esta despegando");
    }
    /**
     * metodo que dice que esta aterrizando
     */
    public void aterrizar(){
        System.out.println("El transporte esta aterrizando");
    }
/**
 * 
 * @return retorna los atributos del transporte aereo
 */
    @Override
    public String toString() {
        return "Aereo{" + "capacidad=" + capacidad + ", velocidad=" + velocidad +super.toString()+ '}';
    }   
}
