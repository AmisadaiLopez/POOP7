/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author López Hernández Miriam Amisadai y Martínez Cano Tania
 * Animal acuatico con extencion de animal y recibe parametros de numero de aletas 
 */
public class AnimalAcuatico extends Animal {
    private int numeroAletas;
/**
 * constructor vacio
 */
    public AnimalAcuatico() {
    }
/**
 * 
 * @param numeroAletas recibe el numero de aletas
 * @param nombre recibe el nombre 
 * @param lugarOrigen recibe el lugar de origen 
 * @param color recibe el color
 */
    public AnimalAcuatico(int numeroAletas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAletas = numeroAletas;
    }
/**
 * 
 * @return retorna el numero de aletas
 */
    public int getNumeroAletas() {
        return numeroAletas;
    }
/**
 * 
 * @param numeroAletas recibe el numero de aletas
 */
    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }
    /**
     * metodo que dice que esta nadando
     */
    public void nadar(){
        System.out.println("Estoy nadando");
    }
    /**
     * segundo metodo sobreescrito
     * metodo que describe que esta comiendo
     */
    @Override
    public void comer(){
        System.out.println("Estoy comiendo peces");
    }
/**
 * 
 * @return retorna los atributos de la clase Animal Acuatico mas los metodos del padre
 */
    @Override
    public String toString() {
        return "AnimalAcuatico{" + "numeroAletas=" + numeroAletas +super.toString()+ '}';
    }  
}
