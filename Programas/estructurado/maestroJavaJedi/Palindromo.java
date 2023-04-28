package Programas.estructurado.maestroJavaJedi;
/*
 * Dado un arreglo con caracteres (Formando una palabra) indicar
si es o no palíndromo.
 */
public class Palindromo {
    public static void main(String[] args) {
        char[] palabra = {'r', 'e', 'c', 'o', 'n', 'o', 'c', 'e', 'r'};

        int largo = palabra.length;
        boolean esPalindromo = true;

        for (int i = 0; i < largo / 2; i++) {
            if (palabra[i] != palabra[largo - 1 - i]) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("La palabra es un palíndromo");
        } else {
            System.out.println("La palabra no es un palíndromo");
        }
    }
}
