package Programas.estructurado.caballeroJavaJedi;
/*
 * Guarda en un arreglo una N cantidad de amigos,
itere sobre esa cantidad mostrando el nombre de cada amigo si y sólo si este amigo
es mayor de edad, en caso de ser menor de edad imprima un mensaje diciendole a
ese amigo porque no lo muestra por pantalla. Pero a su vez, encuentre al amigo que
mayor edad tenga, muestre un mensaje por pantalla del nombre de esa persona y su
edad.
 */
public class Amigos {
    public static void main(String[] args) {
        String[] nombres = {"Renzo", "Cris", "Dani", "Sanchez", "Rodri"};
        int[] edades = {32, 33, 29, 10000, 5};
        
        int mayorEdad = 0;
        String nombreMayorEdad = "";
        
        for (int i = 0; i < nombres.length; i++) {
            if (edades[i] >= 18) {
                System.out.println(nombres[i]);
                if (edades[i] > mayorEdad) {
                    mayorEdad = edades[i];
                    nombreMayorEdad = nombres[i];
                }
            } else {
                System.out.println("Lo siento " + nombres[i] + ", eres menor de edad.");
            }
        }
        
        System.out.println("El amigo de mayor edad es " + nombreMayorEdad + " con " + mayorEdad + " años.");
    }
}
