package MVC;

import Groups.Group;
import Students.Discipline;
import Students.ExamGrade;
import Students.OffsetGrade;
import Users.Student;
import Users.Teacher;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class FileModel implements ModelInterface {
    @Override
    public void removeAll() throws FileNotFoundException {
        System.out.println("Удалена вся информация");

        PrintWriter writer = new PrintWriter("temp.bin");
        writer.print("");
        writer.close();
    }

//    @Override
//    public ExamGrade setExamGrade(Integer value) {
//        return new ExamGrade(value);
//    }
//
//    @Override
//    public OffsetGrade setOffsetGrade(Integer value) {
//        return new OffsetGrade(value);
//    }

    @Override
    public void setDiscipline(String name, String type_grade, Integer value) {
        System.out.println("Создан объект класса Discipline(String name, String type_grade, Integer value)");

        try {
            FileOutputStream fos = new FileOutputStream("temp.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            if (type_grade.equals("exam")) {
                oos.writeObject(new Discipline(name, new ExamGrade(value)));
            } else if (type_grade.equals("offset")) {
                oos.writeObject(new Discipline(name, new OffsetGrade(value)));
            } else {
                System.out.println("WrongInputError!");
            }

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setDiscipline(String name) {
        System.out.println("Создан объект класса Discipline");

        try {
            FileOutputStream fos = new FileOutputStream("temp.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(new Discipline(name));
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getDisciplines() throws IOException {
        System.out.println("Получены все дисциплины");

        FileInputStream fis = new FileInputStream("temp.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        ArrayList<Discipline> disciplines = new ArrayList<>();

        while (true) {
            try {
                disciplines.add((Discipline) ois.readObject());
            } catch (EOFException | ClassNotFoundException e) {
                break;
            }
        }

        ois.close();

        System.out.println(disciplines);
    }

    @Override
    public void setStudent(String name, String login, String password) {
        System.out.println("Создан объект класса Student");

        try {
            FileOutputStream fos = new FileOutputStream("temp.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(new Student(name, login, password));
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void getStudents() throws IOException {
        FileInputStream fis = new FileInputStream("temp.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ;

        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            try {
                students.add((Student) ois.readObject());
            } catch (EOFException | ClassNotFoundException e) {
                break;
            }
        }

        ois.close();

        System.out.println(students);
//        try {
//            Student new_st = (Student) ois.readObject();
//            System.out.println("Student: " + new_st);
//            ois.close();
//
//        } catch (IOException | ClassNotFoundException e){
//            e.printStackTrace();
//            return;
//        }
    }

    @Override
    public void setGroup(String name) {
        System.out.println("Создан объект класса Group");

        try {
            FileOutputStream fos = new FileOutputStream("temp.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(new Group(name));
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getGroups() throws IOException {
        FileInputStream fis = new FileInputStream("temp.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ;

        ArrayList<Group> groups = new ArrayList<>();

        while (true) {
            try {
                groups.add((Group) ois.readObject());
            } catch (EOFException | ClassNotFoundException e) {
                break;
            }
        }

        ois.close();

        System.out.println(groups);
    }

    @Override
    public void setTeacher(String name, String login, String password) {
        System.out.println("Создан объект класса Teacher");

        try {
            FileOutputStream fos = new FileOutputStream("temp.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(new Teacher(name, login, password));
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getTeachers() throws IOException {
        FileInputStream fis = new FileInputStream("temp.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ;

        ArrayList<Teacher> teachers = new ArrayList<>();

        while (true) {
            try {
                teachers.add((Teacher) ois.readObject());
            } catch (EOFException | ClassNotFoundException e) {
                break;
            }
        }

        ois.close();

        System.out.println(teachers);
    }
}
