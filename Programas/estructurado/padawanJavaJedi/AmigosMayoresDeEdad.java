package Programas.estructurado.padawanJavaJedi;
import java.util.Scanner;
/*
 * Mis amigos y su edad: Guarda en variables el nombre de N cantidad de amigos,
itere sobre esa cantidad luego muestre el nombre de cada amigo si y sólo si este
amigo es mayor de edad, en caso de ser menor de edad imprima un mensaje
diciendole a ese amigo porque no lo muestra por pantalla.

Lo resolvi con Array
 */
public class AmigosMayoresDeEdad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de amigos: ");
        int cantidadAmigos = sc.nextInt();

        String[] nombres = new String[cantidadAmigos];
        int[] edades = new int[cantidadAmigos];

        // Pedir los nombres y edades de los amigos
        for (int i = 0; i < cantidadAmigos; i++) {
            System.out.print("Ingrese el nombre del amigo " + (i + 1) + ": ");
            nombres[i] = sc.next();

            System.out.print("Ingrese la edad del amigo " + (i + 1) + ": ");
            edades[i] = sc.nextInt();
        }

        // Mostrar los nombres de los amigos mayores de edad
        System.out.println("\nNombres de amigos mayores de edad:");
        for (int i = 0; i < cantidadAmigos; i++) {
            if (edades[i] >= 18) {
                System.out.println(nombres[i]);
            } else {
                System.out.println("Lo siento " + nombres[i] + ", no puedes ser mostrado por ser menor de edad.");
            }
        }
    }
}
