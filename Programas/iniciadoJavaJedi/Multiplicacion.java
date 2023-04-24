package Programas.iniciadoJavaJedi;
import java.util.Scanner;
/*
 * El resultado de la suma entre la multiplicación de dos números reales y la multiplicación de dos números enteros será un número real. 
 * Esto se debe a que cuando multiplicamos dos números reales, el resultado también es un número real. Del mismo modo, cuando multiplicamos 
 * dos números enteros, el resultado es también un número entero.
 */
public class Multiplicacion {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario que ingrese los dos números enteros
        System.out.print("Ingrese el primer número entero: ");
        int numEntero1 = sc.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numEntero2 = sc.nextInt();

        // Sumamos los dos números enteros
        int sumaEnteros = numEntero1 + numEntero2;

        // Verificamos si el primer número es divisible por el segundo
        if (numEntero1 % numEntero2 == 0) {
            System.out.println(numEntero1 + " es divisible por " + numEntero2);
        } else {
            System.out.println(numEntero1 + " no es divisible por " + numEntero2);
        }

        // Pedimos al usuario que ingrese los dos números reales
        System.out.print("Ingrese el primer número real: ");
        double numReal1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número real: ");
        double numReal2 = sc.nextDouble();

        // Multiplicamos los dos números reales
        double multiplicacionReales = numReal1 * numReal2;

        // Sumamos la multiplicación de los números enteros con la multiplicación de los números reales
        double sumaTotal = multiplicacionReales + sumaEnteros;

        // Mostramos los resultados
        System.out.println("La suma de los dos números enteros es: " + sumaEnteros);
        System.out.println("El resultado de la multiplicación de los dos números reales es: " + multiplicacionReales);
        System.out.println("La suma total de las dos multiplicaciones es: " + sumaTotal);

        sc.close(); // Cerramos el scanner
    }
}
