package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {
    public static void main(String[] args) {

        // aqui estamos utilizando funcional
        // Consumer recebe uma string e passa para a funcao printar o valor
        Consumer<String> print = System.out::println;
        Consumer<Integer> printInt = System.out::println;

        // uma maneira de criar uma stream é utilizando .of
        // Aqui criamos uma stream de string
        Stream<String> langs = Stream.of("JAVA ", "PHP ", "JS\n");

        // aqui chamamos o forEach passando o consumer para ser executado
        langs.forEach(print);


        //Aqui criamos uma strem a partir de um Array
        String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go \n"};
        Stream.of(maisLangs).forEach(print);

        // Aqui criamos uma stream utilizando o utilitario Arrays
        Arrays.stream(maisLangs).forEach(print);
        // Aqui listamos os elementos da stream
        // por indice que vai pegar o indice [1] até o indice ([3] -1)
        Arrays.stream(maisLangs, 1, 3).forEach(print);


        // aqui usamos a stream apartir de um List<C>
        List<String> outraLangs = Arrays.asList("C", "PHP", "Cobol");
        outraLangs.stream().forEach(print);
        // executando em paralelo
        outraLangs.parallelStream().forEach(print);


        // Gera uma stream infinito
        Stream.generate(() -> "a").forEach(print);

        // Gera uma stream que incrementa um numero
        Stream.iterate(0, n -> n + 1).forEach(printInt);

    }
}
