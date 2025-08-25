import java.util.Scanner;

public class W2_ScannerNext {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        String word;
        System.out.print("Enter a word: ");
        word = scanner.next();
        System.out.println("The entered word is " + word);
    }
}
