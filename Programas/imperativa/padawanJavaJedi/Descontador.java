package Programas.imperativa.padawanJavaJedi;
/*Descontador: Se le solicita que guarde un número en un espacio de memoria y
*decrementar dicho número 20 veces sin usar asignación. ¿Que operador podría
*usar para hacerlo?

 * Se puede usar el operador de decremento "--" para decrementar el valor de la variable sin usar la asignación. Aquí hay un ejemplo de cómo hacerlo
 */
public class Descontador {
    public static void main(String[] args) {
        int num = 50; // número a decrementar
        for(int i = 0; i < 20; i++) {
            System.out.println("Número actual: " + num);
            num--; // decremento en 1
        }
        System.out.println("Número actual: " + num);
    }
}
