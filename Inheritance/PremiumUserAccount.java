package Inheritance;

public class PremiumUserAccount extends UserAccount {

    private double debitAmount;

    public PremiumUserAccount(double da, String name, String email) {
        super(name, email);
        this.debitAmount = da;
    }
//overriding method

    public double points() {
        return debitAmount * 100;
    }

}
