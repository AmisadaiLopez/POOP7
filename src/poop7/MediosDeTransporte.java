/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author López Hernández Miriam Amisadai y Martínez Cano Tania
 * Medios de transporte con nombre, combustible
 */
public class MediosDeTransporte extends Object{
    private String nombre,combustible;
/**
 * constructor vacio
 */
    public MediosDeTransporte() {
    }
/**
 * 
 * @param nombre recibe el nombre
 * @param combustible recibe el tipo de combustible
 */
    public MediosDeTransporte(String nombre, String combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }
/**
 * 
 * @return retorna el nombre
 */
    public String getNombre() {
        return nombre;
    }
/**
 * 
 * @param nombre recibe el nombre del transporte
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * 
 * @return retorna el combustible
 */
    public String getCombustible() {
        return combustible;
    }
/**
 * 
 * @param combustible recibe el tipo de combustible
 */
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
    /**
     * metodo que dice que el viaje esta inciando
     */
    public void iniciarViaje(){
        System.out.println("Viaje iniciado");
    }
    /**
     * 
     * @param prendido metodo que dice que el motor esta encendido
     */
    public void encender(String prendido){
        System.out.println("Motor encendido"+ prendido);
    }
    /**
     * metodo que dice que el viaje a finalizado
     */
    public void finalizarViaje(){
        System.out.println("Viaje finalizado");
    }
    /**
     * 
     * @param apagado metodo que dice que el motor esta apagado
     */
    public void apagar(String apagado){
        System.out.println("Motor apagdo"+apagado);
    }
/**
 * 
 * @return retorna los atributos de Medio de Transporte
 */
    @Override
    public String toString() {
        return "MediosDeTransporte{" + "nombre=" + nombre + ", combustible=" + combustible + '}';
    }
}
