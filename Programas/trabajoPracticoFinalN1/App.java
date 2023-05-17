package Programas.trabajoPracticoFinalN1;
import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

import Programas.trabajoPracticoFinalN1.dominio.*;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
                
       
    }
    public static Posicion crearPosicion(){
        System.out.println("-->POSICION<--");
        Posicion nuevaPos = new Posicion();
        int pos;
        System.out.println("Seleccione una posicion: 1- Arquero 2- Defensor 3- Mediocampista 4- Delantero");
        pos = getScanner().nextInt();
        switch (pos){
            case 1:
                nuevaPos.setNombre("Arquero"); 
                break;
            case 2:
                nuevaPos.setNombre("Defensor");
                break;
            case 3: 
                nuevaPos.setNombre("Mediocampista");
                break;
            case 4:
                nuevaPos.setNombre("Delantero");
                break;
            default:
                System.out.println("Elección incorrecta");
                crearPosicion();
        }

        return nuevaPos;
    }

    public static Entrenador crearEntrenador(){
        System.out.println("-->ENTRENADOR<--");
        Entrenador nuevoEntrenador = new Entrenador();
        System.out.println("Ingrese Nombre");
        nuevoEntrenador.setNombre(getScanner().nextLine());
        System.out.println("Ingrese Apellido");
        nuevoEntrenador.setApellido(getScanner().nextLine());
        System.out.println("Ingrese Edad");
        nuevoEntrenador.setEdad(getScanner().nextInt());
        return nuevoEntrenador;
    }

    public static boolean determinarCapitan(){
        boolean esCapitan = false;
        int cap;
        System.out.println("Este jugador es capitan? 1- SI 2 - NO");
        cap = getScanner().nextInt();
        switch (cap){
            case 1:
            esCapitan = true; 
            break;
            case 2: 
            esCapitan = false;
            break;
            default: 
            System.out.println("Opción incorrecta");
            determinarCapitan();
        }
        return esCapitan; 
    }

    public static Jugador crearJugador(){
        System.out.println("-->Jugador<--");
        Jugador nuevoJugador = new Jugador();
        nuevoJugador.setId(UUID.randomUUID());
        System.out.println("Ingrese Nombre");
        nuevoJugador.setNombre(getScanner().nextLine());
        System.out.println("Ingrese Apellido");
        nuevoJugador.setApellido(getScanner().nextLine());
        System.out.println("Ingrese Altura");
        nuevoJugador.setAltura(getScanner().nextDouble());
        System.out.println("Cree una posición para el jugador");
        nuevoJugador.setPosicion(crearPosicion());
        nuevoJugador.setGoles(0);
        nuevoJugador.setPartidos(0);
        nuevoJugador.setEsCapitan(determinarCapitan());
        System.out.println("Ingrese Numero de camiseta");
        nuevoJugador.setNumeroCamiseta(getScanner().nextInt());
        return nuevoJugador;
    }

    public static Equipo crearEquipo(){
        System.out.println("-->Equipo<--");
        Equipo nuevoEquipo = new Equipo();
        System.out.println("Ingrese Nombre del equipo");
        nuevoEquipo.setFechaCreacion(LocalDate.now());
        nuevoEquipo.setEntrenador(crearEntrenador());
        Jugador jugador;
        List<Jugador> jugadores= null;
        for (int i = 0; i < 9; i++){
            System.out.println("Jugador N°" + i);
            jugador = crearJugador();
            jugadores.add(jugador);
        }
        nuevoEquipo.setJugadores(jugadores);
        System.out.println("Ingrese nombre de la cancha local");
        nuevoEquipo.setNombreCancha(getScanner().nextLine());
        
        return nuevoEquipo;
    }


    public static Scanner getScanner() {
        return scanner;
    }

}

   
