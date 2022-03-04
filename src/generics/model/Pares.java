package generics.model;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

// aqui falamos que vai ter 2 tipos genericos
// definimos que o C vai receber qualquer Objeto que extende Number
public class Pares<C extends Number, V> {

    // aqui passamos os 2 tipos genericos
    // LinkedHashSet garante a ordem de insercao
    private final Set<Par<C, V>> itens = new LinkedHashSet<>();

    public void adicionar(C chave, V valor) {
        if(chave == null) {
            return;
        }

        Par<C, V> novoPar = new Par<C, V>(chave, valor);

        if(itens.contains(novoPar)) {
            itens.remove(novoPar);
        }

        itens.add(novoPar);
    }

    public V getValor(C chave) {
        if(chave == null) {
            return null;
        }

        return itens.stream()
                .filter(p -> p.getChave().equals(chave))
                .findFirst()
                .map(p -> p.getValor())
                .get();

    }

}
