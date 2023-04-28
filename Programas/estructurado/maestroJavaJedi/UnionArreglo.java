package Programas.estructurado.maestroJavaJedi;
import java.util.Arrays;

/*
 * 
 */

public class UnionArreglo {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 9, 8};
        Integer[] arr2 = {4, 5, 6};
        Integer[] arr3 = new Integer[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }

        System.out.println(Arrays.toString(arr3));
    }
}
