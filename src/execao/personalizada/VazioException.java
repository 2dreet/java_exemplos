package execao.personalizada;

@SuppressWarnings("serial")
public class VazioException extends RuntimeException {

    private String nomeDoAtributo;

    public VazioException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo %s está vazio", nomeDoAtributo);
    }
}
