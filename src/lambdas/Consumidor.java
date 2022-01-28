package lambdas;


import lambdas.model.Produto;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = produto -> System.out.println(produto.nome + " " + produto.preco);

        Produto produto = new Produto("Vaca1", 152.00, 0.0);
        Produto produto2 = new Produto("Vaca2", 152.00, 0.0);
        Produto produto3 = new Produto("Vaca3", 152.00, 0.0);
        Produto produto4 = new Produto("Vaca4", 152.00, 0.0);
        Produto produto5 = new Produto("Vaca5", 152.00, 0.0);

        imprimir.accept(produto);

        List<Produto> produtos = Arrays.asList(produto,produto2,produto3,produto4, produto5);

        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.nome));
        produtos.forEach(System.out::println);


    }
}
