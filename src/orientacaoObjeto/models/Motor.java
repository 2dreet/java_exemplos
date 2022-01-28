package orientacaoObjeto.models;

import orientacaoObjeto.models.Carro;

public class Motor {

    public boolean ligado;
    public double fatorInjecao = 1d;

    final public Carro carro;

    public Motor (Carro carro) {
        this.carro = carro;
    }

    public int giros() {
        return ligado ? (int) Math.round(fatorInjecao * 3000) : 0;
    }


}
