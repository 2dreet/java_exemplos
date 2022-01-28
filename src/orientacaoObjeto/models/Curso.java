package orientacaoObjeto.models;

import java.util.ArrayList;

public class Curso {

    final String nome;
    final public ArrayList<Aluno> alunos = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    public void adicionarAluno(Aluno aluno){
        aluno.cursos.add(this);
        this.alunos.add(aluno);
    }
}
