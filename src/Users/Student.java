package Users;

import Discipline.Discipline;
import Grade.Grade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс студента со свойствами login и password
 *
 * @author Zelenin
 * @version 1.0
 */

public class Student extends User implements StudentInterface, Serializable {

    /**
     * Конструктор - создание нового объекта с определенными значениями
     *
     * @param name     - name
     * @param login    - login
     * @param password - password
     * @see Student#Student(String, String, String)
     */
    public Student(String name, String login, String password) {
        this.name = name;
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

    @Override
    public double get_rating() {
        double total = 0;
        for (Discipline<Grade> discipline : list) {
            total += discipline.getGrade().getValue();
        }
        return total / list.size();
    }

    @Override
    public String get_student_grades() {
        List<String> output = new ArrayList<>();
        for (Discipline discipline : list) {
            output.add(discipline.getName() + " " + discipline.getGrade().getValue() + " " + discipline.getGrade().toString());
        }
        return output.toString();
    }
}
