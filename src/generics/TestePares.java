package generics;

import generics.model.Pares;

public class TestePares {
    public static void main(String[] args) {
        Pares<Integer, String> resultadoConcurso = new Pares<>();

        resultadoConcurso.adicionar(1, "Maria");
        resultadoConcurso.adicionar(2, "Pedro");
        resultadoConcurso.adicionar(3, "Joao");
        resultadoConcurso.adicionar(3, "Rebeca");


        System.out.println(resultadoConcurso.getValor(1));
        System.out.println(resultadoConcurso.getValor(3));
    }
}
