package Programas.imperativa.cabelleroJavaJedi;
import java.util.Scanner;

/*
 * Conversión de euros a dólares: Escribir un programa en Java que solicite al
usuario una cantidad en euros y muestre el equivalente en dólares, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 1.20 dólares, y
el usuario ingresa 100 euros, el programa deberá mostrar 120 dólares. 
 */

public class ConversionEurosDolares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la cantidad en euros a convertir
        System.out.print("Introduce la cantidad en euros: ");
        double cantidadEuros = scanner.nextDouble();

        // Definir la tasa de cambio fija
        double tasaCambio = 1.20;

        // Calcular la cantidad en dólares
        double cantidadDolares = cantidadEuros * tasaCambio;

        // Mostrar el resultado por pantalla
        System.out.println(cantidadEuros + " euros son equivalentes a " + cantidadDolares + " dólares.");
    }
}
