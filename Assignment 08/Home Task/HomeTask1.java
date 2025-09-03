import java.util.Scanner;

public class HomeTask1 {

    // 1A
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 1B
    public static boolean isPerfect(int n) {
        if (n <= 1) {
            return false;
        }
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                int other = n / i;
                if (other != i) {
                    sum += other;
                }
            }
        }
        return sum == n;
    }

    // 1C
    public static int special_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i) || isPerfect(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(isPerfect(33));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = special_sum(n);
        System.out.println(result);
        sc.close();
    }

}
