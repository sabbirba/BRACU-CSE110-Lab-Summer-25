import java.util.Scanner;

public class c8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Print increasing part
        int i = 1;
        while (i <= n) {
            System.out.print(i);
            i = i + 1;
        }
        // Print decreasing part
        int j = n - 1;
        while (j >= 1) {
            System.out.print(j);
            j = j - 1;
        }
        System.out.println();
    }
}