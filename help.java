import java.util.Random;

public class help {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();
        int Sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100) + 1;
        }

        System.out.print("Array Numbers: ");
        for (int i =0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                Sum += numbers[i];
                System.out.print(numbers[i] + " ");
            }
        }

        System.out.println("\nSum of even numbers: " + Sum);
    }
}