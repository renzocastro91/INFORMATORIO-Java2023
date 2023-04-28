package Programas.estructurado.iniciadoJavaJedi;
import java.util.Scanner;

/*
 * Suma de números : Realizar un programa que guarde un número en memoria y
determine si es par o impar.
 */
public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

        sc.close();
    }
}
