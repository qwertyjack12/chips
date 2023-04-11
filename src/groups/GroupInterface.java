package groups;

import users.Student;

public interface GroupInterface {
    void add_student(Student student);
    void remove_student(Student student);
    void remove_student(int index);
    double get_rating();
}
