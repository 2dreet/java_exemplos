package generics;

import java.util.TreeSet;

public class ComparableTeste {
    public static void main(String[] args) {
        // aqui o TreeSet vai adicionar na ordem
        // do menor para o maior
        TreeSet<Integer> nums = new TreeSet<>();

        nums.add(10);
        nums.add(4);
        nums.add(15);
        nums.add(2);
        nums.add(26);
        nums.add(3);
        nums.add(69);
        nums.add(0);
        nums.add(88);
        nums.add(7);
        nums.add(9);

        nums.stream().forEach(System.out::println);
    }
}
