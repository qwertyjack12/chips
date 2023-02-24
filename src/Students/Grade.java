package Students;

public class Grade extends AbstractGrade {
    public Grade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Оценка: " + grade;
    }
}

abstract class AbstractGrade {
    Integer grade;

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getGrade() {
        return this.grade;
    }

    public abstract String toString();
}