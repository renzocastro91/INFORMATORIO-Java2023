package Programas.estructurado.padawanJavaJedi;
/*
 * Menú de opciones : Realice un menú de opciones, donde la opción se guarde en
una variable (Sin pedir por teclado), muestre la opción elegida y fuerce su salida
bucle.
 */
public class MenuOpciones {
    public static void main(String[] args) {
        int opcion = 0;
        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Salir");

            opcion = 3; // La opción elegida se guarda en una variable

            switch (opcion) {
                case 1:
                    System.out.println("Ha elegido la opción 1");
                    break;
                case 2:
                    System.out.println("Ha elegido la opción 2");
                    break;
                case 3:
                    System.out.println("Ha elegido la opción 3");
                    break;
                case 4:
                    System.out.println("Saliendo del menú...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            if(opcion == 1 || opcion == 2 || opcion == 3){
                System.out.println("Prueba de entrada");
                break;
            }else if (opcion == 4);
            else{break;}
                
        } while (opcion != 4); // La ejecución del menú continúa mientras la opción elegida no sea salir (4)
    }
}
