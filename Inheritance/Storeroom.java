package Inheritance;

public class Storeroom extends Room {
private int shape;

public Storeroom(int width, int length, int height,int type){
    super("Store room",width,length,height);
    this.shape = type;

}
public float volume(){
if (shape == 1) return width * length * height;
else return (width * length * height * 0.5f);

}

}
