package MVC.services.groupService;

import users.Student;

public interface GroupService {

    void saveData();
    void readData();

    void setGroup(String name);
    void removeGroup();
    void removeStudentInGroup(Integer keyGroup, Integer keyStudent);
    void addStudent(Student student, Integer keyGroup);
    void getGroupsRating();
    void getGroups();

}
