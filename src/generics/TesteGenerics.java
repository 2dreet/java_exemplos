package generics;

import generics.model.CaixaGerica;

public class TesteGenerics {

    public static void main(String[] args) {
        // aqui definimos o tipo do generics que foi configurado na classe
        CaixaGerica<Integer> caixaGerica = new CaixaGerica<>(123);
        Integer valorInt = caixaGerica.getConteudo();

        // aqui definimos o tipo do generics que foi configurado na classe
        CaixaGerica<String> caixaGerica2 = new CaixaGerica<String>("abc");
        String valorString = caixaGerica2.getConteudo();

        System.out.println(valorInt);
        System.out.println(valorString);
    }
}
