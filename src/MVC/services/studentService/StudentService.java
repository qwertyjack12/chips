package MVC.services.studentService;

import java.util.Hashtable;

public interface StudentService {

    void saveData();
    void readData();

    void setStudent(String name, String login, String password);
    void addDiscipline(String DisciplineName, Integer DisciplineKey, String type_grade, Integer value, Integer key);
    void getStudentsRating();
    void getStudentGrades(Integer key);
    void getStudents();
    void removeStudent();

}
