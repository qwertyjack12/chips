package MVC.services;

public interface ModelInterface {
    void saveChanges();
    void readData();

    void setDiscipline(String name);
    void getDisciplines();

    void setStudent(String name, String login, String password);
    void addDiscipline(Integer DisciplineKey, String type_grade, Integer value, Integer key);
    void getStudentsRating();
    void getStudentGrades(Integer key);
    void getStudents();
    void removeStudent();


    void setGroup(String name);
    void removeGroup();
    void removeStudentInGroup(Integer keyGroup, Integer keyStudent);
    void addStudent(Integer keyStudent, Integer keyGroup);
    void getGroupsRating();
    void getGroups();

    void setTeacher(String name, String login, String password);
    void removeTeacher();
    void addTeacherDiscipline(Integer keyDiscipline, Integer keyTeacher);
    void addTeacherGroup(Integer keyTeacher, Integer keyDiscipline, Integer keyGroup);
    void getTeachersDisciplines();
    void getTeachers();
}
