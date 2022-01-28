package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
    public static void main(String[] args) {
        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;

        // aqui os 2 resultados devem ser verdadeiro
        System.out.println(isPar.and(isTresDigitos).test(600));

        // aqui um do 2 resultados devem ser verdadeiro
        System.out.println(isPar.or(isTresDigitos).test(8));


        // aqui os 2 resultados devem ser verdadeiro mas negando um resultado
        System.out.println(isPar.and(isTresDigitos).negate().test(16));
    }
}
