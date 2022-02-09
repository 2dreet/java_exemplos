package streamAPI;

import streamAPI.models.Aluno;

import java.util.Arrays;
import java.util.List;

public class TestSkipLimit {
    public static void main(String[] args) {

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

        // aqui pega paginado a partir do (2 - segundo) elemento
        alunos.stream().skip(2).forEach(System.out::println);

        System.out.println("\n\n\n");

        // aqui pega paginado a partir do (2 - segundo) elemento
        //  e no maximo 2
        alunos.stream().skip(2).limit(2).forEach(System.out::println);
    }
}
