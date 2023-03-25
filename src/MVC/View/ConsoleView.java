package MVC.View;

import MVC.Controller.Controller;

import java.io.IOException;
import java.util.Scanner;

public class ConsoleView implements View {
    private Controller controller;

    public ConsoleView(Controller controller) {
        this.controller = controller;
    }

    @Override
    public int Listen() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    @Override
    public void Init() {
        ShowMenu();
    }

    @Override
    public void ShowMenu() {

        System.out.println("Menu:");
        System.out.println("-> 1: Student");
        System.out.println("-> 2: Teacher");
        System.out.println("-> 3: Group");
        System.out.println("-> 4: Discipline");
        System.out.println("-> 5: All");
        System.out.println("-> 0: Close app");
        System.out.print("Your choice: ");

        switch (Listen()) {
            case 0 -> {
                return;
            }
            case 1 -> ShowStudents();
            case 2 -> ShowTeachers();
            case 3 -> ShowGroups();
            case 4 -> ShowDisciplines();
            default -> ShowMenu();
        }

    }

    @Override
    public void ShowStudents() {
        System.out.println("Students Menu:");
        System.out.println("-> 1: Add Student");
        System.out.println("-> 2: Add discipline for Student");
        System.out.println("-> 3: Get rating for any Students");
        System.out.println("-> 4: Ger Student grades");
        System.out.println("-> 5: Show Students");
        System.out.println("-> 0: Back");
        System.out.print("Your choice: ");

        switch (Listen()) {
            case 0 -> {
                ShowMenu();
            }
            case 1 -> controller.setStudent();
            case 2 -> ShowTeachers();
            case 3 -> ShowGroups();
            case 4 -> ShowDisciplines();
            case 5 -> controller.getStudents();
            default -> ShowMenu();
        }
    }

    @Override
    public void ShowTeachers() {
        System.out.println("Teachers Menu:");
        System.out.println("-> 1: Add Teacher");
        System.out.println("-> 2: Add discipline for Teacher");
        System.out.println("-> 3: Add group for Teacher");
        System.out.println("-> 4: Get Students for discipline");
        System.out.println("-> 5: Show Teachers");
        System.out.println("-> 0: Back");
        System.out.print("Your choice: ");

        switch (Listen()) {
            case 0 -> {
                ShowMenu();
            }
            case 1 -> controller.setTeacher();
            case 2 -> ShowTeachers();
            case 3 -> ShowGroups();
            case 4 -> ShowDisciplines();
            case 5 -> controller.getTeachers();
            default -> ShowMenu();
        }
    }

    @Override
    public void ShowGroups() {
        System.out.println("Groups Menu:");
        System.out.println("-> 1: Add Group");
        System.out.println("-> 2: Add students for Group");
        System.out.println("-> 3: Get rating");
        System.out.println("-> 4: Show Groups");
        System.out.println("-> 0: Back");
        System.out.print("Your choice: ");

        switch (Listen()) {
            case 0 -> {
                ShowMenu();
            }
            case 1 -> controller.setGroup();
            case 2 -> ShowTeachers();
            case 3 -> ShowGroups();
            case 4 -> controller.getGroups();
            default -> ShowMenu();
        }
    }

    @Override
    public void ShowDisciplines() {
        System.out.println("Disciplines Menu:");
        System.out.println("-> 1: Add Discipline");
        System.out.println("-> 2: Show Disciplines");
        System.out.println("-> 0: Back");
        System.out.print("Your choice: ");

        switch (Listen()) {
            case 0 -> {
                ShowMenu();
            }
            case 1 -> controller.setTeacherDiscipline();
            case 2 -> controller.getDisciplines();
            default -> ShowMenu();
        }
    }
}
