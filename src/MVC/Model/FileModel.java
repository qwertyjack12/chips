package MVC.Model;

import Groups.Group;
import Discipline.Discipline;
import Grade.ExamGrade;
import Grade.OffsetGrade;
import MVC.Deserializator;
import MVC.Serializator;
import Users.Student;
import Users.Teacher;

import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;

public class FileModel implements ModelInterface {

    private Hashtable<Integer, Discipline<?>> DisciplineTable;
    private Hashtable<Integer, Student> StudentTable;
    private Hashtable<Integer, Group> GroupTable;
    private Hashtable<Integer, Teacher> TeacherTable;

    private final String DisciplineFile = "src\\Files\\Discipline.bin";
    private final String StudentFile = "src\\Files\\Student.bin";
    private final String GroupFile = "src\\Files\\Group.bin";
    private final String TeacherFile = "src\\Files\\Teacher.bin";


    public FileModel() {
        this.readData();
    }

    private void checkFIle(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        fileReader.close();
    }

    @Override
    public void saveChanges() {
        Serializator.serialization(DisciplineTable, DisciplineFile);
        Serializator.serialization(StudentTable, StudentFile);
        Serializator.serialization(GroupTable, GroupFile);
        Serializator.serialization(TeacherTable, TeacherFile);
    }

    @Override
    public void readData() {
        try {
            this.checkFIle(DisciplineFile);
            this.DisciplineTable = Deserializator.getHashtable(DisciplineFile);
        } catch (IOException e) {
            this.DisciplineTable = new Hashtable<>();
        }

        try {
            this.checkFIle(StudentFile);
            this.StudentTable = Deserializator.getHashtable(StudentFile);
        } catch (IOException e) {
            this.StudentTable = new Hashtable<>();
        }

        try {
            this.checkFIle(GroupFile);
            this.GroupTable = Deserializator.getHashtable(GroupFile);
        } catch (IOException e) {
            this.GroupTable = new Hashtable<>();
        }

        try {
            this.checkFIle(TeacherFile);
            this.TeacherTable = Deserializator.getHashtable(TeacherFile);
        } catch (IOException e) {
            this.TeacherTable = new Hashtable<>();
        }
    }

    /*----------------------------DISCIPLINE----------------------------------*/
    @Override
    public void setDiscipline(String name) {
        System.out.println("Создан объект класса Discipline");

        DisciplineTable.put(DisciplineTable.size() + 1, new Discipline(name));
    }

    @Override
    public void getDisciplines() {

        System.out.println(DisciplineTable);

    }

    /*----------------------------STUDENTS----------------------------------*/

    @Override
    public void setStudent(String name, String login, String password) {
        System.out.println("Создан объект класса Student");

        StudentTable.put(StudentTable.size() + 1, new Student(name, login, password));
    }

    @Override
    public void addDiscipline(Integer DisciplineKey, String type_grade, Integer value, Integer key) {
        if ((key <= 0) | (key > StudentTable.size())) {
            System.out.println("!!WRONG STUDENT NUMBER!!");
            return;
        } else if ((DisciplineKey <= 0) | (DisciplineKey > DisciplineTable.size())) {
            System.out.println("!!WRONG DISCIPLINE NUMBER!!");
        }

        if (type_grade.equals("exam")) {
            StudentTable.get(key).append_discipline(new Discipline(DisciplineTable.get(DisciplineKey).getName(), new ExamGrade(value)));
        } else if (type_grade.equals("offset")) {
            StudentTable.get(key).append_discipline(new Discipline(DisciplineTable.get(DisciplineKey).getName(), new OffsetGrade(value)));
        } else {
            System.out.println("!!WRONG TYPE GRADE!!");
            return;
        }
    }

    @Override
    public void getStudentsRating() {
        for (int i = 1; i <= StudentTable.size(); i++) {
            System.out.println(i + ": " + StudentTable.get(i).get_rating());
        }
    }

    @Override
    public void getStudentGrades(Integer key) {
        if ((key <= 0) | (key > StudentTable.size())) {
            System.out.println("!!WRONG STUDENT NUMBER!!");
            return;
        }

        System.out.println(StudentTable.get(key).get_student_grades());
    }

    @Override
    public void removeStudent() {
        if (StudentTable.size() != 0) {
            StudentTable.remove(StudentTable.size());
        }
    }

    @Override
    public void getStudents() {

        System.out.println(StudentTable);

    }

    /*----------------------------GROUP----------------------------------*/

    @Override
    public void setGroup(String name) {
        GroupTable.put(GroupTable.size() + 1, new Group(name));
    }

    @Override
    public void removeGroup() {
        if (GroupTable.size() != 0) {
            GroupTable.remove(GroupTable.size());
        }
    }

    @Override
    public void removeStudentInGroup(Integer keyGroup, Integer keyStudent) {
        if ((keyGroup <= 0) | (keyGroup > GroupTable.size())) {
            System.out.println("!!WRONG GROUP NUMBER!!");
            return;
        }

        if ((keyStudent <= 0) | (keyStudent >= GroupTable.get(keyGroup).getStudentList().size())) {
            System.out.println("!!WRONG STUDENT NUMBER!!");
            return;
        }

        GroupTable.get(keyGroup).remove_student(keyStudent - 1);
    }

    @Override
    public void addStudent(Integer keyGroup, Integer keyStudent) {
        if ((keyGroup <= 0) | (keyGroup > StudentTable.size())) {
            System.out.println("!!WRONG GROUP NUMBER!!");
            return;
        } else if ((keyStudent <= 0) | (keyStudent > GroupTable.size())) {
            System.out.println("!!WRONG STUDENT NUMBER!!");
            return;
        }

        GroupTable.get(keyGroup).add_student(StudentTable.get(keyStudent));
    }

    @Override
    public void getGroupsRating() {
        for (int i = 1; i <= GroupTable.size(); i++) {
            System.out.println(GroupTable.get(i).get_rating());
        }
    }

    @Override
    public void getGroups() {

        System.out.println(GroupTable);

    }

    /*----------------------------TEACHER----------------------------------*/

    @Override
    public void setTeacher(String name, String login, String password) {
        System.out.println("Создан объект класса Teacher");

        TeacherTable.put(TeacherTable.size() + 1, new Teacher(name, login, password));
    }

    @Override
    public void removeTeacher() {
        if (TeacherTable.size() != 0){
            TeacherTable.remove(TeacherTable.size());
        }
    }

    @Override
    public void addTeacherDiscipline(Integer keyDiscipline, Integer keyTeacher) {

        if ((keyDiscipline <= 0) | (keyDiscipline > DisciplineTable.size())) {
            System.out.println("!!WRONG DISCIPLINE NUMBER!!");
            return;
        } else if ((keyTeacher <= 0) | (keyTeacher > TeacherTable.size())) {
            System.out.println("!!WRONG TEACHER NUMBER!!");
            return;
        }

        TeacherTable.get(keyTeacher).add_discipline(DisciplineTable.get(keyDiscipline));
    }

    @Override
    public void addTeacherGroup(Integer keyTeacher, Integer keyDiscipline, Integer keyGroup) {

        if ((keyTeacher <= 0) | (keyTeacher > TeacherTable.size())) {
            System.out.println("!!WRONG TEACHER NUMBER!!");
            return;
        } else if ((keyDiscipline <= 0) | (keyDiscipline > DisciplineTable.size())) {
            System.out.println("!!WRONG DISCIPLINE NUMBER!!");
            return;
        } else if ((keyGroup <= 0) | (keyGroup > GroupTable.size())) {
            System.out.println("!!WRONG GROUP NUMBER!!");
            return;
        }

        TeacherTable.get(keyTeacher).add_group(DisciplineTable.get(keyDiscipline), GroupTable.get(keyGroup));
    }

    @Override
    public void getTeachersDisciplines() {
        for (int i = 1; i <= TeacherTable.size() ; i++) {
            var teacher = TeacherTable.get(i);
            System.out.println("Teacher: " + teacher.getName());
            for (var x: teacher.getStudentDictionary().entrySet()){
                System.out.println(x.getKey());
                System.out.println(x.getValue());
            };
        }
    }

    @Override
    public void getTeachers() {

        System.out.println(TeacherTable);

    }
}
