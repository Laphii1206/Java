import java.util.*;
public class Array {

    public static int showLargest(int []array){
        Arrays.sort(array);
        return array[array.length-1];
    }
    public static int showSmallest(int[]array){
        Arrays.sort(array);
        return array[0];
    }
    public static int[] getArray(int []array){
        Arrays.sort(array);
        return array;
    }
    public static void main(String[] args) {
        // int score[] = new int[5];
        int scores[] = {3,5,1,9,6};
        int largest = showLargest(scores);
        int smallest = showSmallest(scores);
        Scanner scanner = new Scanner(System.in);
    /*     for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();

    } */
  /*  for (int i = 0; i < scores.length; i++) {
        scores[i]*=2;
    }*/

    for (int i = 0; i < scores.length; i++) {
        if (scores[i] % 2 != 0) {
            scores[i] *= 3;
        } else {
            scores[i] *= 2;
        }
    }
    System.out.println(Arrays.toString(scores));
    Arrays.sort(scores);
    System.out.println(Arrays.toString(scores));
    System.out.println(largest + " " + smallest);
}
}