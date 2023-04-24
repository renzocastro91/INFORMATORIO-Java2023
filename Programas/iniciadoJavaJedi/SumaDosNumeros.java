package Programas.iniciadoJavaJedi;
import java.util.Scanner;


public class SumaDosNumeros {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos de entrada desde la consola
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese dos números enteros
        System.out.println("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        // Sumar los dos números
        int resultado = num1 + num2;

        // Mostrar el resultado por pantalla
        System.out.println("La suma de " + num1 + " y " + num2 + " es " + resultado);
    }
}
