/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author López Hernández Miriam Amisadai y Martínez Cano Tania
 * Animal aereo que recibe el numero de alas mas los metodos de la extencion Animal
 */
public class AnimalAereo extends Animal {
    private int numeroAlas;
/**
 * constructor vacio
 */
    public AnimalAereo() {
    }
/**
 * 
 * @param numeroAlas recibe el numero de alas del animal
 * @param nombre recibe el nombre 
 * @param lugarOrigen recibe el lugar de origen
 * @param color recibe el color
 */
    public AnimalAereo(int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAlas = numeroAlas;
    }
/**
 * 
 * @return retorna el numero de alas
 */
    public int getNumeroAlas() {
        return numeroAlas;
    }
/**
 * 
 * @param numeroAlas recibe el numero de alas
 */
    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }
    /**
     * metodo que indica que esta volando
     */
    public void volar(){
        System.out.println("Estoy volando");
    }
    /**
     * segundo metodo sobreescrito
     * describe que esta comiendo 
     */
    @Override
    public void comer(){
        System.out.println("Estoy comiendo");
    }
/**
 * 
 * @return retorna los atributos de la clase Animal Aereo mas los que hereda de la clase Animal
 */
    @Override
    public String toString() {
        return "AnimalAereo{" + "numeroAlas=" + numeroAlas +super.toString()+ '}';
    }    
}
