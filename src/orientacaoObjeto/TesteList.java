package orientacaoObjeto;

import orientacaoObjeto.models.User;

import java.util.ArrayList;

public class TesteList {
    public static void main(String[] args) {
    ArrayList<User> users = new ArrayList<>();

    users.add(new User("jose", "jose@jose.com"));
    users.add(new User("joao", "joao@joao.com"));
    users.add(new User("mateus", "mateus@mateus.com"));
    users.add(new User("carlos", "carlos@carlos.com"));
    users.add(new User("gean", "gean@gean.com"));

    for (User u: users ){
        System.out.println(u);
    }

    // obtem o usuario no indice 2
    System.out.println(users.get(2));


    //remove no indice 2
    System.out.println(users.remove(2));



    //remove no indice 2
    System.out.println(users.contains(new User("jose", "jose@jose.com")));
    }
}
