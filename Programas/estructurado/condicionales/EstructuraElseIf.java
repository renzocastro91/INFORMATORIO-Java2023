package Programas.estructurado.condicionales;

public class EstructuraElseIf {
    public static void main(String[] args) {
        boolean esUnDiaLluvioso = true;
        final String DAY = "Lunes";

        //Condicional If Else
        if (esUnDiaLluvioso){
            System.out.println("Hoy es: "+ DAY + " Y esta lloviendo");
        }else {
            System.out.println("Hoy es: "+ DAY + " Y no esta lloviendo");
        }
        

        if (esUnDiaLluvioso && DAY == "Martes"){
            System.out.println("Hoy es: "+ DAY + " Y esta lloviendo");
        }else if (esUnDiaLluvioso == false){
            System.out.println("Hoy es: "+ DAY + " Y no esta lloviendo");
        }else {
            System.out.println("Hoy es martes por lo que no tenemos informacion del clima");
        }
        //Código espagueti 
        if(esUnDiaLluvioso){
            System.out.println("LLEVATE EL PARAGUAS!");
            if (DAY == "Lunes" || DAY == "Martes"){
                System.out.println("Hoy es: " + DAY + " Te espera un dia lluvioso");
            }else{
                if(DAY == "Miercoles"){
                    System.out.println("Mejora el clima, va a salir el sol");
                }else if (DAY == "Jueves"){
                    System.out.println("Dia muy humedo y caluroso");
                }else if (DAY == "Viernes"){
                    System.out.println("Dia caluroso");
                }
                System.out.println("No tengo el cliema para el sabado ni domingo");
            }
        }
        System.out.println("Esto es codigo extra");
    }
}
