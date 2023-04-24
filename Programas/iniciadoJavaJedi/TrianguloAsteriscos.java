package Programas.iniciadoJavaJedi;
import java.util.Scanner;
public class TrianguloAsteriscos {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos de entrada desde la consola
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese la altura del triángulo
        System.out.println("Ingrese la altura del triángulo: ");
        int altura = sc.nextInt();

        // Imprimir el triángulo de asteriscos
        for (int i = 1; i <= altura; i++) {
            // Imprimir los espacios en blanco a la izquierda
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            // Imprimir los asteriscos
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Imprimir un salto de línea al final de cada fila
            System.out.println();
        }
    }
}
