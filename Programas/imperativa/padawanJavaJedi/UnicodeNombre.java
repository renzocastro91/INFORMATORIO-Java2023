package Programas.imperativa.padawanJavaJedi;
/*
 * Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre
en unicode y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char?
¿Qué es unicode?

Unicode es un estándar de codificación de caracteres que asigna un número único (un código numérico) a cada símbolo de texto, 
incluyendo caracteres alfabéticos, numéricos y de puntuación, así como caracteres especiales y símbolos gráficos.

En Java, se pueden representar caracteres Unicode en un tipo de datos llamado char, que utiliza una codificación de 16 bits 
para representar cada carácter. A diferencia de las cadenas de texto (que se representan con comillas dobles), los caracteres 
individuales en Java se representan con comillas simples, por lo que no se pueden usar comillas dobles para almacenar un carácter Unicode.
 */
public class UnicodeNombre {
    public static void main(String[] args) {
        String nombre = "Renzo"; // nombre a convertir en unicode
        for (int i = 0; i < nombre.length(); i++) {
            char c = nombre.charAt(i); // obtener el caracter en la posición i
            int unicode = (int) c; // convertir el caracter en unicode
            System.out.println("El caracter " + c + " tiene el unicode " + unicode);
        }
    }

}
