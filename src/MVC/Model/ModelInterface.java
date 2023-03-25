package MVC.Model;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface ModelInterface {
    void setStudentDiscipline(String name, String type_grade, Integer value);
    void setTeacherDiscipline(String name);
    void getDisciplines() throws IOException;

    void setStudent(String name, String login, String password);
    void getStudents() throws IOException;

    void setGroup(String name);
    void getGroups() throws IOException;

    void setTeacher(String name, String login, String password);
    void getTeachers() throws IOException;


}
