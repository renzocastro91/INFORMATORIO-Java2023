package Programas.maestroJavaJedi;
import java.util.Scanner;
/*
 * Cálculo de la energía cinética:
Escribir un programa en Java que calcule la energía cinética de un objeto en
movimiento, dados su masa y su velocidad.
Utilizar la fórmula: E = (1/2) * m * v^2, donde E es la energía cinética, m es la masa
del objeto y v es la velocidad.
Muestre el resultado por pantalla.
 */
public class EnergiaCinetica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double masa, velocidad, energia;
        
        System.out.print("Ingrese la masa del objeto (en kg): ");
        masa = input.nextDouble();
        
        System.out.print("Ingrese la velocidad del objeto (en m/s): ");
        velocidad = input.nextDouble();
        
        energia = 0.5 * masa * Math.pow(velocidad, 2);
        
        System.out.println("La energía cinética del objeto es: " + energia + " J");
    }
}
