package orientacaoObjeto.models;

import java.util.ArrayList;

public class Compra {

    public Cliente cliente;

    public ArrayList<Item> items = new ArrayList<>();

    public void adicionarProduto(Item item) {
        item.compra = this;
        this.items.add(item);
    }

    public double obterValorTotal(){
        double total =0;
        for (Item item : items) {
            total += item.obterValorTotal();
        }
        return total;
    }
}
