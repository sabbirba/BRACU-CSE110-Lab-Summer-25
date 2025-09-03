import java.util.Scanner;

public class t7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Top part
        int row = n;
        while (row >= 1) {
            int space = n - row;
            int s = 1;
            while (s <= space) {
                System.out.print(" ");
                s = s + 1;
            }
            int digit = 1;
            while (digit <= row) {
                System.out.print(digit);
                digit = digit + 1;
            }
            System.out.println();
            if (row == 1) break;
            row = row - 2;
        }

        // Bottom part
        row = 3;
        while (row <= n) {
            int space = n - row;
            int s = 1;
            while (s <= space) {
                System.out.print(" ");
                s = s + 1;
            }
            int digit = 1;
            while (digit <= row) {
                System.out.print(digit);
                digit = digit + 1;
            }
            System.out.println();