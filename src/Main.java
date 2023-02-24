import Students.Discipline;
import Students.Grade;
import Students.User;
import Students.Student;


public class Main {
    public static void main(String[] args){
        Discipline discipline = new Discipline("Russian");
        Grade grade = new Grade(5);
        User user = new User("Ivan", 27);
        Student student = new Student(user, grade, discipline);
        //
        //
        //
        Discipline discipline1 = new Discipline("English");
        Grade grade1 = new Grade(4);
        User user1 = new User("Pavel", 27);
        Student student1 = new Student(user1, grade1, discipline1);
        //
        //
        //
        System.out.println(student.toString());
        System.out.println(student.hashCode());
        System.out.println(student1.toString());
        System.out.println(student1.hashCode());
        System.out.println(student.equals(student1));
    }
}

