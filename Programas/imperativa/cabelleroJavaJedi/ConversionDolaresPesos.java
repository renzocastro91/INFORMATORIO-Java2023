package Programas.imperativa.cabelleroJavaJedi;
import java.util.Scanner;
/*
 * Conversión de dólares a pesos: Escribir un programa en Java que solicite al
usuario una cantidad en dólares y muestre el equivalente en pesos, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 dólar = 20 pesos, y el
usuario ingresa 50 dólares, el programa deberá mostrar 1000 pesos.
 */
public class ConversionDolaresPesos {
    public static void main(String[] args) {
        
        // Declaración de variables
        double tasaCambio = 437.0; // tasa de cambio fija
        double dolares, pesos;
        
        // Crear objeto Scanner para obtener entrada del usuario
        Scanner input = new Scanner(System.in);
        
        // Obtener la cantidad de dólares del usuario
        System.out.print("Ingrese la cantidad de dólares: ");
        dolares = input.nextDouble();
        
        // Calcular el equivalente en pesos
        pesos = dolares * tasaCambio;
        
        // Mostrar el resultado al usuario
        System.out.println("$" + dolares + " dólares equivalen a $" + pesos + " pesos.");
    }
}
