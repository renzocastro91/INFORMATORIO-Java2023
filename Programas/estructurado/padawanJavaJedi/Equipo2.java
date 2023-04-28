package Programas.estructurado.padawanJavaJedi;
/*
 * Yo elijo el equipo ganador : Modifique el ejercicio anterior en donde usted debe
crear un menú de opciones en donde en ese menú de opciones debe elegir qué
equipo de fútbol quiere saber la información del el ejercicio
 */
public class Equipo2 {
    public static void main(String[] args) {
        
        // Definir los datos de los equipos
        String[] equipo1 = {"Julio César", "Maicon", "Lucio", "Samuel", "Zanetti", "Cambiasso", "Motta", "Sneijder", "Eto'o", "Milito", "Pandev"};
        String[] equipo2 = {"Butt", "Lahm", "Van Buyten", "Badstuber", "Contento", "Van Bommel", "Schweinsteiger", "Robben", "Müller", "Altintop", "Olic"};
        String entrenador1 = "Jose Mourinho";
        String entrenador2 = "Louis Van Gaal";
        String equipo1Nombre = "Inter de Milán";
        String equipo2Nombre = "Bayern Munich";
        
        // Crear el menú de opciones
        System.out.println("Elija el equipo del que desea saber la información:");
        System.out.println("1. " + equipo1Nombre);
        System.out.println("2. " + equipo2Nombre);
        
        // Leer la opción elegida por el usuario
        int opcion = 1; // opción predeterminada
        // OPCIONES: 1 -> Inter de Milán, 2 -> Bayern Munich
        // La opción se puede cambiar para probar diferentes equipos
        switch (opcion) {
            case 1:
                // Mostrar información del Inter de Milán
                System.out.println("\nINFORMACIÓN DEL " + equipo1Nombre);
                System.out.println("Entrenador: " + entrenador1);
                System.out.println("Jugadores:");
                for (String jugador : equipo1) {
                    System.out.println("- " + jugador);
                }
                break;
            case 2:
                // Mostrar información del Bayern Munich
                System.out.println("\nINFORMACIÓN DEL " + equipo2Nombre);
                System.out.println("Entrenador: " + entrenador2);
                System.out.println("Jugadores:");
                for (String jugador : equipo2) {
                    System.out.println("- " + jugador);
                }
                break;
            default:
                System.out.println("Opción inválida");
        }
    }
}
