import java.util.Scanner;

public class c7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= row) {
                if (row == 1 || row == 2 || row == n) {
                    // First, second, or last row: print all digits
                    System.out.print(col);
                } else if (col == 1 || col == row) {
                    // First or last digit in the row
                    System.out.print(col);
                } else {
                    // Hollow part: print space
                    System.out.print(" ");
                }
                col = col + 1;
            }
            System.out.println();
            row = row + 1;
        }
    }
}