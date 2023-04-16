package MVC.services.disciplineService;

import discipline.Discipline;

public interface DisciplineService {
    void saveData();
    void readData();
    boolean checkDisciplineKey(Integer key);

    void setDiscipline(int id, String name);
    Discipline<?> getDiscipline(Integer key);
    void getDisciplines();
}
