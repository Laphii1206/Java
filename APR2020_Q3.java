import java.util.Scanner;

public class APR2020_Q3 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int total=0,num,counter=0;
double average;

do {
System.out.print("Enter a number (0 or negative to exit): ");
num = scanner.nextInt();
if (num >0){
    total += num;
    counter++;
} else {
    System.out.println("No input for calculation ");
    break;
}
} while (num > 0);
average = (double)total / counter;
scanner.close();
    System.out.println("The total is: " + total);
    System.out.println("Average is " + average);

        }
        }
