/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author López Hernández Miriam Amisadai y Martínez Cano Tania
 * Comb, transporte terrestre de tipo supraterraneo con ruta, mas los atributos de la extencion supraterraneo
 */
public class Combi extends Supraterraneo {
    private String ruta;
/**
 * constructor vacio
 */
    public Combi() {
    }
/**
 * 
 * @param ruta recibe la ruta
 */
    public Combi(String ruta) {
        this.ruta = ruta;
    }
/**
 * 
 * @return retorna la ruta
 */
    public String getRuta() {
        return ruta;
    }
/**
 * 
 * @param ruta recibe la ruta de la combi
 */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    /**
     * segundo metodo sobreescrito
     * dice que el viaje esta iniciando
     */
    @Override
    public void iniciarViaje(){
        System.out.println("Viaje iniciado");
    }
    /**
     * metodo que dice que el viaje esta finalizando
     */
    public void finalizarVije(){
        System.out.println("Viaje finalizado");
    }
/**
 * 
 * @return retorna los atributos de la combi mas los de la extencion 
 */
    @Override
    public String toString() {
        return "Combi{" + "ruta=" + ruta +super.toString()+ '}';
    }
}
