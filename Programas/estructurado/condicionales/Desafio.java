package Programas.estructurado.condicionales;

public class Desafio {
    public static void main(String[] args) {
        int edad = 18;        
        if (edad < 13) {
            System.out.println("Usted es un niño.");
        } else if (edad >= 13 && edad < 18) {
            System.out.println("Usted es un adolescente.");
        } else if (edad >= 18 && edad < 35) {
            System.out.println("Usted es un adulto joven.");
        } else {
            System.out.println("Usted es un adulto.");
        }
    }
}
