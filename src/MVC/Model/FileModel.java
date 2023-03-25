package MVC.Model;

import Groups.Group;
import Discipline.Discipline;
import Grade.ExamGrade;
import Grade.OffsetGrade;
import MVC.Deserializator;
import MVC.Serializator;
import Users.Student;
import Users.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class FileModel implements ModelInterface {

    private Hashtable<Integer, Discipline> StudentDisciplineTable = null;
    private Hashtable<Integer, Discipline> TeacherDisciplineTable = null;
    private Hashtable<Integer, Student> StudentTable = null;
    private Hashtable<Integer, Group> GroupTable = null;
    private Hashtable<Integer, Teacher> TeacherTable = null;


    public FileModel() {
        this.StudentDisciplineTable = new Hashtable<>();
        this.TeacherDisciplineTable = new Hashtable<>();
        this.StudentTable = new Hashtable<>();
        this.GroupTable = new Hashtable<>();
        this.TeacherTable = new Hashtable<>();
    }

    @Override
    public void setStudentDiscipline(String name, String type_grade, Integer value) {
        System.out.println("Создан объект класса Discipline(String name, String type_grade, Integer value)");

        if (type_grade.equals("exam")) {
            StudentDisciplineTable.put(StudentDisciplineTable.size() + 1, new Discipline(name, new ExamGrade(value)));
        } else if (type_grade.equals("offset")) {
            StudentDisciplineTable.put(StudentDisciplineTable.size() + 1, new Discipline(name, new OffsetGrade(value)));
        } else {
            System.out.println("WrongInputError!");
            return;
        }

        Serializator.serialization(StudentDisciplineTable, "StudentDiscipline.bin");

    }

    @Override
    public void setTeacherDiscipline(String name) {
        System.out.println("Создан объект класса Discipline");

        TeacherDisciplineTable.put(TeacherDisciplineTable.size() + 1, new Discipline(name));

        Serializator.serialization(TeacherDisciplineTable, "TeacherDiscipline.bin");
    }

    @Override
    public void getDisciplines() {

        Deserializator.deserialization(TeacherDisciplineTable, "TeacherDiscipline.bin");

    }

    @Override
    public void setStudent(String name, String login, String password) {
        System.out.println("Создан объект класса Student");

        StudentTable.put(StudentTable.size() + 1, new Student(name, login, password));

        Serializator.serialization(StudentTable, "Student.bin");

    }

    @Override
    public void getStudents() {

        Deserializator.deserialization(StudentTable, "Student.bin");

    }

    @Override
    public void setGroup(String name) {
        System.out.println("Создан объект класса Group");

        GroupTable.put(GroupTable.size() + 1, new Group(name));

        Serializator.serialization(GroupTable, "Group.bin");

    }

    @Override
    public void getGroups() {

        Deserializator.deserialization(GroupTable, "Group.bin");

    }

    @Override
    public void setTeacher(String name, String login, String password) {
        System.out.println("Создан объект класса Teacher");

        TeacherTable.put(TeacherTable.size() + 1, new Teacher(name, login, password));

        Serializator.serialization(TeacherTable, "Teacher.bin");
    }

    @Override
    public void getTeachers() {

        Deserializator.deserialization(TeacherTable, "Teacher.bin");

    }
}
