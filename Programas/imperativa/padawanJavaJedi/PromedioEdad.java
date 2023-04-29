package Programas.imperativa.padawanJavaJedi;
/*
 * Promedio de edad : Guarde en diferentes espacios de memoria distintos valores de
edad y los nombres de esas personas, luego saque su promedio e imprima por
pantalla el nombre de la persona, su edad. Por último imprimir el promedio de sus
edades.
 */
public class PromedioEdad {
    public static void main(String[] args) {
        // Definimos las variables para almacenar los nombres y edades
        String nombre1 = "Juan";
        int edad1 = 25;
        
        String nombre2 = "María";
        int edad2 = 30;
        
        String nombre3 = "Pedro";
        int edad3 = 20;
        
        // Calculamos el promedio de las edades
        double promedio = (edad1 + edad2 + edad3) / 3.0;
        
        // Imprimimos la información de cada persona y el promedio de las edades
        System.out.println(nombre1 + " tiene " + edad1 + " años.");
        System.out.println(nombre2 + " tiene " + edad2 + " años.");
        System.out.println(nombre3 + " tiene " + edad3 + " años.");
        System.out.println("El promedio de las edades es " + promedio + ".");
    }
}
