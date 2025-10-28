package Inheritance;

public class FD extends Account {
    int tenure;
    public void addInterest(){
        System.out.println("FD Interest Calculation");
        balance += (balance * interestRate / 12) * tenure;
    }
    public void addParentInterest(){
        addInterest();
        super.addInterest();
    }
}
