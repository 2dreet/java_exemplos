package streamAPI;

import streamAPI.models.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class TesteReduce2 {
    public static void main(String[] args) {

        // Funcao que recebe 2 parametros do mesmo tipo e retorna um valor do mesmo tipo
        BinaryOperator<Double> somatorio = (total, nota) -> total + nota;

        // Funcao que recebe 1 tipo e retorna outro tipo
        Function<Aluno, Double> apenasNota = a-> a.getNota();

        // Funcao lambda que recebe um parametro e retorna true ou false
        Predicate<Aluno> aprovado = a -> a.getNota() >= 7 ;

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

        alunos.stream()
                .filter(aprovado)
                .map(apenasNota)
                .reduce(somatorio)
                .ifPresent(System.out::println);

        String lineSeparator = System.getProperty("line.separator");

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Id".concat(lineSeparator));

        alunos.stream().forEach(row -> stringBuilder.append(row.getNome().concat(lineSeparator)));

        System.out.println(stringBuilder.toString());
    }
}
