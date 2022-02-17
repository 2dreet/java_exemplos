package execaoChecada.personalizada;


import streamAPI.models.Aluno;

public class ValidadorAluno {

    private ValidadorAluno() {};

    public static void aluno(Aluno aluno)
            throws VazioException, NumeroNegativoException {
        if(aluno == null){
            throw new IllegalArgumentException("O aluno está nulo!");
        }

        if(aluno.getNome() == null || aluno.getNome().trim().isEmpty()){
            throw new VazioException("nome");
        }

        if(aluno.getNota() < 0){
            throw new NumeroNegativoException("nota");
        }
    }

}
