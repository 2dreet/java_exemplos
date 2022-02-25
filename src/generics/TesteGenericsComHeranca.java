package generics;

import generics.model.CaixaInt;

public class TesteGenericsComHeranca {

    public static void main(String[] args) {
        // aqui Instanciamnos a classe CaixaInt que herda a caixaGenerica Passando
        // a Tipagem
        CaixaInt caixaInt = new CaixaInt(123);
        Integer valorInt = caixaInt.getConteudo();

        System.out.println(valorInt);
    }
}
