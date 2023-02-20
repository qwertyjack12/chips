public class Grade extends AbstractGrade {
    Grade(Integer grade) {
        this.grade = grade;
    }
}

abstract class AbstractGrade {
    Integer grade;

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}