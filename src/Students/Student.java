package Students;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс студента со свойствами login и password
 *
 * @author Zelenin
 * @version 1.0
 */

public class Student extends User implements StudentInterface {

    /**
     * Конструктор - создание нового объекта с определенными значениями
     *
     * @param login    - login
     * @param password - password
     * @see Student#Student(String, String)
     */
    public Student(String login, String password) {
        this.login = login;
        this.password = password;
        this.list = new ArrayList<>();
    }

    /**
     * Переопределение функции append_discipline интерфейса StudentInterface
     */
    @Override
    public void append_discipline(Discipline discipline) {
        list.add(discipline);
    }

    /**
     * Переопределение функции remove_discipline интерфейса StudentInterface
     */
    @Override
    public void remove_discipline(Discipline discipline) {
        list.remove(discipline);
    }

    /**
     * Переопределение функции remove_discipline интерфейса StudentInterface
     */
    @Override
    public void remove_discipline(int index) {
        list.remove(index);
    }

    /**
     * Переопределение функции equals базового класса Object
     */
    @Override
    public boolean equals(Student student) {
        return this.hashCode() == student.hashCode();
    }

    /**
     * Переопределение функции hashCode базового класса Object
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((login == null) ? 0 : login.hashCode()) + ((password == null) ? 0 : password.hashCode());
        return result;
    }

    /**
     * Переопределение функции toString базового класса Object
     */
    @Override
    public String toString() {
        List<String> output = new ArrayList<>();
        for (Discipline discipline : list) {
            output.add(discipline.getName() + " " + discipline.getGrade().getValue() + " " + discipline.getGrade().toString());
        }
        return output.toString();
    }
}
