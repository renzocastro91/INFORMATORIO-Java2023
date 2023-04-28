package Programas.estructurado.maestroJavaJedi;
import java.util.Scanner;
/*
 * Dado un arreglo con valores enteros, realice la
búsqueda de ese entero y si lo encuentra eliminarlo, si no lo encuentra informe por
pantalla.

1. Crear un arreglo con valores enteros.
2. Solicitar al usuario el número que desea buscar y eliminar.
3. Recorrer el arreglo para buscar el número y eliminarlo si se encuentra.
4. Si se encuentra el número, mostrar un mensaje informando que se ha eliminado.
4. Si no se encuentra el número, mostrar un mensaje informando que no se ha encontrado.

 */
public class EliminarNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {10, 20, 30, 40, 50, 45, 78, 15, 10};
        int numeroBuscado;

        System.out.println("Ingrese el número que desea buscar y eliminar:");
        numeroBuscado = sc.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                // Eliminar el número encontrado
                for (int j = i; j < numeros.length - 1; j++) {
                    numeros[j] = numeros[j + 1];
                }
                numeros[numeros.length - 1] = 0;
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El número " + numeroBuscado + " ha sido eliminado.");
        } else {
            System.out.println("El número " + numeroBuscado + " no ha sido encontrado.");
        }

        // Imprimir el arreglo actualizado
        System.out.println("Arreglo actualizado:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}

