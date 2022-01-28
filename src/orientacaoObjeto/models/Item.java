package orientacaoObjeto.models;

public class Item {

    int quantidade;
    Produto produto;
    public Compra compra;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double obterValorTotal() {
        return produto.preco * quantidade;
    }

}
