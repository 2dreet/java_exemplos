package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class testeMap {
    public static void main(String[] args) {

        // Cria uma consumer para printar com lambda
        // Consuumer é uma funcao que recebe um parametro e não retorna nada
        Consumer<String> print = System.out::println;
        Consumer<Integer> printInt = System.out::println;

        // Monta a lista do tipo String
        List<String> numerosStrs = Arrays.asList("10", "8", "6");
        numerosStrs.stream().forEach(print);

        // Aqui percore a lista convertendo em Integer
        // .collect(Collectors.toList()) retorna uma lista
        List<Integer> numerosInts = numerosStrs
                .stream()
                .map(num -> Integer.parseInt(num))
                .collect(Collectors.toList());

        /// Percore e printa usando lambda
        numerosInts.stream().forEach(printInt);

        numerosInts.stream().map(num -> num + 5).forEach(printInt);

        List<String> marcas = Arrays.asList("bmw", "audi", "honda");
        marcas.stream().forEach(print);

        marcas.stream()
                .map(Utilitarios.maiuscula)
                .map(Utilitarios.primeiraLetra)
                .map(Utilitarios::grito)
                .forEach(print);

    }
}
