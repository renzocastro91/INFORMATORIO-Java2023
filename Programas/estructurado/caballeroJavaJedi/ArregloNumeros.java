package Programas.estructurado.caballeroJavaJedi;
import java.util.Arrays;
/*
 * Cree dos arreglos con números decimales,
luego recortarlos y reste ambos arreglos el resultado aplicarlos a un tercer arreglo, si
la resta da negativo entonces guarde 0.
 */
public class ArregloNumeros {
    public static void main(String[] args) {
        double[] arreglo1 = {5.5, 2.8, 7.1, 9.6, 1.2};
        double[] arreglo2 = {3.7, 1.5, 6.2, 8.9, 2.3};
        double[] resultado = new double[5];

        for (int i = 0; i < 5; i++) {
            double resta = arreglo1[i] - arreglo2[i];
            resultado[i] = resta < 0 ? 0 : resta;
        }

        System.out.println("Arreglo 1: " + Arrays.toString(arreglo1));
        System.out.println("Arreglo 2: " + Arrays.toString(arreglo2));
        System.out.println("Resultado: " + Arrays.toString(resultado));
    }
}
