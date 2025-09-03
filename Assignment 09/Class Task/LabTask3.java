import java.util.Scanner;

public class LabTask3 {
    // 3
    public static int sumDigits(int n) {
        if (n == 0) return 0;
        return n % 10 + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int x = sumDigits(n);
        System.out.println(x);
        sc.close();
    }
}
