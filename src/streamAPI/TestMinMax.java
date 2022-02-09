package streamAPI;

import streamAPI.models.Aluno;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class TestMinMax {
    public static void main(String[] args) {

        // Funcao lambda que compara valores
        Comparator<Aluno> melhorNota = (a1, a2) -> {
            // aqui quando retornar 1 é o registro a ser mantido no max
            // aqui quando retornar -1 é o registro a ser mantido no min
            // retorno 0 é neutro;

            if(a1.getNota() > a2.getNota()) {
                return 1;
            } else if(a1.getNota() < a2.getNota()) {
                return -1;
            }
            return 0;
        };

        Comparator<Aluno> piorNota = (a1, a2) -> {
            // aqui quando retornar 1 é o registro a ser mantido no max
            // aqui quando retornar -1 é o registro a ser mantido no min
            // retorno 0 é neutro;

            if(a1.getNota() < a2.getNota()) {
                return 1;
            } else if(a1.getNota() > a2.getNota()) {
                return -1;
            }
            return 0;
        };

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

        // aqui pega a maior nota
        alunos.stream()
                .max(melhorNota)
                .ifPresent(a -> System.out.println(a.getNome()));

        // aqui pega a pior nota
        alunos.stream()
                .max(piorNota)
                .ifPresent(a -> System.out.println(a.getNome()));


        // aqui invertemos as operacoes de cima
        alunos.stream()
                .min(melhorNota)
                .ifPresent(a -> System.out.println(a.getNome()));

        alunos.stream()
                .min(piorNota)
                .ifPresent(a -> System.out.println(a.getNome()));

    }
}
