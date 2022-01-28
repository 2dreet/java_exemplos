package lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = n -> (n % 2) == 0 ? "Par" :"Impar";

        System.out.println(parOuImpar.apply(5));
        System.out.println(parOuImpar.apply(2));

        Function<String, String> oResultadoE = valor -> "O resultado é: "+valor;

        // aqui usa o andThen que chama a outra Function passando o resultado
        // do retorno do parOuImpar é possivel concatenar
        // varias funcoes para retornar um resultado
        String resultadE = parOuImpar.andThen(oResultadoE).apply(16);
        System.out.println(resultadE);
    }
}
