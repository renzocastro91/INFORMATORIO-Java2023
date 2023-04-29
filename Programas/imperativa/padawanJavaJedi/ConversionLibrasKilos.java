package Programas.imperativa.padawanJavaJedi;
/*
 * Conversión a kilogramos: Guarde en un espacio de memoria sus libras y luego, en
otro espacio de memoria realice la conversión de esas libras a kilogramos. Utilice
una constante de los valores que no van a cambiar en esta conversión. Muestre el
resultado por pantalla. 
 */
public class ConversionLibrasKilos {
    public static void main(String[] args) {
        final double FACTOR_CONVERSION = 0.453592; // Constante de conversión
        
        double libras = 200; // Valor de libras a convertir
        double kilos = libras * FACTOR_CONVERSION; // Conversión a kilogramos
        
        System.out.println(libras + " libras son equivalentes a " + kilos + " kilogramos.");
    }
}
