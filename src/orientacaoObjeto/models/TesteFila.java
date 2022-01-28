package orientacaoObjeto.models;

import java.util.LinkedList;
import java.util.Queue;

public class TesteFila {
    public static void main(String[] args) {
        Queue<String> users = new LinkedList<>();
        // os 2 adicionam na fila
        //quando a fila estiver cheia retorna falso
        users.add("Jose");
        //quando a fila estiver cheia estoura Exception
        users.offer("Ana");



        // Retorna o proximo da fila mas não remove/ caso a fila estiver vazia retorna null
        System.out.println(users.peek());
        // Retorna o proximo da fila mas não remove/ caso a fila estiver vazia estora Exception
        System.out.println(users.element());



        // Retorna o proximo da fila e remove da fila/ caso a fila estiver vazia retorna null
        System.out.println(users.poll());

        // Retorna o proximo da fila e remove da fila/ caso a fila estiver vazia estora Exception
        System.out.println(users.remove());


//        users.size();
//        users.isEmpty();
//        users.clear();
//        users.contains(...);


    }


}
