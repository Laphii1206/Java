package Inheritance;

public class SubscribedUsrAccount extends UserAccount {

    private double subscriptionFees;

    public SubscribedUsrAccount(double subscriptionFees, String name, String email) {
        super(name, email);
        this.subscriptionFees = subscriptionFees;

    }

    public double points (){
 return subscriptionFees*10;
}
}
