package Programas.estructurado.padawanJavaJedi;
/*
 * Convierto lo que me da la gana: Demuestre cómo convertir un bucle WHILE en un
DO WHILE.

Para convertir un bucle WHILE en un DO WHILE, se debe cambiar el orden de las instrucciones 
y agregar la condición del bucle al final. Por ejemplo, si tenemos el siguiente bucle WHILE en Java
 */
public class ConvertirWhileEnDoWhile {
    public static void main(String[] args) {
    //While 
    int i = 0;
    while (i < 10) {
    System.out.println(i);
    i++;
    }

    //Do While
   
    int j = 0;
    do {
    System.out.println(j);
    j++;
    } while (j < 10);

    }
}
