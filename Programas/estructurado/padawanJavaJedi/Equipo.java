package Programas.estructurado.padawanJavaJedi;
/*
 * Los equipos ganadores : Guarde en variables el nombre de 2 equipos de fútbol,
luego en otras 2 variables el nombre de los entrenadores y luego guarde el nombre
de los jugadores en distintas variables. Luego muestre un encabezado con el
nombre de cada equipo y por cada equipo muestre los nombres de los jugadores.
 */
public class Equipo {
    public static void main(String[] args) {
        String[] equipo1 = {"Julio César", "Maicon", "Lucio", "Samuel", "Zanetti", "Stankovic", "Cambiasso", "Sneijder", "Milito", "Eto'o", "Pandev"};
        String[] equipo2 = {"Butt", "Lahm", "Van Buyten", "Badstuber", "Contento", "Schweinsteiger", "Robben", "Müller", "Ribéry", "Altintop", "Gómez"};
        String[] entrenadores = {"Jose Mourinho", "Louis van Gaal"};
        
        System.out.println("Equipo 1: Inter de Milan");
        System.out.println("Entrenador: " + entrenadores[0]);
        for (int i = 0; i < equipo1.length; i++) {
            System.out.println(equipo1[i]);
        }
        System.out.println("");
        System.out.println("Equipo 2: Bayern Munich");
        System.out.println("Entrenador: " + entrenadores[1]);
        for (int i = 0; i < equipo2.length; i++) {
            System.out.println(equipo2[i]);
        }

    }
}

