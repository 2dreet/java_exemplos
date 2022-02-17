package execao;


import streamAPI.models.Aluno;

public class TesteExcecao {
    public static void main(String[] args) {
        Aluno a1 = null;
        try {
             pegarAluno(a1);
        } catch (Exception e) {
            System.out.println("Erro ao pegar aluno");
        }

        try {
            // aqui vai gerar um erro ArithmeticException
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void pegarAluno(Aluno aluno) {
        // aqui vai gerar um null pointer exception
        System.out.println(aluno.getNome());
    }
}
