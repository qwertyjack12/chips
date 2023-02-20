public class Main {
    public static void main(String[] args) {
        Students st = new Students("Джин", 5, "математика");
//        Students st2 = new Students("Джон", 3, "математика");

        st.get_rating();
        st.get_id();
        System.out.println(st.toString());

        st.setUser("ching chong");
        st.setGrade(2);
        st.setDiscipline("China language");

        System.out.println(st.toString());
    }
}

