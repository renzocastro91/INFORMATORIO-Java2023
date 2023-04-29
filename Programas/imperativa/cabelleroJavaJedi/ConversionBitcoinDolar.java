package Programas.imperativa.cabelleroJavaJedi;
import java.util.Scanner;

/*
 * Conversión de bitcoins a dólares: Escribir un programa en Java que solicite al
usuario una cantidad en bitcoins y muestre el equivalente en dólares, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 bitcoin = 50000
dólares, y el usuario ingresa 0.5 bitcoins, el programa deberá mostrar 25000 dólares.
 */
public class ConversionBitcoinDolar {
    public static void main(String[] args) {
        // Definir tasa de cambio fija
        final double EXCHANGE_RATE = 50000.0; // 1 bitcoin = 50000 dólares
        
        // Solicitar cantidad de bitcoins al usuario
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de bitcoins: ");
        double bitcoins = input.nextDouble();
        
        // Calcular equivalente en dólares
        double dollars = bitcoins * EXCHANGE_RATE;
        
        // Mostrar resultado
        System.out.println(bitcoins + " bitcoins equivalen a " + dollars + " dólares.");
    }
}
