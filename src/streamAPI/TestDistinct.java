package streamAPI;

import streamAPI.models.Aluno;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestDistinct {
    public static void main(String[] args) {

        List<Aluno> alunos = Arrays.asList(
            new Aluno("Joao", 8),
            new Aluno("Tiago", 6),
            new Aluno("Pedro", 9),
            new Aluno("Pedro", 9),
            new Aluno("Jose", 8.5),
            new Aluno("Jose", 8.5),
            new Aluno("Ana", 7.8),
            new Aluno("Ana", 7.8),
            new Aluno("Carlo", 4.7),
            new Aluno("Maria", 9.5),
            new Aluno("Maria", 9.5),
            new Aluno("Julia", 8.6)
        );

        // deve implementar o equal e hashCode
        alunos.stream().distinct().forEach(System.out::println);
    }
}
