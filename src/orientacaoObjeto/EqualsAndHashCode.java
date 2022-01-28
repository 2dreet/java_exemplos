package orientacaoObjeto;

import orientacaoObjeto.models.User;

public class EqualsAndHashCode {
    public static void main(String[] args) {

        User s1 = new User("José", "jose.pasquali@jj.com");
        User s2 = new User("José", "jose.pasquali@jj.com");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s1));
        System.out.println(s1.equals(null));

    }
}
