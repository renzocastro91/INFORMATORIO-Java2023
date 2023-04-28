package Programas.estructurado.iniciadoJavaJedi;
/*
 * A mi me gustan los apres: Escribe un programa que imprima solo los N números
pares, donde los N números son guardados en variables o constantes según
corresponda.
 */
public class NumerosPares {
    public static void main(String[] args) {
        final int N = 10; // Número de números a imprimir
        int contador = 0; // Contador de números pares
        
        for (int i = 0; contador < N; i++) {
            if (i % 2 == 0) { // Si el número es par
                System.out.println(i);
                contador++; // Incrementar el contador de números pares
            }
        }
    }
}
