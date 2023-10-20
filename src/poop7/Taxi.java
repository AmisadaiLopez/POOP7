/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author López Hernández Miriam Amisadai y Martínez Cano Tania
 * Taxi medio de transporte terrestre con tarifa base, y disponibilidad con extencion a Supraterraneo
 */
public class Taxi extends Supraterraneo {
    private String tarifaBase, disponible;
/**
 * constructor vacio
 */
    public Taxi() {
    }
/**
 * 
 * @param tarifaBase recibe la tarifa base
 * @param disponible recibe si esta disponible o no
 */
    public Taxi(String tarifaBase, String disponible) {
        this.tarifaBase = tarifaBase;
        this.disponible = disponible;
    }
/**
 * 
 * @return retorna la tarifa base
 */
    public String getTarifaBase() {
        return tarifaBase;
    }
/**
 * 
 * @param tarifaBase recibe la tarifa base
 */
    public void setTarifaBase(String tarifaBase) {
        this.tarifaBase = tarifaBase;
    }
/**
 * 
 * @return retorna disponible
 */
    public String getDisponible() {
        return disponible;
    }
/**
 * 
 * @param disponible recibe si esta disponible o no
 */
    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }
    /**
     * segundo metodo sobreescrito
     * dice que esta inciando viaje
     */
    @Override
    public void iniciarViaje(){
        System.out.println("Viaje iniciado");
    }
    /**
     * metodo que dice que el vaije a terminado
     */
    public void terminarViaje(){
        System.out.println("Viaje terminado");
    }
/**
 * 
 * @return retorna los traibutos de la clase Taxi mas los de la extencion
 */
    @Override
    public String toString() {
        return "Taxi{" + "tarifaBase=" + tarifaBase + ", disponible=" + disponible +super.toString() + '}';
    }
}
