package Programas.estructurado.caballeroJavaJedi;
/*
 * Realizar un programa donde se guarden 5 en
un arreglo. Luego, el programa debe mostrar en pantalla el valor máximo y mínimo
de los números ingresados.
 */
public class MaxMinArreglo {
    public static void main(String[] args) {
        int[] numeros = {5, 100, 2, 8, 1, 4, 9, 8, 0};
        int max = numeros[0];
        int min = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        System.out.println("El número máximo es: " + max);
        System.out.println("El número mínimo es: " + min);
    }
}
