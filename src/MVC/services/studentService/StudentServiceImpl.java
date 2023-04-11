package MVC.services.studentService;

import MVC.Deserializator;
import MVC.Serializator;
import discipline.Discipline;
import grade.ExamGrade;
import grade.OffsetGrade;
import users.Student;

import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;

public class StudentServiceImpl implements StudentService{

    private Hashtable<Integer, Student> StudentTable;
    private final String fileName = "src\\usedFiles\\Student.bin";

    public StudentServiceImpl(){
        this.readData();
    }

    private void checkFIle(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        fileReader.close();
    }

    @Override
    public void saveData() {
        Serializator.serialization(StudentTable, fileName);
    }

    @Override
    public void readData() {
        try {
            this.checkFIle(fileName);
            this.StudentTable = Deserializator.getHashtable(fileName);
        } catch (IOException e) {
            this.StudentTable = new Hashtable<>();
        }
    }

    @Override
    public void setStudent(String name, String login, String password) {
        StudentTable.put(StudentTable.size() + 1, new Student(name, login, password));
    }

    @Override
    public void addDiscipline(String DisciplineName, Integer DisciplineKey, String type_grade, Integer value, Integer key) {
        if (type_grade.equals("exam")) {
            StudentTable.get(key).append_discipline(new Discipline<>(DisciplineName, new ExamGrade(value)));
        } else if (type_grade.equals("offset")) {
            StudentTable.get(key).append_discipline(new Discipline<>(DisciplineName, new OffsetGrade(value)));
        }
    }

    @Override
    public void getStudentsRating() {
        for (int i = 1; i <= StudentTable.size(); i++) {
            System.out.println(i + ": " + StudentTable.get(i).get_rating());
        }
    }

    @Override
    public void getStudentGrades(Integer key) {
        System.out.println(StudentTable.get(key).get_student_grades());
    }

    @Override
    public void removeStudent() {
        if (StudentTable.size() != 0) {
            StudentTable.remove(StudentTable.size());
        }
    }

    @Override
    public void getStudents() {

        System.out.println(StudentTable);

    }

}
