import java.util.*;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Enter a number: ");
            a[i] = sc.nextInt();
        }

        int key = sc.nextInt();
        int idx = -1;

        for (int i = 0; i < N; i++) {
            if (a[i] == key) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println(key + " is at index " + idx);
        }

        sc.close();
    }
}
