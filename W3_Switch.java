public class W3_Switch {
    public static void main(String[] args) {
    int sel=3;
        switch(sel){
            case 1 -> System.out.println("You selected 1");
            case 2 -> System.out.println("You selected 2");
            case 3 -> System.out.println("You selected 3");
            default -> System.out.println("Invalid selection");
        }
        System.out.println(
        switch(sel){
            case 1 -> "You selected 1";
            case 2 -> "You selected 2";
            case 3 -> "You selected 3";
            default -> "Invalid selection";
        }
        );
}
}