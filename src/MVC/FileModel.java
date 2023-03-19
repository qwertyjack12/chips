package MVC;

public class FileModel implements ModelInterface {

    @Override
    public void getAll() {
        System.out.println("Получена вся информация");
    }

    @Override
    public void setExamGrade(Integer value) {
        System.out.println("Создан объект класса ExamGrade");
    }

    @Override
    public void setOffsetGrade(Integer value) {
        System.out.println("Создан объект класса OffsetGrade");
    }

    @Override
    public void setDiscipline(String name, String type_grade, Integer value) {
        System.out.println("Создан объект класса Discipline(String name, String type_grade, Integer value)");
    }

    @Override
    public void setDiscipline(String name) {
        System.out.println("Создан объект класса Discipline(String name)");
    }

    @Override
    public void getDisciplines() {
        System.out.println("Получены все дисциплины");
    }

    @Override
    public void setStudent(String name, String login, String password) {
        System.out.println("Создан объект класса Student");
    }

    @Override
    public void getStudents() {
        System.out.println("Получены все группы");
    }

    @Override
    public void setGroup(String name) {
        System.out.println("Создан объект класса Group");
    }

    @Override
    public void getGroups() {
        System.out.println("Получены все группы");
    }

    @Override
    public void setTeacher(String name, String login, String password) {
        System.out.println("Создан объект класса Teacher");
    }

    @Override
    public void getTeachers() {
        System.out.println("Получены все учителя");
    }
}
