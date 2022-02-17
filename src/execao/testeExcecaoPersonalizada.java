package execao;

import execao.personalizada.NumeroNegativoException;
import execao.personalizada.ValidadorAluno;
import execao.personalizada.VazioException;
import streamAPI.models.Aluno;

public class testeExcecaoPersonalizada {
    public static void main(String[] args) {
        Aluno a1 = null;
        Aluno a2 = new Aluno("", 10);
        Aluno a3 = new Aluno("Jose", -1);
        Aluno a4 = new Aluno("Joao", 10);

        validarAluno(a1);
        validarAluno(a2);
        validarAluno(a3);
        validarAluno(a4);
    }

    private static void validarAluno(Aluno aluno) {
        try {
            ValidadorAluno.aluno(aluno);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (VazioException | NumeroNegativoException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
