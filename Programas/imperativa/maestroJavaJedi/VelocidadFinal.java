package Programas.maestroJavaJedi;
import java.util.Scanner;

/*
 * Cálculo de la velocidad final:
Escribir un programa en Java que calcule la velocidad final de un objeto en caída
libre, dados su velocidad inicial, la aceleración de la gravedad y el tiempo
transcurrido. Utilizar la fórmula: v_f = v_i + g * t, donde v_f es la velocidad final, v_i
es la velocidad inicial, g es la aceleración de la gravedad y t es el tiempo
transcurrido.
 */
public class VelocidadFinal {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      // Pedir velocidad inicial, aceleración de la gravedad y tiempo transcurrido
      System.out.print("Introduzca la velocidad inicial (en m/s): ");
      double v_i = sc.nextDouble();
      System.out.print("Introduzca la aceleración de la gravedad (en m/s^2): ");
      double g = sc.nextDouble();
      System.out.print("Introduzca el tiempo transcurrido (en s): ");
      double t = sc.nextDouble();
      
      // Calcular velocidad final
      double v_f = v_i + g * t;
      
      // Mostrar resultado por pantalla
      System.out.println("La velocidad final es " + v_f + " m/s.");
   }
}
