package Programas.estructurado.padawanJavaJedi;
/*
 * Convierto lo que me da la gana parte 2: Demuestre cómo convertir un bucle
WHILE en un bucle FOR.
Un bucle WHILE se puede convertir en un bucle FOR de la siguiente manera:
while (condicion) {
    // cuerpo del bucle
    // ...
}

// Conversión a bucle FOR
for (; condicion ;) {
    // cuerpo del bucle
    // ...
}
La clave aquí es que el primer argumento del bucle FOR es una expresión vacía,
ya que no necesitamos inicializar nada antes del bucle. El segundo argumento es
la condición de salida del bucle, que es la misma que en el bucle WHILE. Y el tercer 
argumento es la expresión de actualización, que en este caso no es necesaria porque
la actualización se realiza dentro del cuerpo del bucle WHILE.
 */
public class ConvertirWhileEnFor {
    public static void main(String[] args) {
    //While
    int i = 1;
    while (i <= 10) {
        System.out.println(i);
        i++;
    }

    //For
    for (int j = 1; j <= 10; j++) {
        System.out.println(j);
    }
    
    }
}
