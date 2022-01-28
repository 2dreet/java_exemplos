package orientacaoObjeto.models;

import orientacaoObjeto.models.heranca.Civic;
import orientacaoObjeto.models.heranca.Ferrari;

public class DesafioHeranca1 {
    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari();
        Civic civic = new Civic();

        ferrari.acelerar();
        civic.acelerar();

        System.out.println("Ferrari " + ferrari.velocidade);
        System.out.println("Civic " + civic.velocidade);

        ferrari.acelerar();
        civic.acelerar();

        System.out.println("Ferrari " + ferrari.velocidade);
        System.out.println("Civic " + civic.velocidade);

        ferrari.frear();
        civic.frear();

        System.out.println("Ferrari " + ferrari.velocidade);
        System.out.println("Civic " + civic.velocidade);

        ferrari.frear();
        civic.frear();
        ferrari.frear();
        civic.frear();
        ferrari.frear();
        civic.frear();
        ferrari.frear();
        civic.frear();
        ferrari.frear();
        civic.frear();

        System.out.println("Ferrari " + ferrari.velocidade);
        System.out.println("Civic " + civic.velocidade);

    }
}
