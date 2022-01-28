package orientacaoObjeto;

import java.util.Scanner;

public class DesafioConversao {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Iniciando");

        Double salario1 = getSalario("Digite o salario 1");
        Double salario2 = getSalario("Digite o salario 2");
        Double salario3 = getSalario("Digite o salario 3");

        scanner.close();

        System.out.println("Media foi: " + ((salario1+salario2+salario3)/ 3));

    }

    private static Double getSalario(String titulo){
        System.out.println(titulo);
        String valor = scanner.next().replace(",", ".");
        if(!isNumeric(valor)) {
            return getSalario(titulo);
        }
        return Double.parseDouble(valor);
    }

    private static boolean isNumeric(String valor){
        try {

           Double.parseDouble(valor);
           return true;
        } catch (Exception e) {
            return false;
        }
    }
}
