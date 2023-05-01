import MVC.controllers.*;
import MVC.services.disciplineService.DisciplineServiceImpl;
import MVC.services.groupService.GroupServiceImpl;
import MVC.services.studentService.StudentServiceImpl;
import MVC.services.teacherService.TeacherServiceImpl;
import MVC.view.ConsoleView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DisciplineServiceImpl disciplineService = new DisciplineServiceImpl();
        GroupServiceImpl groupService = new GroupServiceImpl();
        StudentServiceImpl studentService = new StudentServiceImpl();
        TeacherServiceImpl teacherService = new TeacherServiceImpl();

        Scanner scanner = new Scanner(System.in);

        DisciplineController disciplineController = new DisciplineController(disciplineService, scanner);
        GroupController groupController = new GroupController(groupService, studentService, scanner);
        StudentController studentController = new StudentController(studentService, disciplineService, scanner);
        TeacherController teacherController = new TeacherController(teacherService, disciplineService, groupService, scanner);

        ConsoleView consoleView = new ConsoleView(disciplineController, groupController, studentController, teacherController);

        consoleView.readData();
        consoleView.init();
    }
}