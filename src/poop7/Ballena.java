/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author López Hernández Miriam Amisadai y Martínez Cano Tania
 * Ballena animal acuatico que recibe el largo mas los atributos de la extencion
 */
public class Ballena extends AnimalAcuatico {
    private int largo;
/**
 * constructor vacio
 */
    public Ballena() {
    }
/**
 * 
 * @param largo recibe el largo
 * @param numeroAletas recibe el numero de aletas 
 * @param nombre recibe el nombre
 * @param lugarOrigen recibe el lugar de origen
 * @param color recibe el color
 */
    public Ballena(int largo, int numeroAletas, String nombre, String lugarOrigen, String color) {
        super(numeroAletas, nombre, lugarOrigen, color);
        this.largo = largo;
    }
/**
 * 
 * @return retorna el largo
 */
    public int getLargo() {
        return largo;
    }
/**
 * 
 * @param largo recibe el largo de la ballena
 */
    public void setLargo(int largo) {
        this.largo = largo;
    }
    /**
     * metodo que dice que esta peleando con Pinocho
     */
    public void pelearConPinocho(){
        System.out.println("Estoy peleando");
    }
/**
 * 
 * @return retorna los atributos de la ballena mas los de la extencion animal acuatico
 */
    @Override
    public String toString() {
        return "Ballena{" + "largo=" + largo +super.toString()+ '}';
    }        
}
