package MVC.controllers;

import java.util.Scanner;

public abstract class Controller {
    private final Scanner scanner;

    public Controller(Scanner scanner){
        this.scanner = scanner;
    }

    public int listenInt() {
        return scanner.nextInt();
    }

    public String listenStr() {
        return scanner.next();
    }

    public abstract void saveChanges();
}
