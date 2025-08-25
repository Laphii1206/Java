public class W1_OperatorPlus {
    public static void main(String[] args) {
    int x = 5;
    double y = 4.6;
    char z = '5';
    String s = "B";
    System.out.println(s+x); // Adding int and double
    System.out.println(s+z); // Adding char and String
    System.out.println(x+y); // Adding int and double
    System.out.println(x+z); // Adding char and int 
    System.out.println(x+x+s+x+x); 
    // 5 + 5 = 10
    // 10 + "B" = "10B"
    // "10B" + 5 = "10B5"
    // "10B5" + 5 = "10B55"
    // hence the output is 10B55
    }
}
