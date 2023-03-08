import Groups.Group;
import Students.*;
import Users.Student;
import Users.Teacher;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("PAVEL","plohoyparen", "1703");

        Discipline d_t = new Discipline<>("informatics");
        Discipline d_t1 = new Discipline<>("programming");
        Discipline d_t2 = new Discipline<>("math");


        ExamGrade eg5 = new ExamGrade(5);
        ExamGrade eg4 = new ExamGrade(4);
        ExamGrade eg3 = new ExamGrade(3);
        ExamGrade eg2 = new ExamGrade(2);
        ExamGrade eg1 = new ExamGrade(1);

        OffsetGrade og5 = new OffsetGrade(5);
        OffsetGrade og2 = new OffsetGrade(2);


        Discipline d_math_5 = new Discipline<>("math", eg5);
        Discipline d_math_4 = new Discipline<>("math", eg4);
        Discipline d_math_3 = new Discipline<>("math", eg3);
        Discipline d_math_2 = new Discipline<>("math", eg2);
        Discipline d_math_1 = new Discipline<>("math", eg1);

        Discipline d_programming_5 = new Discipline<>("programming", eg5);
        Discipline d_programming_4 = new Discipline<>("programming", eg4);
        Discipline d_programming_3 = new Discipline<>("programming", eg3);
        Discipline d_programming_2 = new Discipline<>("programming", eg2);
        Discipline d_programming_1 = new Discipline<>("programming", eg1);

        Discipline d_informatics_offset = new Discipline<>("informatics", og5);
        Discipline d_informatics_not_offset = new Discipline<>("informatics", og2);


        Student st1 = new Student("name1","st1", "st1");
        st1.append_discipline(d_math_5);
        st1.append_discipline(d_programming_5);
        st1.append_discipline(d_informatics_offset);

        Student st2 = new Student("name2","st2", "st2");
        st2.append_discipline(d_math_4);
        st2.append_discipline(d_programming_5);
        st2.append_discipline(d_informatics_offset);

        Student st3 = new Student("name3","st3", "st3");
        st3.append_discipline(d_math_5);
        st3.append_discipline(d_programming_4);
        st3.append_discipline(d_informatics_offset);

        Student st4 = new Student("name4","st4", "st4");
        st4.append_discipline(d_math_4);
        st4.append_discipline(d_programming_4);
        st4.append_discipline(d_informatics_offset);

        Student st5 = new Student("name5","st5", "st5");
        st5.append_discipline(d_math_3);
        st5.append_discipline(d_programming_3);
        st5.append_discipline(d_informatics_not_offset);

        Student st6 = new Student("name6","st6", "st6");
        st6.append_discipline(d_math_5);
        st6.append_discipline(d_programming_5);
        st6.append_discipline(d_informatics_offset);

        Student st7 = new Student("name7","st7", "st7");
        st7.append_discipline(d_math_4);
        st7.append_discipline(d_programming_5);
        st7.append_discipline(d_informatics_offset);

        Student st8 = new Student("name8","st8", "st8");
        st8.append_discipline(d_math_5);
        st8.append_discipline(d_programming_4);
        st8.append_discipline(d_informatics_offset);

        Student st9 = new Student("name9","st9", "st9");
        st9.append_discipline(d_math_4);
        st9.append_discipline(d_programming_4);
        st9.append_discipline(d_informatics_offset);

        Student st10 = new Student("name10","st10", "st10");
        st10.append_discipline(d_math_3);
        st10.append_discipline(d_programming_2);
        st10.append_discipline(d_informatics_not_offset);


        Group group = new Group("SPA");
        group.add_student(st1);
        group.add_student(st2);
        group.add_student(st3);
        group.add_student(st4);
        group.add_student(st5);

        Group group1 = new Group("PRI");
        group1.add_student(st6);
        group1.add_student(st7);
        group1.add_student(st8);
        group1.add_student(st9);
        group1.add_student(st10);

        System.out.println(group.toString());
        System.out.println(group.get_rating());
        System.out.println("---------------------");
        System.out.println(group1.toString());
        System.out.println(group1.get_rating());

        teacher.add_discipline(d_t);
        teacher.add_discipline(d_t1);
        teacher.add_discipline(d_t2);

        System.out.println(teacher.getStudentDictionary());

        teacher.add_group(d_t1, group);
        teacher.add_group(d_t1, group1);
        teacher.add_group(d_t, group);
        teacher.add_group(d_t2, group1);

        System.out.println(teacher.getStudentDictionary());

        System.out.println(teacher.getStudentDictionary());

        System.out.println("=========================================");

        System.out.println(teacher.get_students_for_discipline(d_t1));
    }
}