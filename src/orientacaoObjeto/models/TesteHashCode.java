package orientacaoObjeto.models;

import java.util.HashSet;
import java.util.Set;

public class TesteHashCode {

    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>();

        personSet.add(new Person("Jose"));
        personSet.add(new Person("Paulo"));
        personSet.add(new Person("Joao"));
        personSet.add(new Person("Maria"));
        personSet.add(new Person("Fernanda"));
        personSet.add(new Person("Mateus"));

        boolean contains = personSet.contains(new Person("Jose"));

        System.out.println(contains);
    }
}
