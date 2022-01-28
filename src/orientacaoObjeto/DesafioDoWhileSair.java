package orientacaoObjeto;

import java.util.Scanner;

public class DesafioDoWhileSair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String texto = "";
        do {
            System.out.println("Digite algo ou 'Sair' para Sair:");
            texto = scanner.nextLine();
            System.out.println(texto);
        } while(!texto.equalsIgnoreCase("sair"));

        scanner.close();

    }
}
