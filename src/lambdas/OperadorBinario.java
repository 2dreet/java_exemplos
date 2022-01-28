package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {
        // aqui todos os parametros envolvidos tem que ser do mesmo tipo e o retorno tbm
        BinaryOperator<Double> media = (Double n1, Double n2) -> (n1 + n2) /2;
        System.out.println(media.apply(5d,9d));

        Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(media.andThen(conceito).apply(7d, 8d));
    }
}
