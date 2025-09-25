import java.util.Scanner;
public class LabF1WongYewChung {
        static Scanner scanner = new Scanner(System.in);
        static double balance=0,total=0,amount=0;
        static String item;
        static String receipt="";

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
    System.out.println("\nYou Currently have RM " + balance + " left to spend");
    System.out.println("Affordable items Are:");
    System.out.println("Item \t\t\t Price(RM)");
    if (balance >= 1.80) System.out.println("1. Coca-cola  \t\t 1.80");
    if (balance >= 1.00) System.out.println("2. Mineral water \t\t 1.00");
    if (balance >= 2.00) System.out.println("3. Soybean  \t\t 2.00");
    if (balance >= 3.50) System.out.println("4. Nescafe Coffee\t 3.50");
    if (balance >= 3.80) System.out.println("5. Potato Chips \t\t 3.80");
    if (balance >= 4.20) System.out.println("6. Snickers \t\t 4.20");
    if (balance >= 0.80) System.out.println("7. Twisties \t\t 0.80");
}

public static void purchaseItem(){
    double price = 0.0;
    int selection;
    do{
        showAffordableItem(balance);
        System.out.print("Please Select Item to Purchase (0 to exit): ");
        selection = scanner.nextInt();
        switch(selection){
            case 1: item = "Coca-cola"; price = 1.80; break;
            case 2: item = "Mineral water"; price = 1.00; break;
            case 3: item = "Soybean"; price = 2.00; break;
            case 4: item = "Nescafe Coffee"; price = 3.50; break;
            case 5: item = "Potato Chips"; price = 3.80; break;
            case 6: item = "Snickers"; price = 4.20; break;
            case 7: item = "Twisties"; price = 0.80; break;
            case 0: break;
            default: System.out.println("Invalid Selection");price = -1;break;
        }
     
        if (price > balance){
            System.out.println("You have selected item outside of affordable range please try again");
        
        }else if (price == -1){
            //do nothing 
        } else if (balance > price && price !=0){
            total += price;
            balance -= price;
            receipt += item + "\t\t" + price + "\n";
            System.out.println("You have purchased " + item + " for RM " + price);
        }
    } while(balance >= 0.79 && selection != 0);
}

public static void printReceipt(){
    if(total ==0){
        System.out.println("No items purchased");
    } else {
System.out.println("\nReceipt");
        System.out.println("-------------------------");
        System.out.println(receipt);
        System.out.println("-------------------------");
        System.out.println("Total: RM" + total);
        System.out.println("==========================");
        System.out.println("Amount inserted: RM" + amount);
        System.out.printf("Balance: RM%.2f\n", balance);}
}

    public static void main(String[] args) {
        printItem();
        System.out.print("Please Insert Your Balance: RM");
        amount=scanner.nextDouble();
        while(amount<=0.8){
        System.out.println("Invalid Balance or less than 0.80 for minimum purchase Please Try Again");
        System.out.print("Please Insert Your Balance: RM");
        amount=scanner.nextDouble();
        }
        balance = amount;
        purchaseItem();
        printReceipt();
    }
}

/*
 display item and their prices
 read amount of money by user
 show affordable item within amount
 read selection
 deduct from balance
 ask user if want to purchase more
 method purchase + receipt
 validation
 */
