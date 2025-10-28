package Inheritance;

public class BottleCocaCola extends Drink {
    private int sugarGram;

    public BottleCocaCola(int sugarGram){
        super(500,"Bottle","Coca Cola");
        this.sugarGram = sugarGram;
    }

    public boolean isHealty(){
        if (sugarGram <=25){
            return true;
        }
        return false;
    }
    public String toString(){
        return super.toString() + "sugarGram: " + sugarGram;
    }
}
