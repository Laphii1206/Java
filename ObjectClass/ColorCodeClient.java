package ObjectClass;

public class ColorCodeClient {
    public static void main(String[] args) {
ColorCode color1=new ColorCode (243, 89, 120);
ColorCode color2=new ColorCode(); //color is random
System.out.println(color1); //output is RGB(243, 89, 120)
System.out.println(color2); //output is RGB(126, 120, 244)
color1.setColor(25, 3, 194); //indexes are within the range
color2.setColor(125, 0, 388); //not within range
System.out.println(color1); //output is RGB(25, 3, 194)
    }
}
