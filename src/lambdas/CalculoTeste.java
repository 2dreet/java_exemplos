package lambdas;

public class CalculoTeste {
    public static void main(String[] args) {
        // aqui com herança e polimorfismo
        Calculo calculo = new Somar();
        System.out.println(calculo.executar(1, 6));

        Somar somar = new Somar();
        System.out.println(somar.executar(8, 12));

        // aqui com lambda como só tem 1 funcao em Calculo da para fazer assim
        // sem passar o nome da funcao
        // cria uma lambda expression
        // é parecido com as arrow functions do javascript
        // não foi preciso criar uma classe para implementar a interface
        Calculo calculoLambda = (a, b) -> {
            return a + b;
        };
        System.out.println(calculoLambda.executar(2, 4));

        // aqui sem chaves mas precisa ter apenas uma senteça de codigo
        calculoLambda = (a, b) -> a * b;
        System.out.println(calculoLambda.executar(2, 4));
    }
}
