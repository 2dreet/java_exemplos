package lambdas;

import java.util.Arrays;
import java.util.List;

public class ForeachTeste {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("José", "João", "Pedro");

        // Forma tradicional
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        // Forma Lambda
        aprovados.forEach((nome) -> System.out.println(nome));

        // Com apenas 1 atributo não precisa dos parenteces e
        // com apenas 1 exprecao não precisa das chaves
        aprovados.forEach(nome -> System.out.println(nome));


        // Method Reference....
        // aqui para cada aprovados vai percorrer
        // e passar para a funcao println cada 1 dos elementos
        aprovados.forEach(System.out::println);


        // Forma Lambda chamando uma funcao personalizada
        aprovados.forEach(nome -> meuImprimir(nome));


        // Method Reference....
        // aqui para cada aprovados vai percorrer
        // e passar para a funcao meuImprimir cada 1 dos elementos
        // mas precisa ser funcoes estaticas
        aprovados.forEach(ForeachTeste::meuImprimir);
    }

    static void meuImprimir(String nome) {
        System.out.println("Oi meu nome é " + nome);
    }

}
