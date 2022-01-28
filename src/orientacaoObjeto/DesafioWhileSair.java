package orientacaoObjeto;

import java.util.Scanner;

public class DesafioWhileSair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String texto = "";
        while(!texto.equalsIgnoreCase("sair")) {
            System.out.println("Digite algo ou 'Sair' para Sair:");
            texto = scanner.nextLine();
            System.out.println(texto);
        }

        scanner.close();

    }
}
