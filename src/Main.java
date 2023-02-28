import Students.*;

public class Main {
    public static void main(String[] args) {
        ExamGrade examGrade = new ExamGrade(5);
        Discipline<ExamGrade> discipline = new Discipline<>("math", examGrade);

        OffsetGrade offsetGrade = new OffsetGrade(4);
        Discipline<OffsetGrade> discipline1 = new Discipline<>("informatic", offsetGrade);

        Student st = new Student("login", "password");
        st.append_discipline(discipline);
        st.append_discipline(discipline1);
        System.out.println(st.toString());

        System.out.println(st.getLogin());
        System.out.println(st.getPassword());
    }
}

