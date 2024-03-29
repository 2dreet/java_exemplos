package lambdas.model;

public class Produto extends Object {
    public final String nome;
    public final double preco;
    public final double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String toString() {
        return nome;
    }
}
