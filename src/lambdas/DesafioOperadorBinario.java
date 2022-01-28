package lambdas;

import lambdas.model.Produto;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioOperadorBinario {

    public static void main(String[] args) {

        Produto produto = new Produto("Calculadora", 3235.89, 0.50);

        Function<Produto, Double> calcPrecoReal = p -> p.preco * (1 - p.desconto);
        Function<Double, Double> calcImposto = valor -> valor >= 2500 ? 2500 * 1.085 : valor ;
        Function<Double, Double> calcFrete = valor -> (valor >= 3000) ? valor + 100d : valor + 50d;

        UnaryOperator<Double> round = v -> Double.parseDouble(String.format("%.2f", v).replace(",", "."));

        Function<Double, String> formatarValor = valor -> "R$ " + valor.toString().replace(".", ",");

        String valorFormatado = calcPrecoReal
                .andThen(calcImposto)
                .andThen(calcFrete)
                .andThen(round)
                .andThen(formatarValor)
                .apply(produto);

        System.out.println(valorFormatado);

    }

}
