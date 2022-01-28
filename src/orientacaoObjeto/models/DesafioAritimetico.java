package orientacaoObjeto.models;

public class DesafioAritimetico {

    public static void main(String[] args) {

        int a = 3;
        int b = 2;
        int c = 6;

        int d = 3;
        int e = 2;

        int somaA = (int) Math.pow(((a + b) * c), 2) / (d * e);

        System.out.println(somaA);

        int f = 2;
        int g = 7;
        int h = 1;
        int i = 5;
        int j = 2;

        int somaB = (int) Math.pow(((( h - i ) * ( f - g )) / j), 2);

        System.out.println(somaB);


        int resultadoA = somaA - somaB;


        int k = 10;


        int somaFinal = (int) (Math.pow(resultadoA, 3) / Math.pow(k, 3));

        System.out.println("Total "+ somaFinal);

    }

}
