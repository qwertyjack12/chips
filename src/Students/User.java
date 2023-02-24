package Students;

/**
 * Класс пользователя
 *
 * @author Zelenin
 * @version 1.1
 */
public class User extends AbstractUser {
    /**
     * Конструктор - создание нового объекта с определенными значениями
     *
     * @param fio - фио пользователя
     * @param age - кол-во лет пользователя
     * @see User#User(String, Integer)
     */
    public User(String fio, Integer age) {
        this.fio = fio;
        this.age = age;
    }

    /**
     * Переопределенный метод toString() базового класса Object
     */
    @Override
    public String toString() {
        return "Пользователь: " + fio + " , которому " + age + " лет";
    }
}

/**
 * Абстрактный класс пользователя со свойствами fio, age
 *
 * @author Zelenin
 */

abstract class AbstractUser {
    /**
     * Поле фио
     */
    String fio;

    /**
     * Поле количество лет
     */
    Integer age;

    /**
     * Метод определения fio {@link User#fio}
     */
    public void setFio(String fio) {
        this.fio = fio;
    }

    /**
     * Метод определения age {@link User#age}
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Метод получения значения поля fio {@link User#fio}
     */
    public String getFio() {
        return this.fio;
    }

    /**
     * Метод получения значения поля age {@link User#age}
     */
    public Integer getAge() {
        return this.age;
    }

    /**
     * Абстрактный метод для переопределения метода toString{@link User#toString()}
     * базового класса Object
     */
    public abstract String toString();
}
