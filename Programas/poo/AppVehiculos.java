package Programas.poo;

import Programas.poo.dominio.Vehiculo;

public class AppVehiculos {
    public static void main(String[] args) {
        //Instanciamos
        Vehiculo vehiculo1 = new Vehiculo("BMW", 4, true, true, "2000", "200");
        Vehiculo vehiculo2= new Vehiculo("Ford", 4, true, true, "2000", "200");
        Vehiculo vehiculo3= new Vehiculo("Audi", 4, true, false, "2000", "200");
        
        Vehiculo[] vehiculos = {vehiculo1, vehiculo2, vehiculo3};

        for (int i = 0; i < vehiculos.length; i++){
            vehiculos[i].acelerarVehiculo();
            System.out.println("");
        }
    }
}
