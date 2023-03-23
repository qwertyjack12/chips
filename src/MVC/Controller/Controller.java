package MVC.Controller;

import MVC.Model.FileModel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Controller {
    private FileModel fileModel;
    private Scanner scanner;

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

    public void removeAll() throws FileNotFoundException {
        fileModel.removeAll();
    }

    public void setTeacherDiscipline() {
        System.out.print("Name: ");
        String name = ListenStr();

        fileModel.setDiscipline(name);
    }

    public void setStudentDiscipline() {
        System.out.print("Name: ");
        String name = ListenStr();
        System.out.print("Type grade: ");
        String typeGrade = ListenStr();
        System.out.print("Value grade: ");
        Integer value = ListenInt();

        fileModel.setDiscipline(name, typeGrade, value);
    }

    public void getDisciplines() throws IOException {
        fileModel.getDisciplines();
    }

    public void setStudent() {
        System.out.print("Name: ");
        String name = ListenStr();
        System.out.print("Login: ");
        String login = ListenStr();
        System.out.print("Password: ");
        String password = ListenStr();

        fileModel.setStudent(name, login, password);
    }

    public void getStudents() throws IOException {
        fileModel.getStudents();
    }

    public void setGroup() {
        System.out.print("Name: ");
        String name = ListenStr();

        fileModel.setGroup(name);
    }

    public void getGroups() throws IOException {
        fileModel.getGroups();
    }

    public void setTeacher() {
        System.out.print("Name: ");
        String name = ListenStr();
        System.out.print("Login: ");
        String login = ListenStr();
        System.out.print("Password: ");
        String password = ListenStr();

        fileModel.setTeacher(name, login, password);
    }

    public void getTeachers() throws IOException {
        fileModel.getTeachers();
    }

}
