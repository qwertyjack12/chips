package Students;

public class Discipline extends AbstractDiscipline{
    public Discipline(String discipline) {
        this.discipline = discipline;
    }

    @Override
    public String toString(){
        return "Дисциплина: " + discipline;
    }
}


abstract class AbstractDiscipline {
    public String discipline;

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }
    public String getDiscipline(){
        return this.discipline;
    }

    public abstract String toString();
}