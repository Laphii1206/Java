import java.util.Scanner;
public class W3_IFELSE {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        double hour,num,charge;
        System.out.print("Enter parking hour: ");
        num = scanner.nextDouble();
        hour = Math.ceil(num);
        if (hour < 2){
            charge = 2;
        } else if (hour >= 3 && hour <= 9){
            charge = hour;

        } else{
        charge = 10; }
        System.out.println("The total charge is $" + charge);

    }    }