
public class flip {
    public static void main(String[] args) {
        int num[] = { 1,0,1,1,0,0,1,0 };

        for (int i = 0; i < num.length; i++) {
            if (num[i] == 1) {
                num[i] = 0;
            } else {
                num[i] = 1;
            }
        }

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}


