package groups;

import users.Student;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Group implements GroupInterface, Serializable {
    protected String name;
    protected List<Student> studentList;

    public Group(){
        this.name = "Excuse me Group?";
    }

    public Group(String name) {
        this.name = name;
        this.studentList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public void add_student(Student student) {
        studentList.add(student);
    }

    @Override
    public void remove_student(Student student) {
        studentList.remove(student);
    }

    @Override
    public void remove_student(int index) {
        studentList.remove(index);
    }

    @Override
    public double get_rating() {
        double total = 0;
        for (Student student : studentList) {
            total += student.get_rating();
        }
        return total / studentList.size();
    }

    @Override
    public String toString() {
        return "Group: " + this.getName();
    }
}
