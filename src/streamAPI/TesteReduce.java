package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class TesteReduce {
    public static void main(String[] args) {

        // Funcao que recebe 2 parametros do mesmo tipo e retorna um valor do mesmo tipo
        BinaryOperator<String> juntar = (conjunto, letra) -> conjunto.toUpperCase() + letra.toUpperCase();
        BinaryOperator<Integer> somar = (total, valor) -> total + valor;

        // aqui quebrando a string em uma lista
        List<String> letras = Arrays.asList("a casa de madeira".split(""));
        // aqui juntamos a lista em string usando o reduce
        String palavraMontada = letras.stream().reduce(juntar).orElse(null);

        System.out.println(palavraMontada);

        // aqui juntamos a lista em string usando o reduce com valor inicial
        String palavraMontada2 = letras.stream().reduce("A frase é: ", juntar);
        System.out.println(palavraMontada2);


        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer total = numeros.stream().reduce(somar).orElse(null);
        System.out.println(total);

        Integer total2 = numeros.stream().reduce(100, somar);
        System.out.println(total2);

        // ifPresent execunta uma funcao caso retornar valor
        numeros.stream()
                .filter(n -> n > 5)
                .reduce(somar)
                .ifPresent(System.out::println);

    }
}
