import java.util.*;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Original array:");
        for (int i = 0; i < N; i++) {
            System.out.print(a[i]);
            if (i != N - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        for (int i = 0; i < N; i++) {
            if (a[i] > 0) {
                a[i] = 1;
            } else if (a[i] < 0) {
                a[i] = 0;
            }
        }

        System.out.println("After modifying:");
        for (int i = 0; i < N; i++) {
            System.out.print(a[i]);
            if (i != N - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        sc.close();
    }
}
