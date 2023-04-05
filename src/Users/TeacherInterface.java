package Users;

import Groups.Group;
import Discipline.Discipline;

public interface TeacherInterface {
    void add_discipline(Discipline<?> discipline);
    void add_group(Discipline<?> discipline,Group group);
    void remove_discipline(Discipline<?> discipline);
    void remove_group_in_discipline(Discipline<?> discipline, Group group);
    String get_students_for_discipline(Discipline<?> discipline);
}
