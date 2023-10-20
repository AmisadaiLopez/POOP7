/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author López Hernández Miriam Amisadai y Martínez Cano Tania
 * Transportes acuaticos, los que van por el agua con capacidad y velocidad
 */
public class Acuatico extends MediosDeTransporte {
    private String capacidad;
    private int velocidad; 
/**
 * constructor vacio
 */
    public Acuatico() {
    }
/**
 * 
 * @param capacidad recibe la capacidad que aguanta 
 * @param velocidad recibe la velocidad a la que va
 * @param nombre recibe el nombre del trasnporte
 * @param combustible recibe el tipo de combustible que usa
 */
    public Acuatico(String capacidad, int velocidad, String nombre, String combustible) {
        super(nombre, combustible);
        this.capacidad = capacidad;
        this.velocidad = velocidad;
    }
/**
 * 
 * @return capacidad 
 */
    public String getCapacidad() {
        return capacidad;
    }
/**
 * 
 * @param capacidad cuanto se puede meter en el transporte
 */
    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
/**
 * 
 * @return velocidad 
 */
    public int getVelocidad() {
        return velocidad;
    }
/**
 * 
 * @param velocidad la velocidad a la que va el transporte
 */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    /**
     * metodo que dice que va aumentando la velocidad
     */
    public void aumentarVelocidad(){
        System.out.println("Esta aumentando la velocidad");
    }
    /**
     * metodo que dice que disminuye la velocidad
     */
    public void disminuirVelocidad(){
        System.out.println("Esta disminuyendo la velocidad");
    }
/**
 * 
 * @return retorna los atributos de la clase acuatico
 */
    @Override
    public String toString() {
        return "Acuatico{" + "capacidad=" + capacidad + ", velocidad=" + velocidad+super.toString() + '}';
    }    
}
