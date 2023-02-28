package Students;

public class Discipline <T extends Grade> {

    protected String name;
    protected T grade;

    public Discipline(String name, T grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getGrade() {
        return grade;
    }

    public void setGrade(T grade) {
        this.grade = grade;
    }

    @Override
    public String toString(){
        return "Discipline: " + this.grade.toString();
    }

}
