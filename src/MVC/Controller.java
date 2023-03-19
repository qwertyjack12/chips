package MVC;

public class Controller {
    ModelInterface model = new FileModel();
    View view = new ConsoleView();

    public void execute() {

        view.ShowMenu();

    }
}
