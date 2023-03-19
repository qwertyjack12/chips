package MVC;

public interface ModelInterface {
    void getAll();

    void setExamGrade(Integer value);
    void setOffsetGrade(Integer value);

    void setDiscipline(String name, String type_grade, Integer value);
    void setDiscipline(String name);
    void getDisciplines();

    void setStudent(String name, String login, String password);
    void getStudents();

    void setGroup(String name);
    void getGroups();

    void setTeacher(String name, String login, String password);
    void getTeachers();


}
