package Programas.estructurado.padawanJavaJedi;
/*
 * Suma del rango de números : Escribir un programa que encuentre la suma de los
números impares en un rango de números enteros guardados en una variable.
 */
public class SumaImparesRango {
    public static void main(String[] args) {
        int inicio = 1; // definimos el inicio del rango
        int fin = 10; // definimos el fin del rango
        int sumaImpares = 0; // inicializamos la variable para guardar la suma de impares
        
        for (int i = inicio; i <= fin; i++) { // iteramos sobre los números en el rango
            if (i % 2 != 0) { // si el número es impar
                System.out.println("Acumulo "+ i + " al total");
                sumaImpares += i; // sumamos el número a la variable de suma
            }
        }
        
        System.out.println("La suma de los números impares en el rango de " + inicio + " a " + fin + " es: " + sumaImpares);
    }
}
