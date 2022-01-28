package streamAPI;

import java.util.Arrays;
import java.util.List;

public class TesteStream {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Jose", "Joao");
        System.out.println("Usando stream...");
        aprovados.stream().forEach(System.out::println);
    }
}
