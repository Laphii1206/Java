public class AUG2020_Q2 {
    public static void main(String[] args) {    
        String answer= "A"; // Example value, replace with input if needed
        double bonus= 1;    // Example value, replace with your logic
        switch (answer) {
            case "A", "B" -> bonus = bonus * 1.5;
            case "C" -> bonus = bonus * 1.2;
            case "D" -> bonus = bonus * 1.1;
            default -> bonus--;
        }

    }
}
