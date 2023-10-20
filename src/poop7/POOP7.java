/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;

/**
 *
 * @author López Hernández Miriam Amisadai y Martínez Cano Tania
 */
public class POOP7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Clase padre o super clase
        Animal animal =new Animal();
        animal.setNombre("Max");
        animal.setLugarOrigen("CDMX");
        animal.setColor("Negro");
        System.out.println(animal.toString());
        
        //Clase hija 1 o subclase
        AnimalAcuatico animalAcuatico=new AnimalAcuatico();
        animalAcuatico.setNombre("Leo");
        animalAcuatico.setLugarOrigen("Africa");
        animalAcuatico.setColor("Gris");
        animalAcuatico.setNumeroAletas(4);
        System.out.println(animalAcuatico);
        //Clase nieta 1
        Ballena ballena= new Ballena();
        ballena.setLargo(32);
        ballena.setNombre("Wilson");
        ballena.setLugarOrigen("Canada");
        ballena.setColor("Gris");
        System.out.println(ballena);
        
        //Clase hija 2
        AnimalTerrestre animalTerrestre= new AnimalTerrestre();
        animalTerrestre.setNumeroPatas(4);
        animalTerrestre.setNombre("Paquita");
        animalTerrestre.setLugarOrigen("Mexico");
        animalTerrestre.setColor("Azul");
        System.out.println(animalTerrestre);
        //Clase nieta 2
        Perro perro=new Perro();
        perro.setColorCollar("Rojo");
        perro.setNombre("Manchas");
        perro.setLugarOrigen("Mi casa");
        perro.setColor("Negro con blanco y cafe");
        System.out.println(perro);
        
        //Clase hija 3
        AnimalAereo animalAereo=new AnimalAereo();
        animalAereo.setNumeroAlas(2);
        animalAereo.setNombre("Princesa");
        animalAereo.setLugarOrigen("Australia");
        animalAereo.setColor("Blanco");
        System.out.println(animalAereo);
        //Clase nieta 3
        Pajaro pajaro= new Pajaro();
        pajaro.setTipoPico("Ancho");
        pajaro.setNombre("Blue");
        pajaro.setLugarOrigen("Brasil");
        pajaro.setColor("Azul");
        System.out.println(pajaro);
        
        
        //Clase padre o super padre
        MediosDeTransporte mediosDeTransporte = new MediosDeTransporte();
        mediosDeTransporte.setNombre("Coche");
        mediosDeTransporte.setCombustible("Gasolina");
        System.out.println( mediosDeTransporte);
        
        //Clase hija 1
        Terrestre terrestre = new Terrestre();
        terrestre.setCapacidad("200 Personas");
        terrestre.setVelocidad(100);
        terrestre.setNombre("Autobus");
        terrestre.setCombustible("Diesel");
        System.out.println(terrestre);
        //Clase nieta 1
        Subterraneo subterraneo=new Subterraneo();
        subterraneo.setCosto(5-25);
        subterraneo.setNombre("Metro o Suburbano");
        subterraneo.setCapacidad("300 personas");
        subterraneo.setVelocidad(50);
        subterraneo.setCombustible("Electricidad");
        System.out.println(subterraneo);
        //Clase bisnieta 1
        Metro metro= new Metro();
        metro.setCapacidad("250 personas");
        metro.setCosto(5);
        metro.setVelocidad(80);
        metro.setCombustible("Electricidad");
        //Clase bisnieta 2
        Suburbano suburbano=new Suburbano();
        suburbano.setCiudad("Estado de Mexico");
        suburbano.setHorario("7:00am a 23:00pm");
        suburbano.setCosto(10-25);
        suburbano.setCapacidad("150 personas");
        suburbano.setVelocidad(80);
        suburbano.setCombustible("Electricidad");
        System.out.println(suburbano);
        //Clase nieta 2
        Supraterraneo supraterraneo= new Supraterraneo();
        supraterraneo.setAcelerando("30 km/h a 80 km/h");
        supraterraneo.setCapacidad("2 a 10 personas");
        supraterraneo.setCombustible("Diesel");
        System.out.println(supraterraneo);
        //Clase bisnieta 3
        Taxi taxi=new Taxi();
        taxi.setTarifaBase("$13.10 y lo que marque el taximetro");
        taxi.setDisponible("Disponible");
        taxi.setCapacidad("4");
        taxi.setVelocidad(70-80);
        taxi.setCombustible("Diesel");
        System.out.println(taxi);
        //Clase bisnieta 4
        Combi combi=new Combi();
        combi.setRuta("Iztapalapa");
        combi.setVelocidad(50-120);
        combi.setCapacidad("18 personas");
        combi.setCombustible("Diesel");
        System.out.println(combi);
        
        //Clase hija 2
        Acuatico acuatico=new Acuatico();
        acuatico.setNombre("Bunker");
        acuatico.setVelocidad(25);
        acuatico.setCapacidad("18 toneladas");
        acuatico.setCombustible("GNL");
        System.out.println(acuatico);
        //Clase nieta 3
        Trajinera trajinera= new Trajinera();
        trajinera.setNombreTrajinera("Camila");
        trajinera.setCapacidad("18 personas");
        trajinera.setVelocidad(10);
        trajinera.setCombustible("Remar");
        System.out.println(trajinera);
        //Clase nieta 4
        Barco barco= new Barco();
        barco.setTripulacion("Marineros");
        barco.setPuertoOrigen("Puerto Ensenada");
        barco.setPuertoDestino("Puerto Lazaro Cardenas");
        barco.setCapacidad("30 a 2300 pasajeros");
        barco.setCombustible("fueloil pesado");
        barco.setVelocidad(30);
        System.out.println(barco);
        
        //Clase hija 3
        Aereo aereo=new Aereo();
        aereo.setCapacidad("4 a 30 personas");
        aereo.setVelocidad(250);
        aereo.setCombustible("Distintos combustibles");
        System.out.println(aereo);
        //Clase nieta 5
        Avion avion=new Avion();
        avion.setAeropuerto("AIFA");
        avion.setPiloto("Carlos");
        avion.setCapacidad("70 personas");
        avion.setCombustible("combustible de turbina de aviacion");
        avion.setVelocidad(860);
        System.out.println(avion);
        //Clase nieta 6
        Helicoptero helicoptero= new Helicoptero();
        helicoptero.setNumeroRegistro(1905);
        helicoptero.setUbicacion("Mexico");
        helicoptero.setCapacidad("5 personas");
        helicoptero.setCombustible("motores de turbina");
        helicoptero.setVelocidad(278);
        System.out.println(helicoptero);
    }  
}