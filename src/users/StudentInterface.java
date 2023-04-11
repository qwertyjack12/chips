package users;

import discipline.Discipline;

/**
 * Интерфейс для работы с классом Student
 *
 * @author Zelenin
 * @version 1.0
 */

public interface StudentInterface {
    /**
     * Функция добавляющая студенту дисциплину
     */
    void append_discipline(Discipline<?> discipline);

    /**
     * Функция удаления дисциплины у студента
     */
    void remove_discipline(Discipline<?> discipline);

    /**
     * Функция удаления дисциплины у студента
     */
    void remove_discipline(int index);

    double get_rating();

    String get_student_grades();
}
