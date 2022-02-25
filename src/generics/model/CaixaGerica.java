package generics.model;

// A palavra tipo vai ser substituido pelo Objeto ou Tipo de atributo passado,
public class CaixaGerica<T> {

    private T conteudo;

    public CaixaGerica(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }
}
