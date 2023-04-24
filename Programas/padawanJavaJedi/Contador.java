package Programas.padawanJavaJedi;

/*
Contador: Se le solicita que guarde un número en un espacio de memoria e
incremente dicho número 20 veces sin usar asignación. ¿Que operador podría usar
para hacerlo?
 * Se puede utilizar el operador de incremento (++), que aumenta en 1 el valor de la variable cada vez que se usa. En este caso, 
 * se puede usar un bucle for que se ejecute 20 veces y en cada iteración se incremente el valor de la variable.
 */
public class Contador {
    public static void main(String[] args) {
        int numero = 10;
        for (int i = 0; i < 20; i++) {
            numero++;
        }
        System.out.println("El número es: " + numero);
    }
}
