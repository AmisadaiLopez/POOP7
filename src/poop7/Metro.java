/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author López Hernández Miriam Amisadai y Martínez Cano Tania
 * Metro medio de transporte terrestre con estacion y ciudad con extencion subterraneo
 */
public class Metro extends Subterraneo {
    private String estacion, ciudad;
/**
 * constructor vacio
 */
    public Metro() {
    }
/**
 * 
 * @param estacion recibe la estacion
 * @param ciudad recibe la ciudad
 * @param costo recibe el costo
 * @param capacidad recibe la capacidad
 * @param velocidad recibe la velocidad
 * @param nombre recibe el nombre
 * @param combustible recibe el tipo de combustible
 */
    public Metro(String estacion, String ciudad, int costo, String capacidad, int velocidad, String nombre, String combustible) {
        super(costo, capacidad, velocidad, nombre, combustible);
        this.estacion = estacion;
        this.ciudad = ciudad;
    }
/**
 * 
 * @return retorna la estacion
 */
    public String getEstacion() {
        return estacion;
    }
/**
 * 
 * @param estacion recibe el nombre de la estacion
 */
    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }
/**
 * 
 * @return retorna la ciudad
 */
    public String getCiudad() {
        return ciudad;
    }
/**
 * 
 * @param ciudad recibe la ciudad donde se encuentra el metro
 */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    /**
     * metodo donde dice que esta abordando
     */
    public void abordar(){
        System.out.println("Abordando");
    }
    /**
     * metodo que dice que esta descendiendo
     */
    public void descender(){
        System.out.println("Descendiendo");
    }
/**
 * 
 * @return retorna los atributos de la clase metro mas los de la extencion subterraneo
 */
    @Override
    public String toString() {
        return "Metro{" + "estacion=" + estacion + ", ciudad=" + ciudad +super.toString()+ '}';
    }  
}
