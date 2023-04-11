package MVC.services.teacherService;

import MVC.Deserializator;
import MVC.Serializator;
import discipline.Discipline;
import groups.Group;
import users.Teacher;

import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;

public class TeacherServiceImpl implements TeacherService{

    private Hashtable<Integer, Teacher> TeacherTable;
    private final String fileName = "src\\usedFiles\\Teacher.bin";

    public TeacherServiceImpl(){
        this.readData();
    }

    private void checkFIle(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        fileReader.close();
    }

    @Override
    public void saveData() {
        Serializator.serialization(TeacherTable, fileName);
    }

    @Override
    public void readData() {
        try {
            this.checkFIle(fileName);
            this.TeacherTable = Deserializator.getHashtable(fileName);
        } catch (IOException e) {
            this.TeacherTable = new Hashtable<>();
        }
    }

    @Override
    public void setTeacher(String name, String login, String password) {
        TeacherTable.put(TeacherTable.size() + 1, new Teacher(name, login, password));
    }

    @Override
    public void removeTeacher() {
        if (TeacherTable.size() != 0){
            TeacherTable.remove(TeacherTable.size());
        }
    }

    @Override
    public void addTeacherDiscipline(Discipline<?> discipline, Integer keyTeacher) {
        TeacherTable.get(keyTeacher).add_discipline(discipline);
    }

    @Override
    public void addTeacherGroup(Integer keyTeacher, Discipline<?> discipline, Group group) {
        TeacherTable.get(keyTeacher).add_group(discipline, group);
    }

    @Override
    public void getTeachersDisciplines() {
        for (int i = 1; i <= TeacherTable.size() ; i++) {
            var teacher = TeacherTable.get(i);
            System.out.println("Teacher: " + teacher.getName());
            for (var x: teacher.getStudentDictionary().entrySet()){
                System.out.println(x.getKey());
                System.out.println(x.getValue());
            };
        }
    }

    @Override
    public void getTeachers() {
        System.out.println(TeacherTable);
    }

}
