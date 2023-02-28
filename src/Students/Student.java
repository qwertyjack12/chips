package Students;

import java.util.ArrayList;
import java.util.List;

public class Student extends User implements StudentInterface {

    public Student(String login, String password) {
        this.login = login;
        this.password = password;
        this.list = new ArrayList<>();
    }

    @Override
    public void append_discipline(Discipline discipline) {
        list.add(discipline);
    }

    @Override
    public void remove_discipline(Discipline discipline) {
        list.remove(discipline);
    }

    @Override
    public void remove_discipline(int index) {
        list.remove(index);
    }

    @Override
    public boolean equals(Student student) {
        return this.hashCode() == student.hashCode();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((login == null) ? 0 : login.hashCode()) + ((password == null) ? 0 : password.hashCode());
        return result;
    }

    @Override
    public String toString() {
        List<String> output = new ArrayList<>();
        for (Discipline discipline : list) {
            output.add(discipline.getName() + " " + discipline.getGrade().getValue() + " " + discipline.getGrade().toString());
        }
        return output.toString();
    }
}
