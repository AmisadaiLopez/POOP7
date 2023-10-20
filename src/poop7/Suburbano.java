/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author López Hernández Miriam Amisadai y Martínez Cano Tania
 * Suburbano transporte con horario que maneja, ciudad en la que esta, con una extencion a Subterraneo
 */
public class Suburbano extends Subterraneo {
    private String horario, ciudad;
/**
 * constructor vacio
 */
    public Suburbano() {
    }
/**
 * 
 * @param horario recibe el hoario
 * @param ciudad recibe la ciudad
 * @param costo recibe el costo
 * @param capacidad recibe la capacidad
 * @param velocidad recibe la velocidad
 * @param nombre recibe el nombre
 * @param combustible recibe el tipo de combustible
 */
    public Suburbano(String horario, String ciudad, int costo, String capacidad, int velocidad, String nombre, String combustible) {
        super(costo, capacidad, velocidad, nombre, combustible);
        this.horario = horario;
        this.ciudad = ciudad;
    }
/**
 * 
 * @return retorna el hoario
 */
    public String getHorario() {
        return horario;
    }
/**
 * 
 * @param horario recibe el horario
 */
    public void setHorario(String horario) {
        this.horario = horario;
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
 * @param ciudad recibe la ciudad
 */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    /**
     * metodo que dice que esta inciando el viaje
     */
    public void iniciarViaje(){
        System.out.println("Iniciando viaje");
    }
    /**
     * metodo que dice que el viaje finalizo
     */
    public void finalizarViaje(){
        System.out.println("Finalizando viaje");
    }
    /**
     * metodo donde se consulta el horario
     */
    public void consultarHorario(){
        System.out.println("Horario matutino");
    }
/**
 * 
 * @return retorna los atributos de la clase Suburbano mas la extencion
 */
    @Override
    public String toString() {
        return "Suburbano{" + "horario=" + horario + ", ciudad=" + ciudad +super.toString() + '}';
    }   
}
