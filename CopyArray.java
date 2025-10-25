import java.util.*;

public class CopyArray {
    public static void main(String[] args) {
        int [] x={1,2,3,4,5};
        int [] y= new int[x.length];
        for(int i=0;i<x.length;i++){
            y[i]=x[i];
            System.out.print(y[i]+" ");
        }
        System.out.println(Arrays.toString(y));
        System.out.println(Arrays.toString(x));
    }
}

