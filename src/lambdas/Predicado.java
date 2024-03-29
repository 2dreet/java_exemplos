package lambdas;

import lambdas.model.Produto;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Predicate<Produto> isCaro = prod -> (prod.preco ) >= 750;

        Produto produto = new Produto("teste", 900.2, 0.9);
        System.out.println(isCaro.test(produto));
    }
}
