package Programas.estructurado.iniciadoJavaJedi;
import java.util.Scanner;
/*
 * La suma de los primeros: Realizar un programa que calcule la suma de los
primeros N números naturales, donde N es un número entero guardado en memoria.
 */
public class SumaNaturales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor de N: ");
        int n = sc.nextInt();
        
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        
        System.out.println("La suma de los primeros " + n + " números naturales es: " + suma);
    }
}
