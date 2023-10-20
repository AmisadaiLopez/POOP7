/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author López Hernández Miriam Amisadai y Martínez Cano Tania
 * Perro, animal con colo de collar con extencion Animal Terrestte
 */
public class Perro extends AnimalTerrestre {
    private String colorCollar;
/**
 * constructor vacio
 */
    public Perro() {
    }
/**
 * 
 * @param colorCollar recibe el color de collar
 * @param numeroPatas recibe el numero de patas
 * @param nombre recibe el nombre
 * @param lugarOrigen recibe el lugar de origen
 * @param color recibe el color
 */
    public Perro(String colorCollar, int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(numeroPatas, nombre, lugarOrigen, color);
        this.colorCollar = colorCollar;
    }
/**
 * 
 * @return retorna el color de collar
 */
    public String getColorCollar() {
        return colorCollar;
    }
/**
 * 
 * @param colorCollar recibe el color de collar del animal
 */
    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    /**
     * metodo que dice que el animal esta haciendo trucos
     */
    public void hacerTrucos(){
        System.out.println("Estoy brincando");
    }
/**
 * 
 * @return retorna los atributos de la clase perro mas los de la extencion
 */
    @Override
    public String toString() {
        return "Perro{" + "colorCollar=" + colorCollar +super.toString()+ '}';
    }  
}
