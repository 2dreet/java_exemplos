package orientacaoObjeto;

import java.util.Scanner;

public class DesafioWhileMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float ultimaNota = 0;
        float total = 0;
        int qtdNota = 0;
        while(ultimaNota >= 0) {
            System.out.println("Digite uma nota entra 0 e 10 -> para finalizar digite -1");
            ultimaNota = scanner.nextFloat();
            if(ultimaNota >= 0 && ultimaNota <= 10) {
                total += ultimaNota;
                qtdNota++;
            }
        }

        System.out.println("Media: "+ (total / qtdNota));

        scanner.close();

    }
}
