package Programas.estructurado.maestroJavaJedi;
import java.util.Arrays;
/*
 * Dado un arreglo de enteros inviertalo, de tal manera que
el primer elemento ahora sea el último y así sucesivamente.
 */
public class InvertirArreglo {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] invertedArray = new int[originalArray.length];

        for (int i = originalArray.length - 1, j = 0; i >= 0; i--, j++) {
            invertedArray[j] = originalArray[i];
        }

        System.out.println("Arreglo original: " + Arrays.toString(originalArray));
        System.out.println("Arreglo invertido: " + Arrays.toString(invertedArray));
    }
}
