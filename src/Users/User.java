package Users;

import Students.Discipline;
import Students.Grade;

import java.util.List;

/**
 * Абстрактный класс пользователя со свойствами login и password
 *
 * @author Zelenin
 * @version 1.0
 */

public abstract class User {
    /**
     * Поле логина
     */
    protected String login;

    /**
     * Поле пароля
     */
    protected String password;
    /**
     * Поле имени
     */
    protected String name;
    /**
     * Поле списка дисциплин
     */
    protected List<Discipline<Grade>> list;

    /**
     * Процедура определения значения оценки {@link User#login}
     *
     * @param login - значение оценки
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Функция получения значения поля {@link User#login}
     *
     * @return позвращает login
     */
    public String getLogin() {
        return login;
    }

    /**
     * Процедура определения значения оценки {@link User#password}
     *
     * @param password - значение password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Функция получения значения поля {@link User#password}
     *
     * @return позвращает password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Абстрактная функция hashCode
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((login == null) ? 0 : login.hashCode()) + ((password == null) ? 0 : password.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.login;
    }
}
