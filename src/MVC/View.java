package MVC;

import java.io.IOException;

public interface View {
    /* https://www.youtube.com/watch?v=5ApLlzCgHRI */

    int Listen();
    void Init() throws IOException;
    void ShowMenu() throws IOException;
    void ShowAll() throws IOException;
    void ShowStudents() throws IOException;
    void ShowTeachers() throws IOException;
    void ShowGroups() throws IOException;
    void ShowDisciplines() throws IOException;
}
