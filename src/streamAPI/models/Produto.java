package streamAPI.models;

public class Produto {
    private String nome;
    private double valor;
    private int rank;

    public Produto(String nome, double valor, int rank) {
        this.nome = nome;
        this.valor = valor;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
