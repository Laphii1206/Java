import java.util.Scanner;
public class AUG2022_Q2 {

    public static void main(String[] args) {
       char letter;
       int number;
       String color ="";
       Scanner scanner = new Scanner(System.in);
         System.out.print("Enter a letter ('A' to 'D'): ");
            letter = scanner.next().charAt(0);
         System.out.print("Enter a number(1 to 5): ");
            number = scanner.nextInt();
        if (letter == 'A' || letter == 'C'){
            if(number % 2 == 1){
                color =  "White";}
                   else color = "Black";}
                 else if (letter == 'B' || letter == 'D'){
                if(number % 2 == 1){
                color =  "Black";}
                   else color = "White";}

                   System.out.println("The background color is " + color);
                 }
            

        }
        

    
