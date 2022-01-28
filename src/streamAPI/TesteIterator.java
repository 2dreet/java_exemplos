package streamAPI;

import java.util.Arrays;
import java.util.Iterator;

public class TesteIterator {
    public static void main(String[] args) {
        Iterator<String> aprovados = Arrays.asList("Jose", "Joao").iterator();
        System.out.println("Usando iterator...");
        while(aprovados.hasNext()) {
            System.out.println(aprovados.next());
        }
    }
}
