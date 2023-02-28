package Students;

public class OffsetGrade extends Grade {
    public OffsetGrade(Integer value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return switch (value) {
            case 1, 2 -> "not offset";
            case 3, 4, 5 -> "offset";
            default -> "what?";
        };
    }
}
