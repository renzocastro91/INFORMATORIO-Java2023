package Programas.estructurado.padawanJavaJedi;
import java.util.Scanner;
/*
 * Y mas… sumas! : Realizar un programa donde se guarde un número entero en una
variable y que imprima por pantalla el resultado de la suma de todos los números
enteros desde 1 hasta ese número.
 */
public class SumaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n = sc.nextInt();
        sc.close();
        
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        
        System.out.println("La suma de los números enteros desde 1 hasta " + n + " es: " + suma);
    }
}
