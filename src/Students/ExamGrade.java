package Students;

public class ExamGrade extends Grade{
    public ExamGrade(Integer value){
        this.value = value;
    }

    @Override
    public String toString(){
        return switch (value) {
            case 1, 2 -> "bad";
            case 3 -> "it's okay";
            case 4 -> "good";
            case 5 -> "excellent";
            default -> "what?";
        };
    }
}
