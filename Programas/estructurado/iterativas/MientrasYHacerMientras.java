package Programas.estructurado.iterativas;

public class MientrasYHacerMientras {
    public static void main(String[] args) {
        //While --> no sabemos cuánto debemos iterar
        int contador = 1;
        while (contador < 10){
            System.out.println("Hello! Soy el numero " + contador);
            contador++;
        }

        do{
            System.out.println("Adios! soy el numero "+contador);
            contador--;
        }while (contador == 0);

    }
}
