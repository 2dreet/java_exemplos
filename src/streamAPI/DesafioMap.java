package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);


        UnaryOperator<String> inverter = str -> new StringBuilder(str).reverse().toString();

        Function<String, Integer> binarioParaInt = str -> Integer.parseInt(str, 2);


        nums.stream()
                // Transformar para string binária
                .map(Integer::toBinaryString)
                // Inverter String
                .map(inverter)
                // Converter para int novamente
                .map(binarioParaInt)
                .forEach(System.out::println);
    }
}
