package Programas.estructurado.caballeroJavaJedi;
/*
 * Realizar un programa que guarde cierta cantidad de números con
punto decimal en un arreglo. Luego, el programa debe ordenar los números de
forma ascendente y mostrarlos en pantalla.
 */
public class OrdenarNumerosPuntoDecimal {
    public static void main(String[] args) {
        // Arreglo de números con punto decimal
        double[] numeros = { 3.14, 2.71, 1.41, 4.0, 0.99 };
    
        // Mostrar los números antes de ordenar
        System.out.println("Números antes de ordenar:");
        for (double numero : numeros) {
            System.out.print(numero + " ");
        }
    
        // Ordenar el arreglo utilizando bubble sort
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j+1]) {
                    double temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                }
            }
        }
    
        // Mostrar los números después de ordenar
        System.out.println("\nNúmeros después de ordenar:");
        for (double numero : numeros) {
            System.out.print(numero + " ");
        }
    }
    
}
