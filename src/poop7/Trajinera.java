/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author López Hernández Miriam Amisadai y Martínez Cano Tania
 * Trajinera transporte acuatico con nombre de la Trajinera, y extencion a Acuatico
 */
public class Trajinera extends Acuatico {
    private String nombreTrajinera; 
/**
 * constructor vacio
 */
    public Trajinera() {
    }
/**
 * 
 * @param nombreTrajinera recibe el nombre de la trajinera
 * @param capacidad recibe la capacidad
 * @param velocidad recibe la velocidad
 * @param nombre recibe el nombre
 * @param combustible recibe el tipo de combustible
 */
    public Trajinera(String nombreTrajinera, String capacidad, int velocidad, String nombre, String combustible) {
        super(capacidad, velocidad, nombre, combustible);
        this.nombreTrajinera = nombreTrajinera;
    }
/**
 * 
 * @return retorna el nombre de la trajinera
 */
    public String getNombreTrajinera() {
        return nombreTrajinera;
    }
/**
 * 
 * @param nombreTrajinera recibe el nombre de la trajinera
 */
    public void setNombreTrajinera(String nombreTrajinera) {
        this.nombreTrajinera = nombreTrajinera;
    }
    /**
     * metodo que dice que el pase se esta iniciando
     */
    public void iniciarPaseo(){
        System.out.println("Paseo iniciado");
    }
/**
 * 
 * @return retorna los atributos de la clase Trajinera y su extencion
 */
    @Override
    public String toString() {
        return "Trajinera{" + "nombreTrajinera=" + nombreTrajinera +super.toString() + '}';
    }  
}
