package collegehierarchy;

public enum Rank {
    INSTRUCTOR(1),
    ASSISTANTPROFESSOR(2),
    ASSOCIATEPROFESSOR(3),
    PROFESSOR(4);

    private final int rank;

    Rank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        switch(rank) {
            case 1:
                return "Instructor";
            case 2:
                return "Assistant Professor";
            case 3:
                return "Associate Professor";
            case 4:
                return "Professor";
            default:
                return "Unknown";
        }
    }
}
