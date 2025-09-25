package ObjectClass;
import java.util.*;
public class ColorCode {
    Random rand=new Random();
    private int r,g,b;

      public ColorCode(int r, int g, int b){
        if(r>=0 && r<=255)
        this.r=r;
        if(g>=0 && g<=255)
        this.g=g;
        if(b>=0 && b<=255)
        this.b=b;
    }
    public ColorCode(){
        r=rand.nextInt(0,256);
        g=rand.nextInt(0,256);
        b=rand.nextInt(0,256);
    }

    public String toString(){
        return "RGB("+r+","+g+","+b+")";
    }
  

    public boolean validIndex(int index){
        return (index>=0 && index<=255)
    }
      public void setColor(int r, int g, int b){
        if(validIndex(r) && validIndex(g) && validIndex(b)){
        this.r=r;
        this.g=g;
        this.b=b;
        }
    }
}

