package orientacaoObjeto.heranca;

// aqui o extends herdar a classe Jogador
public class Heroi extends Jogador {

    // aqui é sobrescrito a funcao atacar de jogador
    public boolean atacar(Jogador oponente){
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);

        return ataque1 || ataque2;
    }
}
