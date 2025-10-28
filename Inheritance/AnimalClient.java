package Inheritance;

public class AnimalClient{
    public static void main(String[]args){
        Animal [] animals= {new Birds(),new Fish(),new Birds()};
        for(Animal a:animals){
            a.move();
        }
    }
}