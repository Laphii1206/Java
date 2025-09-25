package ObjectClass;

public class Coursework {
    String title;
    private int percentage;
    public Coursework(String title, int percentage){
        title="No title";
        percentage=0;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

}
