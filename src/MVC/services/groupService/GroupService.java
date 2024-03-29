package MVC.services.groupService;

import groups.Group;
import users.Student;

public interface GroupService {

    void saveData();
    void readData();
    boolean checkGroupKey(Integer key);

    void setGroup(int id, String name);
    Group getGroup(Integer key);
    void removeGroup(Integer key);
    void removeStudentInGroup(Integer keyGroup, Student Student);
    void addStudent(Student student, Integer keyGroup);
    void getGroupsRating();
    void getGroups();

}
