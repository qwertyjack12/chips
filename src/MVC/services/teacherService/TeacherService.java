package MVC.services.teacherService;

import discipline.Discipline;
import groups.Group;
import users.Teacher;

public interface TeacherService {

    void saveData();
    void readData();
    boolean checkTeacherKey(Integer key);

    void setTeacher(int id, String name, String login, String password);
    Teacher getTeacher(Integer key);
    void removeTeacher(Integer key);
    void addTeacherDiscipline(Discipline<?> discipline, Integer keyTeacher);
    void addTeacherGroup(Integer keyTeacher, Discipline<?> discipline, Group group);
    void getTeachersDisciplines();
    void getTeachers();

}
