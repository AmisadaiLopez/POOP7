/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author López Hernández Miriam Amisadai y Martínez Cano Tania
 * Es un animal con nombre, lugar de origen y color 
 */
public class Animal extends Object{
    private String nombre, lugarOrigen, color;
    /**
     * Constructor vacio de animal
     */
    public Animal(){
    }
    /**
     * 
     * @param nombre recibe el nombre
     * @param lugarOrigen recibe el lugar de origen 
     * @param color recibe el color del animal
     */
    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }
    /**
     * 
     * @return el nombre del animal
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre recibe el nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return el lugar de origen
     */
    public String getLugarOrigen() {
        return lugarOrigen;
    }
    /**
     * 
     * @param lugarOrigen recibe el lugar 
     */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }
    /**
     * 
     * @return retorna el color
     */
    public String getColor() {
        return color;
    }
    /**
     * 
     * @param color recibe el color
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * 
     * @param sonido recibe el sonido que produce el animal
     */
    public void hacerSonido(String sonido){
        System.out.println("Sonido"+sonido);
    }
    /**
     * describe que el animal esta comiendo
     */
    public void comer(){
        System.out.println("Estoy comiendo");
    }
/**
 * 
 * @return retorna los atributos del animal
 */
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + '}';
    }   
}
