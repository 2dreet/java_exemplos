package orientacaoObjeto.models;

import java.util.Objects;

public class User {
    public String name;
    public String email;

    public User() {

    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return Objects.equals(name, user.name) &&
                Objects.equals(email, user.email);
    }

    public int hashCode() {
        return Objects.hash(name, email);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
