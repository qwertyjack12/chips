package MVC.Model;

import Students.ExamGrade;
import Students.OffsetGrade;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface ModelInterface {
    void removeAll() throws FileNotFoundException;

//    ExamGrade setExamGrade(Integer value);
//    OffsetGrade setOffsetGrade(Integer value);

    void setDiscipline(String name, String type_grade, Integer value);
    void setDiscipline(String name);
    void getDisciplines() throws IOException;

    void setStudent(String name, String login, String password);
    void getStudents() throws IOException;

    void setGroup(String name);
    void getGroups() throws IOException;

    void setTeacher(String name, String login, String password);
    void getTeachers() throws IOException;


}
