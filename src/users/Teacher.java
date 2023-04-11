package users;

import groups.Group;
import discipline.Discipline;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Teacher extends User implements TeacherInterface, Serializable {
    protected Map<Discipline<?>, ArrayList<Group>> studentDictionary;

    public Teacher(){
        this.name = "Excuse me Teacher?";
    }

    public Teacher(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.studentDictionary = new HashMap<>();
    }

    public Map<Discipline<?>, ArrayList<Group>> getStudentDictionary() {
        return studentDictionary;
    }

    @Override
    public void add_discipline(Discipline<?> discipline) {
        studentDictionary.put(discipline, new ArrayList<>());
    }

    @Override
    public void add_group(Discipline<?> discipline, Group group) {
        if (studentDictionary.containsKey(discipline)) {
            studentDictionary.get(discipline).add(group);
        }
    }

    @Override
    public void remove_discipline(Discipline<?> discipline) {
        studentDictionary.remove(discipline);
    }

    @Override
    public void remove_group_in_discipline(Discipline<?> discipline, Group group) {
        studentDictionary.get(discipline).remove(group);
    }

    @Override
    public String get_students_for_discipline(Discipline<?> discipline) {
        StringBuilder output = new StringBuilder(discipline.toString() + "\n");
        for (int i = 0; i < studentDictionary.get(discipline).size(); i++) {
            output.append(studentDictionary.get(discipline).get(i).getStudentList()).append("\n");
        }
        return output.toString();
    }
}
