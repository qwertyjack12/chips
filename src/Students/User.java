package Students;

public class User extends AbstractUser{
    public User(String fio, Integer age) {
        this.fio = fio;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Пользователь: " + fio + " , которому " + age + " лет";
    }
}

abstract class AbstractUser {
    String fio;
    Integer age;

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFio() {
        return this.fio;
    }

    public Integer getAge() {
        return this.age;
    }

    public abstract String toString();
}
