/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author López Hernández Miriam Amisadai y Martínez Cano Tania
 * Subterraneo medio de transporte por debajo del suelo con un costo y una extencion a Terrestre
 */
public class Subterraneo extends Terrestre {
    private int costo;
/**
 * constructor vacio
 */
    public Subterraneo() {
    }
/**
 * 
 * @param costo recibe el costo
 * @param capacidad recibe la capacidad
 * @param velocidad recibe la velocidad
 * @param nombre recibe el nombre
 * @param combustible recibe el tipo de combustible
 */
    public Subterraneo(int costo, String capacidad, int velocidad, String nombre, String combustible) {
        super(capacidad, velocidad, nombre, combustible);
        this.costo = costo;
    }
/**
 * 
 * @return retorna el costo
 */
    public int getCosto() {
        return costo;
    }
/**
 * 
 * @param costo recibe el costo del transporte
 */
    public void setCosto(int costo) {
        this.costo = costo;
    }
    /**
     * metodo que dice que esta iniciando el viaje
     */
    public void iniciarViaje(){
        System.out.println("Viaje iniciado");
    }
/**
 * 
 * @return retorna los atributos de subterraneo mas los de su extencion
 */
    @Override
    public String toString() {
        return "Subterraneo{" + "costo=" + costo +super.toString()+ '}';
    }   
}
