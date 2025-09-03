import java.util.Scanner;

public class LabTask1 {
    // 1A
    public static void oneToN(int current, int n) {
        if (current > n) return;
        System.out.print(current + " ");
        oneToN(current + 1, n);
    }

    // 1B
    public static void nToOne(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        nToOne(n - 1);
    }

    // 1C
    public static int recursiveSum(int current, int n) {
        if (current > n) return 0;
        return current + recursiveSum(current + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N for oneToN: ");
        int n1 = sc.nextInt();
        oneToN(1, n1);
        System.out.println();

        System.out.print("Enter N for nToOne: ");
        int n2 = sc.nextInt();
        nToOne(n2);
        System.out.println();

        System.out.print("Enter N for recursiveSum: ");
        int n3 = sc.nextInt();
        System.out.println(recursiveSum(1, n3));

        sc.close();
    }
}
