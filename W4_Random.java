import java.util.Random;

public class W4_Random {
    public static void main(String[] args) {
        Random rand=new Random();
        for(int i=1; i<=5;i++){
            System.out.println(rand.nextInt(10)*2); //0-99
        }
    }
}

//how to design overloading correctly
//parameter must not be the same