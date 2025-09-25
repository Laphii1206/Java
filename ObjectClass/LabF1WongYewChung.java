package ObjectClass;

import java.util.Scanner;
public class LabF1WongYewChung {

public static void printItem(){
        System.out.println("Item \t\t\t Price(RM)");
        System.out.println("1.Coca-cola \t\t 1.80");
        System.out.println("2.Mineral water\t\t 1.00");
        System.out.println("3.Soybean \t\t 2.00");
        System.out.println("4.Nescafe Coffee\t 3.50");
        System.out.println("5.Potato Chips \t\t 3.80");
        System.out.println("6.Snickers \t\t 4.20");
        System.out.println("7.Twisties \t\t 0.80");
}

public static void showAffordableItem(double balance){
    System.out.println("You have RM " + balance);
    System.out.println("Affordable items:");
    System.out.println("Item \t\t\t Price(RM)");
    if (balance >= 1.80) System.out.println("1. Coca-cola \t\t 1.80");
    if (balance >= 1.00) System.out.println("2. Mineral water\t\t 1.00");
    if (balance >= 2.00) System.out.println("3. Soybean \t\t 2.00");
    if (balance >= 3.50) System.out.println("4. Nescafe Coffee\t 3.50");
    if (balance >= 3.80) System.out.println("5. Potato Chips \t\t 3.80");
    if (balance >= 4.20) System.out.println("6. Snickers \t\t 4.20");
    if (balance >= 0.80) System.out.println("7. Twisties \t\t 0.80");
}

public static void printReceipt(){
        System.out.println("Thank you. Please come again.");
    }

    public static double purchaseItem(double balance){
        return balance;
    }

    public static void main(String[] args) {
        int selection,counter=0;
        double balance,total,amount;
        Scanner scanner = new Scanner(System.in);
        printItem();
        System.out.print("Please Insert Your Balance: ");
        do{
        System.out.println("Invalid Balance Please Try Again");
        System.out.print("Please Insert Your Balance: ");
        balance=scanner.nextInt();
        }while(balance<=0);
       showAffordableItem(balance);
       balance = purchaseItem(balance);
        }
        
    }


