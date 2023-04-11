package MVC.services.teacherService;

import discipline.Discipline;
import groups.Group;

public interface TeacherService {

    void saveData();
    void readData();

    void setTeacher(String name, String login, String password);
    void removeTeacher();
    void addTeacherDiscipline(Discipline<?> discipline, Integer keyTeacher);
    void addTeacherGroup(Integer keyTeacher, Discipline<?> discipline, Group group);
    void getTeachersDisciplines();
    void getTeachers();

}
