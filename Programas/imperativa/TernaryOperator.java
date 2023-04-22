package Programas.imperativa;

public class TernaryOperator {
    public static void main(String[] args) {
        boolean esUnAuto = true;
        boolean fueUnAuto = (esUnAuto)?true:false;

        System.out.println(fueUnAuto);

        String mensajeAuto = (5>2)?"Es true":"Es False";

        System.out.println(mensajeAuto);

    }
}
