import java.util.Scanner;

public class W4_ContinueQ {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
         int n,total=0;
            
            for (int i=1;i<=10;i++){
                System.out.print("Enter an integer 10 times: ");
                n=scanner.nextInt();
                if (n<=0){
                    continue;
                }
                total +=n;
            }
            scanner.close();
            System.out.println("Sum of positive numbers: " + total);
        }
    }   

