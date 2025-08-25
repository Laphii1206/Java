import java.util.Scanner;

public class W2_ScannerInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ////////////
        int num;
        System.out.print("Enter your desire number: ");
        num = input.nextInt();
        System.out.println("The square of " + num + " is " + num * num);
        ////////////
        float money;
        System.out.println("How much is your pocket money per week?");
        money = input.nextFloat();
        System.out.println("Your pocket money in one month is RM" + money*4);
        input.close();
        ////////////
    }
}
