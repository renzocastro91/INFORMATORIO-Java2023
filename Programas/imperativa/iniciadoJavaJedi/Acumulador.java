package Programas.imperativa.iniciadoJavaJedi;

public class Acumulador {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 7;
        double acumulador = 0;

        for (int i = 1; i <= 15; i++) {
            double resultado = (double) (numero1 * numero2) / i;
            acumulador += resultado;
        }

        System.out.println("El resultado es: " + acumulador);
    }
}
