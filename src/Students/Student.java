package Students;

import java.util.List;

public class Student extends AbstractStudent implements StudentInterface {
    public Student(User user, Grade grade, Discipline discipline) {
        this.user = user;
        this.grade = grade;
        this.discipline = discipline;
        this.array_discipline = new List<Discipline>;
        this.array_grade = new List<Grade>;
        add_discipline(discipline);
        add_grade(grade);
    }

    public double get_rating() {
        double total = 0.;
        for (Grade value : array_grade) {
            total += value.getGrade();
        }
        return total / array_grade.size();
    }


    public void add_discipline(Discipline discipline) {
        array_discipline.add(discipline);
    }

    public void add_grade(Grade grade) {
        array_grade.add(grade);
    }

    public void remove_discipline(int index) {
        array_discipline.remove(index);
        array_grade.remove(index);
    }

    @Override
    public String toString() {
        return "Студент " + user.getFio() + " мега хорош";
    }

    @Override
    public int hashCode() {
        return user.hashCode() + grade.hashCode() + discipline.hashCode();
    }

    @Override
    public boolean equals(Student student) {
        return student.hashCode() == this.hashCode();
    }
}

abstract class AbstractStudent {
    User user;
    Grade grade;
    Discipline discipline;
    List<Discipline> array_discipline;
    List<Grade> array_grade;

    public void setUser(User user) {
        this.user = user;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public User getUser() {
        return this.user;
    }

    public Grade getGrade() {
        return this.grade;
    }

    public Discipline getDiscipline() {
        return this.discipline;
    }

    public abstract boolean equals(Student student);

    public abstract int hashCode();

    public abstract String toString();
}
