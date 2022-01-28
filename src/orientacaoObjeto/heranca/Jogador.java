package orientacaoObjeto.heranca;

public class Jogador {

    int posicaoX = 0;
    int posicaoY = 0;
    int vida = 100;

    public boolean atacar(Jogador oponente) {
        int diffX = Math.abs(posicaoX - oponente.posicaoX);
        int diffY = Math.abs(posicaoY - oponente.posicaoY);

        if(diffX == 0 && diffY == 1) {
            oponente.vida -= 10;
            return true;
        } else if(diffY == 0 && diffX == 1) {
            oponente.vida -= 10;
            return true;
        }

        return false;
    }

}

