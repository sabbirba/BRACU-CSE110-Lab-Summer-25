import java.util.Scanner;

public class c5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        while (row <= n) {
            // Print spaces
            int space = n - row;
            int s = 1;
            while (s <= space) {
                System.out.print(" ");
                s = s + 1;
            }
            // Print digits
            int digit = 1;
            int totalDigits = 2 * row - 1;
            while (digit <= totalDigits) {
                System.out.print(digit);
                digit = digit + 1;
            }
            System.out.println();
            row = row + 1;
        }
    }
}