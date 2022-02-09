package streamAPI;

import streamAPI.models.Produto;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFiltro {
    public static void main(String[] args) {

        // Funcao lambda que recebe um parametro e retorna true ou false
        Predicate<Double> precoMenorDe15 = p -> (p <= 15d);
        Predicate<Double> precoMaiorrDe15 = p -> (p > 15d);
        Predicate<Integer> melhorRank = r -> (r > 3);
        Predicate<Integer> piorRank = r -> (r < 3);

        // Funcao lambda que recebe um tipo e retorna outro tipo
        Function<Produto, String> descricaoProduto = p ->
                        " Nome: " + p.getNome()
                        + ", Preço " + p.getValor()
                        + ", Rank " + p.getRank();

        // Funcao lambda que recebe um parametro mas nao retorna nada
        Consumer<String> print = System.out::println;

        List<Produto> produtos = Arrays.asList(
                new Produto("Coca cola", 3.5, 4),
                new Produto("Feijão", 9.99, 5),
                new Produto("Arroz", 6.5, 3),
                new Produto("Papel igienico", 19.5, 2),
                new Produto("Iogurte", 17.5, 4),
                new Produto("Banana", 1.5, 5),
                new Produto("Carne", 35.5, 1),
                new Produto("Cafe", 12.9, 2),
                new Produto("Bolinha de golfe", 45.5, 2)
        );


        System.out.println("\n\nPiores ranks e maior valor");
        produtos.stream()
                .filter(p -> precoMaiorrDe15.test(p.getValor()))
                .filter(p -> piorRank.test(p.getRank()))
                .map(descricaoProduto)
                .forEach(print);

        System.out.println("\n\nMelhores ranks e maior valor");
        produtos.stream()
                .filter(p -> precoMaiorrDe15.test(p.getValor()))
                .filter(p -> melhorRank.test(p.getRank()))
                .map(descricaoProduto)
                .forEach(print);

        System.out.println("\n\nPiores ranks e menor valor");
        produtos.stream()
                .filter(p -> precoMenorDe15.test(p.getValor()))
                .filter(p -> piorRank.test(p.getRank()))
                .map(descricaoProduto)
                .forEach(print);

        System.out.println("\n\nMelhores ranks e menor valor");
        produtos.stream()
                .filter(p -> precoMenorDe15.test(p.getValor()))
                .filter(p -> melhorRank.test(p.getRank()))
                .map(descricaoProduto)
                .forEach(print);


    }
}