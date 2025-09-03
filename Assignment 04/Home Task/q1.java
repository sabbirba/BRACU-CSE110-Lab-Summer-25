import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) { // loop N times to read pairs of integers
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int sum = 0;
            int count = 0;
            int num = X;
            while (count < Y) { // find the sum of the first Y odd numbers starting from X
                if (num % 2 != 0) { // check if the number is odd
                    sum += num; // add the odd number to the sum
                    count++; // increment count for each odd number found
                }
                num++; // move to the next number
            }
            System.out.println(sum); // output the sum of the first Y odd numbers
        }
        sc.close();
    }
}