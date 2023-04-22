package Programas.imperativa;

public class IntroOperatorOperando {
    public static void main(String[] args) {
        //Declaracion e inicializacion 
        int valorInicio = 10;
        //Declaracion e inicializacion multiple
        int valor1,valor2,valor3  =50;

        int result = 5 + 3 * 2;

        System.out.println(result);
        /*
         * 1. Multiplica
         * 2. Suma
         */

        int result2 = 20 / 4 * 2 + 3; 
        /*
         * si tienen la misma prioridad hace de izquierda a derecha
         * 1. Division
         * 2. Multiplicacion
         * 3. Suma
         */
        System.out.println(result2);

        int result3 = 2 + 3 * 6 / 3 - 1;
        /*
         * si tienen la misma prioridad hace de izquierda a derecha
         * 1. Multiplicacion
         * 2. Division
         * 3. Suma
         * 4. Resta
         */
        System.out.println(result3);
        System.out.println("Hola este es el resultado: " + result3);
    }
}
