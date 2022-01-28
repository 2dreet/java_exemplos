package orientacaoObjeto;

public class DesafioTabelaVerdade {

    public static void main(String[] args) {

        boolean terca = true;
        boolean quarta = false;


        if(terca && quarta) {
            System.out.println("Comprou TV 50 Polegadas");
        } else if(terca ^ quarta) {
            System.out.println("Comprou TV 32 Polegadas");
        }

        if(terca || quarta) {
            System.out.println("Tomou sorvete");
        } else {
            System.out.println("Não tomamos sorvete");
        }


    }

}
