import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double interestRate,amount;
        int term,age;
        amount= scanner.nextDouble();
        term= scanner.nextInt();
        age= scanner.nextInt();


if (age < 50) {
    if (amount < 50000) {
        if (term == 6) {
            interestRate = 0.035;
        } else if (term == 12) {
            interestRate = 0.036;
        } else {
            interestRate = 0.0; 
        }
    } else { 
        if (term == 6) {
            interestRate = 0.0365;
        } else if (term == 12) {
            interestRate = 0.037;
        } else {
            interestRate = 0.0; 
        }
    }
} else { 
    if (amount < 50000) {
        interestRate = 0.0378;
    } else {
        interestRate = 0.0388;
    }
}

System.out.println("Interest Rate is : " + interestRate*100 + "%");
System.out.println("Your Total is RM" + amount + amount * interestRate);

    }
}
