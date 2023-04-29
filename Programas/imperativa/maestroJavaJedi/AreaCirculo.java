package Programas.imperativa.maestroJavaJedi;
/*
 * Cálculo del área de un círculo: Escribir un programa en Java que calcule el área
de un círculo con un radio de 5 unidades. Buscar la fórmula con la que se
resuelve.

La fórmula para calcular el área de un círculo es:

Área = π * radio^2
 */
public class AreaCirculo {
    public static void main(String[] args) {
        double radio = 5.0;
        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
    }
}
