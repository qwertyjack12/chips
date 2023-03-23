import Groups.Group;
import MVC.*;
import Students.*;
import Users.Student;
import Users.Teacher;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileModel fileModel = new FileModel();
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller(fileModel, scanner);
        ConsoleView consoleView = new ConsoleView(controller);

        consoleView.Init();

//        ExamGrade eg5 = new ExamGrade(5);
//        OffsetGrade og5 = new OffsetGrade(5);
//        Discipline d_math_5 = new Discipline<>("math", eg5);
//        Discipline d_programming_5 = new Discipline<>("programming", eg5);
//        Discipline d_informatics_offset = new Discipline<>("informatics", og5);
//
//        Student st1 = new Student("name1", "st1", "st1");
//        Student st2 = new Student("name", "login", "password");
//        st1.append_discipline(d_math_5);
//        st1.append_discipline(d_programming_5);
//        st1.append_discipline(d_informatics_offset);
//
//        /*Serializable*/
//        FileOutputStream fos = new FileOutputStream("temp.txt");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(st1);
//        oos.close();
//
//
//        FileInputStream fis = new FileInputStream("temp.txt");
//        ObjectInputStream ois = new ObjectInputStream(fis);
//        Student new_st1 = (Student) ois.readObject();
//        ois.close();
//
//        FileOutputStream _fos = new FileOutputStream("temp.txt");
//        ObjectOutputStream _oos = new ObjectOutputStream(_fos);
//        _oos.writeObject(st2);
//        _oos.close();
//
//
//        FileInputStream _fis = new FileInputStream("temp.txt");
//        ObjectInputStream _ois = new ObjectInputStream(_fis);
//        Student new_st2 = (Student) _ois.readObject();
//        _ois.close();
//
//
//
//        System.out.println(new_st1);
//        System.out.println(new_st2);
//        System.out.println(st1);
//        System.out.println(st2);
//        System.out.println(new_st1.get_rating());
//        System.out.println(st1.get_rating());
//        /*Serializable*/
//        Group group = new Group("SPA");
//        FileOutputStream _fos = new FileOutputStream("temp.bin");
//        ObjectOutputStream _oos = new ObjectOutputStream(_fos);
//        _oos.writeObject(group);
//        _oos.close();
//
//        FileInputStream _fis = new FileInputStream("temp.bin");
//        ObjectInputStream _ois = new ObjectInputStream(_fis);
//        Group new_group = (Group) _ois.readObject();
//        _ois.close();
//
//        System.out.println(new_group);
//        System.out.println(group);

    }
}