package Programas.imperativa.iniciadoJavaJedi;
import java.util.Scanner;
public class SumaDeDosNumerosBis {
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

        // Determinar si el resultado es par o impar
        String paridad = (resultado % 2 == 0) ? "par" : "impar";

        // Mostrar el resultado y la paridad por pantalla
        System.out.println("El resultado es " + resultado + " y es " + paridad + ".");
    }
}
