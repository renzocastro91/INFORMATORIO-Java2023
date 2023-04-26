package Programas.estructurado.condicionales;

public class EstructuraSwitch {
    public static void main(String[] args) {
        String curso = "Testing";

        final String MENSAJE_BIENVENIDA = "Bienvenido al curso de ";
        final String CURSO_DE__PYTHON = "Python";
        final String CURSO_DE__JAVA = "Java";
        final String CURSO_DE__TESTING = "Testing";

        switch (curso){
            case CURSO_DE__PYTHON:
                System.out.println(MENSAJE_BIENVENIDA + CURSO_DE__PYTHON);
                System.out.println("Que te diviertas");
                break;
            case CURSO_DE__JAVA:
                System.out.println(MENSAJE_BIENVENIDA + CURSO_DE__JAVA);
                break;
            case CURSO_DE__TESTING:
                System.out.println(MENSAJE_BIENVENIDA + CURSO_DE__TESTING);
                break;
            default:
                System.out.println("El curso ingresado no existe");
        }
    }
}
