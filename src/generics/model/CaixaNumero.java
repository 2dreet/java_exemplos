package generics.model;

// aqui foi criando uma classe generica De number
// Aonde é possivel passar Log, Integer, Double e Float
public class CaixaNumero<N extends Number> extends CaixaGerica<N> {
    public CaixaNumero(N conteudo) {
        super(conteudo);
    }
}
