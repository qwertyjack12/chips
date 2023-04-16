package groups;

import users.Student;

public interface GroupInterface {
    void addStudent(Student student);
    void removeStudent(Student student);
    void removeStudent(int index);
    double getRating();
}
