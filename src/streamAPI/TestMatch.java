package streamAPI;

import streamAPI.models.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestMatch {
    public static void main(String[] args) {

        // Funcao lambda que recebe um parametro e retorna true ou false
        Predicate<Aluno> aprovado = a -> a.getNota() >= 7 ;
        // aqui utilizamos a funcao de cima mas invertemos o resultado
        Predicate<Aluno> reprovado = aprovado.negate() ;

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

        // allMatch -> aqui todos tem que retornar true na funcao aprovados
        System.out.println(alunos.stream()
                .allMatch(aprovado));

        // anyMatch -> aqui apenas um tem que retornar true na funcao aprovados
        System.out.println(alunos.stream()
                .anyMatch(aprovado));

        // noneMatch -> aqui todos em que retornar false na funcao aprovados
        System.out.println(alunos.stream()
                .noneMatch(aprovado));

        // anyMatch -> aqui apenas um tem que retornar true na funcao aprovados
        System.out.println(alunos.stream()
                .anyMatch(reprovado));

    }
}
