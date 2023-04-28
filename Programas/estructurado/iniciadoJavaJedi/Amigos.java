package Programas.estructurado.iniciadoJavaJedi;
import java.util.Scanner;
/*
 * Mis amigos : Guarde en variables el nombre de N cantidad de amigos, itere sobre
esa cantidad mostrando el nombre de cada amigo.
 */
public class Amigos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la cantidad de amigos a ingresar
        System.out.print("Ingrese la cantidad de amigos: ");
        int cantidadAmigos = scanner.nextInt();

        // Crear un arreglo para almacenar los nombres de los amigos
        String[] nombresAmigos = new String[cantidadAmigos];

        // Pedir el nombre de cada amigo y almacenarlo en el arreglo
        for (int i = 0; i < cantidadAmigos; i++) {
            System.out.print("Ingrese el nombre del amigo " + (i + 1) + ": ");
            nombresAmigos[i] = scanner.next();
        }

        // Mostrar los nombres de los amigos
        System.out.println("Los nombres de los amigos son:");
        for (String amigo : nombresAmigos) {
            System.out.println(amigo);
        }
    }
}

