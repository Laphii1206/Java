package Inheritance;

public class CanCoffee extends Drink {
    private int caffeineMg;
    public CanCoffee(int caffeineMg){
        super(350,"Can","Coffee");
    }
    public boolean isHealty(){
        if (caffeineMg <=300){
            return true;
        }
        return false;
    }
    public String toString(){
        return super.toString() + "CaffeineMg: " + caffeineMg;
    }
}
