package Students;

interface StudentInterface {
    double get_rating();
    void add_discipline(Discipline discipline);
    void add_grade(Grade grade);
    void remove_discipline(int index);
}
