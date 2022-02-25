package generics;

import generics.model.CaixaNumero;

public class TesteGenericsComHerancaExtends {

    public static void main(String[] args) {
        // aqui Instanciamnos a classe CaixaNumero que tem como Tipagem
        // a heranca de Number sendo assim quando for instanciar
        // deve ser passado uma tipagem que extende a classe Number
        // Ex: Integer, Double, Float, Long, etc ...
        CaixaNumero<Integer> caixaInt = new CaixaNumero<>(123);
        Integer valorInt = caixaInt.getConteudo();

        System.out.println(valorInt);
    }
}
