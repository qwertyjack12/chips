public class Students extends Student {
    //Конструктор класса
    Students(String user, int grade, String discipline) {
        this.user = user;
        this.grade = grade;
        this.discipline = discipline;
    }

    public void get_rating() {
        System.out.println("Рейтинг " + user + " в своей группе: ...");
    }

    public void get_id() {
        System.out.println("id пользователя " + user + ": " + hashCode());
    }

    @Override
    public String toString() {
        return "Студент " + user + " с оценкой " + grade + " по дисциплине " + discipline;
    }
}

abstract class Student {
    String user;
    int grade;
    String discipline;

    public abstract void get_rating();

    public abstract void get_id();

    public void setUser(String user) {
        this.user = user;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }
}
