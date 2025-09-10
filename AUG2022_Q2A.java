public class AUG2022_Q2A {
    public static void main(String[] args) {
        String answer= "A";
        double bonus= 1;
        switch (answer) {
            case "A", "B" -> bonus = bonus * 1.5;
            case "C" -> bonus = bonus * 1.2;
            case "D" -> bonus = bonus * 1.1;
            default -> bonus--;
        }

    }
}