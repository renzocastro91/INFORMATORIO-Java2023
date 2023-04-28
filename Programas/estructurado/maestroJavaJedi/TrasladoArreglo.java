package Programas.estructurado.maestroJavaJedi;
import java.util.Arrays;
/*
 * Dado un arreglo de enteros, una posición del
arreglo y la cantidad de N traslados a hacer en un arreglo. Lo que debe hacer es
tomar el elemento de la posición del arreglo y trasladarlo N cantidad de veces, si el
traslado es mayor al tamaño del arreglo informar por pantalla.
 */
public class TrasladoArreglo {
        public static void main(String[] args) {
            int[] arreglo = {1, 2, 3, 4, 5}; // arreglo de ejemplo
            int posicion = 2; // posición del arreglo a trasladar
            int nTraslados = 3; // cantidad de traslados a hacer
            
            int tamanoArreglo = arreglo.length;
            
            if (posicion >= tamanoArreglo) {
                System.out.println("La posición ingresada es mayor o igual al tamaño del arreglo.");
                return;
            }
            
            int elemento = arreglo[posicion]; // elemento a trasladar
            
            // trasladar el elemento nTraslados veces
            for (int i = 0; i < nTraslados; i++) {
                int siguientePosicion = posicion + 1;
                if (siguientePosicion >= tamanoArreglo) {
                    siguientePosicion = 0; // volver al inicio del arreglo
                }
                arreglo[posicion] = arreglo[siguientePosicion];
                posicion = siguientePosicion;
            }
            
            arreglo[posicion] = elemento; // colocar el elemento en su nueva posición
            
            System.out.println("Arreglo resultante: " + Arrays.toString(arreglo));
        }

}
