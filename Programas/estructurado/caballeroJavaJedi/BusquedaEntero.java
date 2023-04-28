package Programas.estructurado.caballeroJavaJedi;
/*
 * Dado un arreglo con valores enteros, realice la
búsqueda de ese entero, si encontró el entero mostrarlo por pantalla sino muestre
por pantalla que no lo encontró.
 */
public class BusquedaEntero {
    public static void main(String[] args) {
        int[] arreglo = {5, 8, 2, 10, 3};
        int enteroBuscado = 1;
        boolean encontrado = false;
    
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == enteroBuscado) {
                System.out.println("Se encontró el entero " + enteroBuscado + " en el índice " + i + " del arreglo.");
                encontrado = true;
                break;
            }
        }
    
        if (!encontrado) {
            System.out.println("No se encontró el entero " + enteroBuscado + " en el arreglo.");
        }
    }
    
}
