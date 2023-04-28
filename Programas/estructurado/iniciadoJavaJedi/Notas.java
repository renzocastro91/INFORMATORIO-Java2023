package Programas.estructurado.iniciadoJavaJedi;
/*
 * Espero aprobar : Escribe un programa que imprima un título para el programa,
luego un listado (Seguido, NO con saltos de línea) de las N notas de mis exámenes,
donde los N números son guardados en variables o constantes según corresponda.
Luego obtenga el promedio de esas calificaciones y me diga si aprobé o no y con
cuanto
 */
public class Notas {
    public static void main(String[] args) {
        // Título del programa
        System.out.println("=== Programa de notas ===");

        // Notas de los exámenes
        int nota1 = 85;
        int nota2 = 90;
        int nota3 = 75;
        int nota4 = 60;

        // Obtener el promedio de las notas
        int promedio = (nota1 + nota2 + nota3 + nota4) / 4;

        // Imprimir las notas
        System.out.print("Notas: ");
        System.out.print(nota1 + ", ");
        System.out.print(nota2 + ", ");
        System.out.print(nota3 + ", ");
        System.out.println(nota4);

        // Imprimir el promedio y si se aprobó o no
        System.out.println("Promedio: " + promedio);
        if (promedio >= 70) {
            System.out.println("Aprobado!");
        } else {
            System.out.println("Reprobado.");
        }
    }
}
