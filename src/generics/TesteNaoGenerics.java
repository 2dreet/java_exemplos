package generics;

import generics.model.CaixaNaoGerica;

public class TesteNaoGenerics {

    public static void main(String[] args) {
        CaixaNaoGerica caixaNaoGerica = new CaixaNaoGerica(123);
        int valorInt = (int) caixaNaoGerica.getConteudo();

        CaixaNaoGerica caixaNaoGericaString = new CaixaNaoGerica("abc");
        String valorString = (String) caixaNaoGericaString.getConteudo();

        System.out.println(valorInt);
        System.out.println(valorString);
    }
}
