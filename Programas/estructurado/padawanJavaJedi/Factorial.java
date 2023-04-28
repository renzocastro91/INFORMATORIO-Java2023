package Programas.estructurado.padawanJavaJedi;
import java.util.Scanner;
/*
 * El factorial : Realizar un programa que calcule el factorial de un número
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero para calcular su factorial: ");
        int num = sc.nextInt();
        int factorial = 1;
        
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}
