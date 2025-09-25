package ObjectClass;

public class SubjectClient {
    public static void main(String[] args) {
        Coursework cw=new Coursework("OOP in Java",10);
        Subject s1=new Subject("OOP",cw);
        s1.getC1().title="Project";
        s1.getC1().setPercentage(20);
    }

}