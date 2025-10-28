package Inheritance;

public class Circle {

    private double radius;
    public Circle(){
        radius = 2.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
    public String toString(){
        return "Circle:" + area();
    }
}
