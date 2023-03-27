import MVC.Controller.Controller;
import MVC.Model.FileModel;
import MVC.View.ConsoleView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileModel fileModel = new FileModel();
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller(fileModel, scanner);
        ConsoleView consoleView = new ConsoleView(controller);

        System.out.println(Integer.class);

        consoleView.Init();
    }
}