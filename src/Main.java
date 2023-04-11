import MVC.controller.Controller;
import MVC.services.FileModel;
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
        Controller controller = new Controller(disciplineService, groupService, studentService, teacherService, scanner);
        ConsoleView consoleView = new ConsoleView(controller);

        consoleView.Init();
    }
}