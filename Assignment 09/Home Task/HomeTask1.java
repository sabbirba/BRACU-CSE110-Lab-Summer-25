import java.util.Scanner;

public class HomeTask1 {
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int x = factorial(n);
        System.out.println(x);
        sc.close();
    }
}
