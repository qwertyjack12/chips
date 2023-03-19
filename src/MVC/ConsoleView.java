package MVC;

public class ConsoleView implements View{


    @Override
    public void ShowMenu() {

        System.out.println("Menu:");
        System.out.println("-> 1: Student");
        System.out.println("-> 2: Teacher");
        System.out.println("-> 3: Group");
        System.out.println("-> 4: Discipline");
        System.out.println("-> 5: All");
        System.out.println("-> 0: Close app");

    }

    @Override
    public void ShowAll() {
        System.out.println("All Menu:");
        System.out.println("-> 1: Show All");
        System.out.println("-> 2: Remove All");
        System.out.println("-> 0: Back");
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
    }

    @Override
    public void ShowGroups() {
        System.out.println("Groups Menu:");
        System.out.println("-> 1: Add Group");
        System.out.println("-> 2: Add students for Group");
        System.out.println("-> 3: Get rating");
        System.out.println("-> 4: Show Groups");
        System.out.println("-> 0: Back");
    }

    @Override
    public void ShowDisciplines() {
        System.out.println("Disciplines Menu:");
        System.out.println("-> 1: Add Discipline");
        System.out.println("-> 2: Show Disciplines");
        System.out.println("-> 0: Back");
    }
}
