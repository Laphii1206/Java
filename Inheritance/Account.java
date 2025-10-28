package Inheritance;
public class Account {
    String accNo;
    double balance;
    double interestRate;
    public void openAcc(){
        //link to the customer account
    }

    public void closeAcc(){
        //close the customer account
    }

    public void addInterest(){
        balance += (balance * interestRate / 100);
    }
}

