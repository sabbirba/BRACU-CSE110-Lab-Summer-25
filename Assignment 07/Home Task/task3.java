import java.util.*;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        double[] a = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            a[i] = sc.nextDouble();
        }

        int maxIdx = 0;
        int minIdx = 0;
        double sum = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] > a[maxIdx]) {
                maxIdx = i;
            }
            if (a[i] < a[minIdx]) {
                minIdx = i;
            }
            sum += a[i];
        }

        System.out.println("Maximum element " + a[maxIdx] + " found at index " + maxIdx);
        System.out.println("Minimum element " + a[minIdx] + " found at index " + minIdx);
        System.out.println("Summation: " + sum);

        double avg;
        if (n > 0) {
            avg = sum / n;
        } else {
            avg = 0.0;
        }
        System.out.printf("Average: %.2f%n", avg);
        sc.close();
    }
}
