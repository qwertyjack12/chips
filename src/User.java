class User extends AbstractUser {
    User(String fio, Integer age){
        this.fio = fio;
        this.age = age;
    }
}

abstract class AbstractUser{
    String fio;
    Integer age;

    public void setFio(String fio){
        this.fio = fio;
    }

    public void setAge(Integer age){
        this.age = age;
    }
}
