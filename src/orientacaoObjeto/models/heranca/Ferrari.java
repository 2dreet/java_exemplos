package orientacaoObjeto.models.heranca;

public class Ferrari extends Carro {
    @Override
    public void acelerar(){
        velocidade += 15;
    }
}
