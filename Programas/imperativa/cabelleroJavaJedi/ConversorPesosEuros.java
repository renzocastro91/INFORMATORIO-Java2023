package Programas.cabelleroJavaJedi;
import java.util.Scanner;

/*
 * Conversión de pesos a euros: Escribir un programa en Java que solicite al usuario
una cantidad en pesos y muestre el equivalente en euros, utilizando una tasa de
cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 20 pesos, y el usuario
ingresa 5000 pesos, el programa deberá mostrar 250 euros.
 */
public class ConversorPesosEuros {
    public static void main(String[] args) {
        double tasaCambio = 900.0; // Tasa de cambio fija: 1 euro = 20 pesos
        double cantidadPesos, cantidadEuros;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de pesos: ");
        cantidadPesos = sc.nextDouble();
        
        cantidadEuros = cantidadPesos / tasaCambio;
        
        System.out.println(cantidadPesos + " pesos equivale a " + cantidadEuros + " euros.");
    }
}

