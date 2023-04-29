package Programas.imperativa.cabelleroJavaJedi;
import java.util.Scanner;

/*
 * Conversión de libras esterlinas a dólares: Escribir un programa en Java que
solicite al usuario una cantidad en libras esterlinas y muestre el equivalente en
dólares, utilizando una tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1
libra esterlina = 1.40 dólares, y el usuario ingresa 50 libras esterlinas, el programa
deberá mostrar 70 dólares.


 */
public class ConversionLibrasADolares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tasaCambio = 1.40; // Tasa de cambio fija
        double cantidadLibras, cantidadDolares;

        System.out.print("Ingrese la cantidad en libras esterlinas: ");
        cantidadLibras = sc.nextDouble();

        cantidadDolares = cantidadLibras * tasaCambio;

        System.out.println("La cantidad equivalente en dólares es: $" + cantidadDolares);
    }
}
