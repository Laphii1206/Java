import java.util.Scanner;

public class W2_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.print("Enter your name: ");
        name = input.nextLine();
        input.close();
        System.out.println("Hello, " + name);
     }
}

/*  
nextLine() -> read next line 
next () -> read next word 
nextInt()
nextDouble()
nextFloat() 
close() -> close the scanner



 */
