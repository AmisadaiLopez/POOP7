/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author López Hernández Miriam Amisadai y Martínez Cano Tania
 * medio de transporte Terrestre con capacidad y velocidad y una extencion a Medios de Transporte
 */
public class Terrestre extends MediosDeTransporte {
    private String capacidad;
    private int velocidad; 
/**
 * constructor vacio
 */
    public Terrestre() {
    }
/**
 * 
 * @param capacidad recibe la capacidad
 * @param velocidad recibe la velocidad
 * @param nombre recibe el nombre
 * @param combustible recibe el tipo de combustible
 */
    public Terrestre(String capacidad, int velocidad, String nombre, String combustible) {
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
 * @param capacidad recibe la capacidad
 */
    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
/**
 * 
 * @return retorna la velocidad
 */
    public int getVelocidad() {
        return velocidad;
    }
/**
 * 
 * @param velocidad recibe la velocidad
 */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    /**
     * metodo que dice que esta acelerando
     */
    public void acelear(){
        System.out.println("Esta subiendo la velocidad");
    }
    /**
     * metodo que dice que esta frenando
     */
    public void frenar(){
        System.out.println("Esta frenando");
    }
/**
 * 
 * @return retorna los atributos de la clase Terrestre y la extencion
 */
    @Override
    public String toString() {
        return "Terrestre{" + "capacidad=" + capacidad + ", velocidad=" + velocidad +super.toString()+ '}';
    }   
}
