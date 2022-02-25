package generics.model;

import java.util.List;

public class ListaUtil {

    // <?> pode ser de qualquer coisa
    // <? extends Object> -> qualquer coisa que
    // extende de Object
    // <? extends CaixaGenerica> -> qualquer coisa que
    // extende de CaixaGenerica
    public static Object getElemento1(List<?> lista) {
        return lista.get(lista.size() - 1);
    }

    // aqui colocamos o mesmo tipo da lista como o tpo do retorno;
    public static <T> T getElemento2(List<T> lista) {
        return lista.get(lista.size() - 1);
    }

    // aqui falamos que vai ter 3 tipos genericos na funcao
    // <A, B, C>, usamos os tipos A e B como parametro e o C como retorno;
    public static < A, B, C> C getElemento2(A varA, B varB) {
        C varC = null;
        return varC;
    }
}
