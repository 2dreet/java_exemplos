package generics;

import generics.model.ListaUtil;

import java.util.Arrays;
import java.util.List;

public class TesteGenericsComMetodos {

    public static void main(String[] args) {

        List<String> langs = Arrays.asList("Java", "PHP");
        List<Integer> months = Arrays.asList(1,2,3,4,5,6,7,8,10, 11, 12);

        String ultimaLinguagem = (String) ListaUtil.getElemento1(langs);
        Integer ultimoMes = (Integer) ListaUtil.getElemento1(months);

        System.out.println(ultimaLinguagem);
        System.out.println(ultimoMes);


        String ultimaLinguagem2= ListaUtil.getElemento2(langs);
        Integer ultimoMes2 = ListaUtil.getElemento2(months);

        System.out.println(ultimaLinguagem2);
        System.out.println(ultimoMes2);

    }
}
