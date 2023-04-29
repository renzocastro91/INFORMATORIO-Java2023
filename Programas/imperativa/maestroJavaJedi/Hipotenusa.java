package Programas.imperativa.maestroJavaJedi;
import java.util.Scanner;

/*
 * Cálculo de la hipotenusa de un triángulo:
Escribir un programa en Java que calcule la hipotenusa de un triángulo rectángulo,
dados los valores de los catetos. Utilizar la fórmula: h^2 = a^2 + b^2, donde h es la
hipotenusa, a y b son los catetos.
 */
public class Hipotenusa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cateto1, cateto2, hipotenusa;

        System.out.print("Ingrese el valor del primer cateto: ");
        cateto1 = sc.nextDouble();

        System.out.print("Ingrese el valor del segundo cateto: ");
        cateto2 = sc.nextDouble();

        hipotenusa = Math.sqrt(cateto1*cateto1 + cateto2*cateto2);

        System.out.println("La hipotenusa del triángulo rectángulo es: " + hipotenusa);
    }
}