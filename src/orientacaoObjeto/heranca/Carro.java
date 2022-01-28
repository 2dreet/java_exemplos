package orientacaoObjeto.heranca;

public class Carro {
    public int velocidade = 0;

    public void acelerar(){
        velocidade += 5;
    }

    public void frear(){
        if(velocidade > 0) {
            velocidade -= 5;
        }
    }
}
