package Inheritance;

public class DrinkClient {

    public static void main(String[] args) {

        Drink[] drink = {
            new CanCoffee(150),
            new CanCoffee(350),
            new BottleCocaCola(40),
            new BottleCocaCola(10)
        };

        for (int i = 0; i < drink.length; i++) {
            System.out.println(drink[i].toString() + " " + drink[i].isHealty());
        }
    }
}
