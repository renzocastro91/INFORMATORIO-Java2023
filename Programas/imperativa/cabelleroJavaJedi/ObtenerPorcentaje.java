package Programas.cabelleroJavaJedi;
/*
 * Obtener porcentaje : Dados dos números, uno real y el otro entero. Obtenga el
porcentaje que indique el segundo número del primer número. 
 */
public class ObtenerPorcentaje {
    public static void main(String[] args) {
        double numeroReal = 10.5;
        int numeroEntero = 50;
        double porcentaje = numeroReal * (numeroEntero / 100.0);
        
        System.out.println(numeroEntero + "% de " + numeroReal + " es: " + porcentaje);
    }
}
