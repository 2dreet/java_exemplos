package streamAPI;

import java.util.Arrays;
import java.util.List;

public class TesteList {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Jose", "Joao");
        System.out.println("Usando foreach...");
        for (String nome : aprovados ) {
            System.out.println(nome);
        }
    }
}
