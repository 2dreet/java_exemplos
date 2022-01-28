package orientacaoObjeto.models;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;

    List<Compra> compras = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void adicionarCompra(Compra compra) {
        compra.cliente = this;
        compras.add(compra);
    }

    public double obterValorTotalCompras(){
        double total =0;
        for (Compra compra : compras) {
            total += compra.obterValorTotal();
        }
        return total;
    }


}
