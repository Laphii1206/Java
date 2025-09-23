package ObjectClass;

public class Pen {
    private String type;
    private double thickness;
    private  String color;

    public pen(String type, double thickness, String color) {
        this.type = type;
        this.thickness = thickness;
        this.color = color;
    }

    public pen(String type,double thickness) {
        this.type = type;
        this.color = "black";
    }
    public pen(String type) {
        this.type = type;
        this.thickness = 0.5;
        this.color = "black";
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setThickness(double thickness) {
        this.thickness = thickness;
    }
    public double getThickness() {
        return thickness;
    }
}
