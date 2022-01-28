package orientacaoObjeto;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o N1");
        Double a = scanner.nextDouble();

        System.out.println("Digite o N2");
        Double b = scanner.nextDouble();


        System.out.println("Digite a operação (+ , - , / , * )");
        String op = scanner.next();

        if(op.equals("+")) {
            System.out.println("Resultado: " + ( a + b ));
        } else if(op.equals("-")) {
            System.out.println("Resultado: " + ( a - b));
        } else if(op.equals("*")) {
            System.out.println("Resultado: " + ( a * b ));
        } else if(op.equals("/")) {
            System.out.println("Resultado: " + ( a / b));
        }

    }
}
