/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author López Hernández Miriam Amisadai y Martínez Cano Tania
 * Supraterraneo medio de transporte que va por el suelo con aceleracion mas la extencion Terrestre
 */
public class Supraterraneo extends Terrestre {
    private String acelerando;
/**
 * constructor vacio
 */
    public Supraterraneo() {
    }
/**
 * 
 * @param velocidad recibe la velocidad
 */
    public Supraterraneo(String velocidad) {
        this.acelerando = velocidad;
    }
/**
 * 
 * @param acelerando recibe la aceleracion
 * @param capacidad recibe la capacidad
 * @param velocidad recibe la velocidad
 * @param nombre recibe el nombre
 * @param combustible recibe el tipo de combustible
 */
    public Supraterraneo(String acelerando, String capacidad, int velocidad, String nombre, String combustible) {
        super(capacidad, velocidad, nombre, combustible);
        this.acelerando = acelerando;
    }
/**
 * 
 * @return retorna acelerando
 */
    public String getAcelerando() {
        return acelerando;
    }
/**
 * 
 * @param acelerando recibe un acelerando
 */
    public void setAcelerando(String acelerando) {
        this.acelerando = acelerando;
    }
    /**
     * metodo que dice cuanto abarca la tarifa
     */
    public void calcularTarifa(){
        System.out.println("La tarifa abarca de $7.5 a $200");
    }
    /**
     * metodo que dice la disponibilidad
     */
    public void verificarDisponibilidad(){
        System.out.println("Se encuentra disponible");
    }
/**
 * 
 * @return retorna los atributos de Supraterraneo mas los de la extencion 
 */
    @Override
    public String toString() {
        return "Supraterraneo{" + "acelerando=" + acelerando +super.toString()+ '}';
    }  
}
