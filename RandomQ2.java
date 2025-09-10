import java.util.Random;

public class RandomQ2 {
    public static void main(String[] args) {
       Random rand=new Random();
       for(int i=1; i<=5;i++){
        System.out.println(rand.nextInt(0,26) * 2);
        }
    }
}
