import java.util.*;

public class arrayswap {

Random rand = new Random();

public static int[] swapEven(int[] x,int[]y,int[]z){

    Random rand = new Random();

    for (int i=0;i<x.length;i=i+2){
        x[i] = rand.nextInt(25) + 1;
    }
    for (int i=1;i<y.length;i=i+2){
        y[i] = rand.nextInt(26,51) ;
    }

     for(int i=0;i<x.length ;i++){
            z[i]=x[i];
        }
for (int i = 0; i < y.length; i++) {
    z[i + x.length] = y[i];
}
for(int i=0;i<z.length;i++){
                System.out.print(z[i] + " ");
        }

    return z;
}

    public static void main(String[] args) {
int []x = {2,51,7,8,2,2,4};
int []y = {20,10,40,20,30};
int []z = new int[x.length + y.length];

z = swapEven(x,y,z);

   

    }
}

