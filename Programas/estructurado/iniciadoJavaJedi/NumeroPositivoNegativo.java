package Programas.estructurado.iniciadoJavaJedi;
import java.util.Scanner;

/*
 * De que se trata esto? : Realizar un programa que guarde un número en memoria y
determine si es positivo, negativo o cero.
 */

public class NumeroPositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        if(numero > 0) {
            System.out.println("El número ingresado es positivo.");
        } else if(numero < 0) {
            System.out.println("El número ingresado es negativo.");
        } else {
            System.out.println("El número ingresado es cero.");
        }

        scanner.close();
    }
}

