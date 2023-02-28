package Students;

import java.util.List;

public abstract class User {
    protected String login;
    protected String password;

    protected List<Discipline<Grade>> list;

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public abstract boolean equals(Student student);

    public abstract int hashCode();

    public abstract String toString();
}
