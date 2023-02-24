package Students;

public class Discipline extends AbstractDiscipline{
    Discipline(String discipline) {
        this.discipline = discipline;
    }
}


abstract class AbstractDiscipline {
    String discipline;

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }
}