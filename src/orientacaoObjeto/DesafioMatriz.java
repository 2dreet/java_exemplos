package orientacaoObjeto;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class DesafioMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite a qtd Das notas");
        int tamanhoArray = scanner.nextInt();


        System.out.println("Digite a qtd de ALunos");
        int tamanhoArrayAlunos = scanner.nextInt();

        int[][] alunos = new int[tamanhoArrayAlunos][tamanhoArray];

        for (int i = 0; i < alunos.length; i++){
            for (int x = 0; x < alunos[i].length; x++){
                System.out.println("Digite a nota "+(x+1)+" do aluno "+(i+1));
                alunos[i][x] = scanner.nextInt();
            }
        }

        for (int[] aluno: alunos) {
            System.out.println(Arrays.toString(aluno));
        }



        double total = 0;


        for (int[] aluno: alunos) {
            for (int nota: aluno) {
                total += nota;
            }
        }

        System.out.println("Media da turma é " + (total/(tamanhoArray*tamanhoArrayAlunos)));

        scanner.close();

    }
}
