package generics.model;

import java.util.SortedSet;
import java.util.TreeSet;

// aqui falamos que vai ter 2 tipos genericos
// definimos que o C vai receber qualquer Objeto que extende Number
public class Pares<C extends Number, V> {

    // aqui passamos os 2 tipos genericos
    private final SortedSet<Par<C, V>> itens = new TreeSet<>();

    public void adicionar(C chave, V valor) {
        itens.add(new Par<C, V>(chave, valor));
    }
}
