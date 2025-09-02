import java.util.Scanner;

public class W3_Q2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int z,x,c;
            
    System.out.print("Enter value Z: ");
    z= scanner.nextInt();
    
    System.out.print("Enter value X: ");
    x= scanner.nextInt();
                
    System.out.print("Enter value C: ");
    c= scanner.nextInt();
    
    if (z >= x && z <= c || z <= x && z >=c){
        System.out.println("Value " + z + " is the middle number");
    }
    else if (x >= z && x <= c || x <= z && x >= c){
        System.out.println("Value " + x + " is the middle number");
    }else       
        System.out.println("Value " + c + " is the middle number");

    }
}

APR2024 SECTION A1 C