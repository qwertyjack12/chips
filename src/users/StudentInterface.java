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
    void appendDiscipline(Discipline<?> discipline);

    /**
     * Функция удаления дисциплины у студента
     */
    void removeDiscipline(Discipline<?> discipline);

    /**
     * Функция удаления дисциплины у студента
     */
    void removeDiscipline(int index);

    double getRating();

    String getStudentGrades();
}
