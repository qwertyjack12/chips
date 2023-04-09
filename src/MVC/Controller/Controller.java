package MVC.Controller;

import MVC.Model.FileModel;

import java.util.Scanner;

public class Controller {
    private final FileModel fileModel;
    private final Scanner scanner;

    public Controller(FileModel fileModel, Scanner scanner) {
        this.fileModel = fileModel;
        this.scanner = scanner;
    }

    public int ListenInt() {
        return scanner.nextInt();
    }

    public String ListenStr() {
        return scanner.next();
    }
    public void saveChanges(){
        fileModel.saveChanges();
    }

    /*----------------------------DISCIPLINE----------------------------------*/

    public void setDiscipline() {
        System.out.print("Name: ");
        String name = ListenStr();

        fileModel.setDiscipline(name);
    }

    public void getDisciplines() {
        fileModel.getDisciplines();
    }

    /*----------------------------STUDENT----------------------------------*/

    public void setStudent() {
        System.out.print("Name: ");
        String name = ListenStr();
        System.out.print("Login: ");
        String login = ListenStr();
        System.out.print("Password: ");
        String password = ListenStr();

        fileModel.setStudent(name, login, password);
    }

    public void addDiscipline() {

        this.getDisciplines();
        System.out.print("Number discipline: ");
        Integer DisciplineKey = ListenInt();

        System.out.print("Type grade (exam/offset): ");
        String typeGrade = ListenStr();
        System.out.print("Value grade: ");
        Integer value = ListenInt();

        this.getStudents();

        System.out.print("Number student: ");
        Integer key = ListenInt();

        fileModel.addDiscipline(DisciplineKey, typeGrade, value, key);
    }

    public void getStudentsRating() {
        this.getStudents();
        fileModel.getStudentsRating();
    }

    public void getStudentGrades() {
        this.getStudents();

        System.out.print("Number student: ");
        Integer key = ListenInt();

        fileModel.getStudentGrades(key);
    }

    public void getStudents() {
        fileModel.getStudents();
    }

    public void removeStudent() {
        fileModel.removeStudent();
    }

    /*----------------------------GROUP----------------------------------*/

    public void setGroup() {
        System.out.print("Name: ");
        String name = ListenStr();

        fileModel.setGroup(name);
    }

    public void removeGroup() {
        fileModel.removeGroup();
    }

    public void removeStudentInGroup() {
        this.getGroups();
        System.out.print("Number group: ");
        Integer keyGroup = ListenInt();

        this.getStudents();
        System.out.print("Number student: ");
        Integer keyStudent = ListenInt();

        fileModel.removeStudentInGroup(keyGroup, keyStudent);
    }

    public void addStudent() {
        this.getGroups();
        System.out.print("Number group: ");
        Integer keyGroup = ListenInt();

        this.getStudents();
        System.out.print("Number student: ");
        Integer keyStudent = ListenInt();

        fileModel.addStudent(keyGroup, keyStudent);
    }

    public void getGroupsRating() {
        this.getGroups();
        fileModel.getGroupsRating();
    }

    public void getGroups() {
        fileModel.getGroups();
    }

    /*----------------------------TEACHER----------------------------------*/

    public void setTeacher() {
        System.out.print("Name: ");
        String name = ListenStr();
        System.out.print("Login: ");
        String login = ListenStr();
        System.out.print("Password: ");
        String password = ListenStr();

        fileModel.setTeacher(name, login, password);
    }

    public void removeTeacher() {
        fileModel.removeTeacher();
    }

    public void addTeacherDiscipline() {
        this.getTeachers();
        System.out.print("Number: ");
        Integer keyTeacher = ListenInt();

        this.getDisciplines();
        System.out.print("Number: ");
        Integer keyDiscipline = ListenInt();

        fileModel.addTeacherDiscipline(keyDiscipline, keyTeacher);
    }

    public void addTeacherGroup() {
        this.getTeachers();
        System.out.print("Number: ");
        Integer keyTeacher = ListenInt();

        this.getDisciplines();
        System.out.print("Number: ");
        Integer keyDiscipline = ListenInt();

        this.getGroups();
        System.out.print("Number: ");
        Integer keyGroup = ListenInt();

        fileModel.addTeacherGroup(keyTeacher, keyDiscipline, keyGroup);
    }

    public void getTeachersDisciplines() {
        fileModel.getTeachersDisciplines();
    }

    public void getTeachers() {
        fileModel.getTeachers();
    }

}
