/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author López Hernández Miriam Amisadai y Martínez Cano Tania
 * Animal terrestre que recibe el numero de patas mas los metodos de la extencion de la clase Animal
 */
public class AnimalTerrestre extends Animal {
    private int numeroPatas;
/**
 * constructor vacio
 */
    public AnimalTerrestre() {
    }
/**
 * 
 * @param numeroPatas recibe el numero de patas
 * @param nombre recibe el nombre
 * @param lugarOrigen recibe el lugar de origen
 * @param color recibe el color
 */
    public AnimalTerrestre(int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroPatas = numeroPatas;
    }
/**
 * 
 * @return retorna el numero de patas
 */
    public int getNumeroPatas() {
        return numeroPatas;
    }
/**
 * 
 * @param numeroPatas recibe el numero de patas
 */
    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
    /**
     * metodo que dice que esta corriendo
     */
    public void correr(){
        System.out.println("Estoy corriendo");
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
 * @return retorna los atributos del animal terrestre mas los de la extencion animal
 */
    @Override
    public String toString() {
        return "AnimalTerrestre{" + "numeroPatas=" + numeroPatas +super.toString()+ '}';
    }   
}
