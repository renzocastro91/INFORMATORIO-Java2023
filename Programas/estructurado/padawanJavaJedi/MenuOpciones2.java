package Programas.estructurado.padawanJavaJedi;

public class MenuOpciones2 {
    public static void main(String[] args) {
                
        // Declarar la variable para guardar la opción elegida
        int opcion = 0;
        
        // Bucle WHILE para mostrar el menú de opciones hasta que el usuario elija una opción válida
        while (opcion != 4) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Salir");
            
            opcion = 2;

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
            } else if (opcion == 4);
            else{break;}
        }
        
    }
}
