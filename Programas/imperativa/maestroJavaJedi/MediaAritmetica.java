package Programas.maestroJavaJedi;
/*
 * Cálculo de la media aritmética:
Escribir un programa en Java que calcule la media aritmética de un conjunto de
números. Utilizar la fórmula: media = (n1 + n2 + ... + nk) / k, donde n1, n2, ..., nk son
los números y k es el número total de elementos. Utilicen variables y constantes
según corresponda.
Muestre el resultado por pantalla.
 */
public class MediaAritmetica {
   public static void main(String[] args) {
      // Definir los valores de los números
      double n1 = 5.5;
      double n2 = 6.2;
      double n3 = 4.8;
      double n4 = 7.1;

      // Definir el número total de elementos
      final int k = 4;

      // Calcular la media aritmética
      double media = (n1 + n2 + n3 + n4) / k;

      // Mostrar el resultado por pantalla
      System.out.println("La media aritmética de los números es: " + media);
   }
}
