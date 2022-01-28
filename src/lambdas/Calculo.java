package lambdas;

@FunctionalInterface
public interface Calculo {

    double executar(double a, double b);

    default String digaOla() {
        return "Olá " + executar(1, 1);
    }

    static String digaAdeus() {
        return "Adeus";
    }

}
