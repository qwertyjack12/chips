package Users;

import Groups.Group;
import Students.Discipline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Teacher extends User implements TeacherInterface {
    protected Map<Discipline, ArrayList<Group>> studentDictionary;

    public Teacher(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.studentDictionary = new HashMap<>();
    }

    public Map<Discipline, ArrayList<Group>> getStudentDictionary() {
        return studentDictionary;
    }

    @Override
    public void add_discipline(Discipline discipline) {
        studentDictionary.put(discipline, new ArrayList<>());
    }

    @Override
    public void add_group(Discipline discipline, Group group) {
        if (studentDictionary.containsKey(discipline)) {
            studentDictionary.get(discipline).add(group);
        }
    }

    @Override
    public void remove_discipline(Discipline discipline) {
        studentDictionary.remove(discipline);
    }

    @Override
    public void remove_group_in_discipline(Discipline discipline, Group group) {
        studentDictionary.get(discipline).remove(group);
    }

    @Override
    public String get_students_for_discipline(Discipline discipline) {
        String output = discipline.toString() + "\n";
        for (int i = 0; i < studentDictionary.get(discipline).size(); i++) {
            output += studentDictionary.get(discipline).get(i).getStudentList() + "\n";
        }

        return output;
    }

    public boolean equals(Teacher teacher) {
        return this.hashCode() == teacher.hashCode();
    }
}
