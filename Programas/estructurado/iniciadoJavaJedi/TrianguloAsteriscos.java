package Programas.estructurado.iniciadoJavaJedi;
/*
 * Triangulo de asteriscos : Se le solicita que creen un programa que imprima un
triángulo de asteriscos en la consola. Usar bucles.
 */
public class TrianguloAsteriscos {
    public static void main(String[] args) {
       int filas = 5;
 
       for(int i = 1; i <= filas; i++) {
          for(int j = 1; j <= i; j++) {
             System.out.print("* ");
          }
          System.out.println("");
       }
    }
 }
