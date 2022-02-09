package streamAPI;

import streamAPI.models.Aluno;

import java.util.Arrays;
import java.util.List;

public class TestTakeWhile {
    public static void main(String[] args) {

        List<Aluno> alunos = Arrays.asList(
            new Aluno("Joao", 8),
            new Aluno("Pedro", 9),
            new Aluno("Jose", 8.5),
            new Aluno("Tiago", 6),
            new Aluno("Ana", 7.8),
            new Aluno("Carlo", 4.7),
            new Aluno("Maria", 9.5),
            new Aluno("Julia", 8.6)
        );


        // vai executar o takeWHile até achar uma nota que for menor que 7
        // se a primeira nota for menor que 7 vai para no primeiro registro
        alunos.stream()
                .takeWhile(a -> a.getNota() > 7)
                .forEach(System.out::println);
    }
}
