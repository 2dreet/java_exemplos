package streamAPI;

import java.util.function.UnaryOperator;

public class Utilitarios {

    // UnaryOperator é uma funcao que recebe um atributo e retorna
    // uma valor do mesmo tipo
    public static UnaryOperator<String> maiuscula = str -> str.toUpperCase();
    public static UnaryOperator<String> primeiraLetra = str -> String.valueOf(str.charAt(0));
    public static String grito(String str) {
        return str.concat("!!!");
    }

}
