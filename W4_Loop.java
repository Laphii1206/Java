import java.util.Scanner;
public class W4_Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number I will print all factor for you: ");
        int x = scanner.nextInt();
        scanner.close();
        for(int i=1;i<=x;i++){
            if(x%i==0){
                System.out.println(i);
            }
        }
    }
}

