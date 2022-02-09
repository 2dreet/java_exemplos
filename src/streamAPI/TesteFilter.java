package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class TesteFilter {
    public static void main(String[] args) {

        // Funcao lambda que recebe um parametro mas nao retorna nada
        Consumer<Integer> print = System.out::println;
        // Funcao lambda que recebe um parametro e retorna true ou false
        Predicate<Integer> isPar = n -> (n % 2 == 0);

        List<Integer> numeros = Arrays.asList(1 , 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numeros.stream().forEach(print);
        System.out.println("\n\nApenas Pares");
        // aqui filtra os dados para pegar apenas numeros pares
        numeros.stream().filter(isPar).forEach(print);
    }
}
