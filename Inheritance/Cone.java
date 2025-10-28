package Inheritance;

public class Cone extends Circle {

    double height;
    public Cone(){
        height = 1;
    }

    public Cone(double radius){
        super.setRadius(radius);
    }

    public Cone(double radius, double height) {
        super.setRadius(radius);
        this.height = height;
    }

    public double area() {
        return super.area() + Math.PI * super.getRadius() * Math.sqrt(super.getRadius()*super.getRadius() + height * height);
    }

    @Override
    public String toString() {
        return super.toString() + height + area();
    }

}
