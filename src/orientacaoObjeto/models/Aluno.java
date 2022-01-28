package orientacaoObjeto.models;

import java.util.ArrayList;

public class Aluno {

    final String nome;
    final public ArrayList<Curso> cursos = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void adicionarCurso(Curso curso){
        curso.alunos.add(this);
        this.cursos.add(curso);
    }
}
