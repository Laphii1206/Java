package Inheritance;

public class SavingClient {

    public static void main(String[] args) {
        Savings s = new Savings();
        Account a; // a parents can point to a child object 
        s.accNo = "s-123";
        s.balance = 1000;
        s.interestRate = 5.0;
        System.out.println("Initial Balance: " + s.balance);
        s.addInterest();
        a=s;
        System.out.println("Balance: " + a.balance);
        System.out.println("Balance after interest: " + s.balance);
        FD f = new FD();
        f.accNo = "f-456";
        f.balance = 2000;
        f.interestRate = 6.0;
        f.tenure = 12; // 12 months
        System.out.println("Initial FD Balance: " + f.balance);
        f.addInterest();
        System.out.println("Balance after FD interest: " + f.balance);
        a = f;
        System.out.println("Balance: " + a.balance);
    }
}
