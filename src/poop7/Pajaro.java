/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author López Hernández Miriam Amisadai y Martínez Cano Tania
 * Pajaro con tipo de pico con extencion a Animal Aereo
 */
public class Pajaro extends AnimalAereo {
    private String tipoPico;
/**
 * constructor vacio
 */
    public Pajaro() {
    }
/**
 * 
 * @param tipoPico recibe el tipo de pico
 * @param numeroAlas recibe el numero de alas
 * @param nombre recibe el nombre
 * @param lugarOrigen recibe el lugar de origen
 * @param color recibe el color
 */
    public Pajaro(String tipoPico, int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(numeroAlas, nombre, lugarOrigen, color);
        this.tipoPico = tipoPico;
    }
/**
 * 
 * @return retorna el tipo de pico
 */
    public String getTipoPico() {
        return tipoPico;
    }
/**
 * 
 * @param tipoPico recibe el tipo de pico del ave
 */
    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }
    /**
     * metodo que dice que esta recolectando ramas
     */
    public void recolectarRamas(){
        System.out.println("Estoy recolectando ramas para mi nido");
    }
/**
 * 
 * @return retorna los atributos de la clase metro mas los de la extencion
 */
    @Override
    public String toString() {
        return "Pajaro{" + "tipoPico=" + tipoPico +super.toString() + '}';
    }
}
