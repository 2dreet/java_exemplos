package streamAPI;

import streamAPI.models.Aluno;
import streamAPI.models.Media;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class TesteReduce3 {
    public static void main(String[] args) {

        // Funcao que recebe 2 parametros de tipos diferentes
        // e retorna um valor de tipo diferente
        BiFunction<Media, Double, Media> calcularMedia = (media, nota) -> media.adicionar(nota);

        // Funcao que recebe 1 tipo e retorna outro tipo
        Function<Aluno, Double> apenasNota = a-> a.getNota();

        // Funcao lambda que recebe um parametro e retorna true ou false
        Predicate<Aluno> aprovado = a -> a.getNota() >= 7 ;

        // Funcao que recebe 2 parametros do mesmo tipo e retorna um valor do mesmo tipo
        BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinar(m1, m2);

        List<Aluno> alunos = Arrays.asList(
            new Aluno("Joao", 8),
            new Aluno("Tiago", 6),
            new Aluno("Pedro", 9),
            new Aluno("Jose", 8.5),
            new Aluno("Ana", 7.8),
            new Aluno("Carlo", 4.7),
            new Aluno("Maria", 9.5),
            new Aluno("Julia", 8.6)
        );

        Media media = alunos.stream()
                .filter(aprovado)
                .map(apenasNota)
                // aqui o reduce como é um objeto
                // é preciso passar uma nova instancia
                // depois passar a funcao que ira fazer o calculo
                // depois uma funcao para juntar
                .reduce(new Media(), calcularMedia, combinarMedia);

        System.out.println(media.getMedia());
    }
}
