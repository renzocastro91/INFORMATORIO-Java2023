package Programas.imperativa.iniciadoJavaJedi;
import java.util.Scanner;
public class NombreBebida {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos de entrada desde la consola
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese el nombre de su última mascota
        System.out.println("Ingrese el nombre de su última mascota: ");
        String mascota = sc.nextLine();

        // Pedir al usuario que ingrese el nombre de la última película vista
        System.out.println("Ingrese el nombre de la última película vista: ");
        String pelicula = sc.nextLine();

        // Mostrar el nombre de la próxima bebida
        System.out.println("Nombre de la próxima bebida: " + mascota + " " + pelicula);
    }

}
