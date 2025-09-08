import java.util.Scanner;
public class W4_BREAKQ {
    public static void main(String[] args) {
    int total =0,num;
    Scanner scanner = new Scanner(System.in);
    for (int i=1;i<=10 && total <=100;i++){
            System.out.println("Enter a number");
            num = scanner.nextInt();
            total += num;
        }
    System.out.println("Total is " + total);
    scanner.close();}
}