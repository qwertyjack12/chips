package Students;

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
    public void append_discipline(Discipline discipline);

    /**
     * Функция удаления дисциплины у студента
     */
    public void remove_discipline(Discipline discipline);

    /**
     * Функция удаления дисциплины у студента
     */
    public void remove_discipline(int index);
}
