package Programas.imperativa;

public class DeclaracionesEnJava {
    public static void main(String[] args) {
        //Conversion de datos, si le ponemos f a algo que es double, lo transforma en float
        float valor1 = 34.5f;
        double valor2 = 50.2;
        //El punto y coma determina donnde termina la sentencia
        //Expresion --> 5151515
        long valueLong = 5151515;
        System.out.println(Long.MAX_VALUE);
        //Escribir sout es la abreviatura del System.out.println()

        //Constantes
        final char constanteValue = 'E';
        //Version unicode
        final char constanteValue2 = '\u0044';
        System.out.println(constanteValue);
        System.out.println(constanteValue2);

        //Contadores
        int valueA = 10;
        System.out.println(valueA++);
        System.out.println(valueA--);

        //Acumuladores valueA = valueA + 5
        System.out.println(valueA += 5);
        System.out.println(valueA -= 10);
    }
}
