package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste2 {
    public static void main(String[] args) {
        // Aqui utilizamos o BinaryOperator do java util functions
        // os atributos de entrada e o retorno tem que ser do mesmo tipo;
        BinaryOperator<Double> calc = (a, b) -> a + b;

        System.out.println(calc.apply(10d, 15d));
        System.out.println(calc.apply(5d, 8d));
    }
}
