package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fonecedor {
    public static void main(String[] args) {
        Supplier<List<String>> umaLista = () -> Arrays.asList("José", "Joao");
        System.out.println(umaLista.get());
    }
}
