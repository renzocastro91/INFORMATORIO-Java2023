package Programas.imperativa.maestroJavaJedi;
import java.util.Scanner;

/*
 * Cálculo de la fuerza centrípeta:
Escribir un programa en Java que calcule la fuerza centrípeta necesaria para
mantener un objeto en una trayectoria circular, dados su masa, la velocidad angular
y el radio de la trayectoria. Utilizar la fórmula: F_c = m * v^2 / r, donde F_c es la fuerza centrípeta, m es la masa del objeto, v es la velocidad angular y r es el radio
de la trayectoria.
Muestre el resultado por pantalla.
 */

public class FuerzaCentripeta {
    public static void main(String[] args) {
        double masa, velocidadAngular, radio, fuerzaCentripeta;
        final double CONSTANTE = 1.0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la masa del objeto en kilogramos: ");
        masa = sc.nextDouble();

        System.out.print("Ingrese la velocidad angular en radianes por segundo: ");
        velocidadAngular = sc.nextDouble();

        System.out.print("Ingrese el radio de la trayectoria en metros: ");
        radio = sc.nextDouble();

        fuerzaCentripeta = masa * Math.pow(velocidadAngular, 2) * radio;

        System.out.println("La fuerza centrípeta necesaria para mantener el objeto en la trayectoria circular es: " + fuerzaCentripeta + " N");

        sc.close();
    }
}

