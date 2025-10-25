package ObjectQuestion;

public class Virus {

    private static int count = 0;
    String name;
    private float deathRatePercent;

    public Virus(float d) {
        deathRatePercent = d;

    }

    public void setdeathRatePercent(float d) {
        deathRatePercent = d;

    }

    public static void increaseCount() {
        count++;
    }

    public static void main(String[] args) {
        Virus newVirus = new Virus(2f);
        newVirus.name = "Covid-19";
        Virus.increaseCount();
    }

}
