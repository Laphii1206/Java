public class LAB3_Q4 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1;
        for (;sum<=1000;n++){
            sum += n*n;
        }
        System.out.println("The N value where exceed 1000 is: " + (n - 1));
        System.out.println("The sum is: " + sum);
    }
    }

//Write a program to calculate the first value of N where the total of 12 + 22 + 32 + ..... + N2 exceeds 1000