package Programas.imperativa.maestroJavaJedi;
import java.util.Scanner;
/*
 * Conversión de grados Celsius a grados Fahrenheit : Escribir un programa en
Java que convierta una temperatura en grados Celsius a grados Fahrenheit. Buscar
la fórmula con la que se resuelve.

Para convertir grados Celsius a grados Fahrenheit se utiliza la siguiente fórmula:

°F = (°C x 1.8) + 32

Donde °C es la temperatura en grados Celsius y °F es la temperatura en grados Fahrenheit.
 */

public class CelciusAFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit + "°F");
    }
}
