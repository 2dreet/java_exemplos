package orientacaoObjeto;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite a qtd Das notas");
        int tamanhoArray = scanner.nextInt();

        double[] notas = new double[tamanhoArray];

        for (int i = 0; i < notas.length; i++){
            System.out.println("Digite a nota "+(i+1));
            notas[i] = scanner.nextInt();
        }

        double total = 0;
        for (double nota: notas){
            total += nota;
        }

        System.out.println("Media é " + (total/notas.length));

        scanner.close();

    }
}
