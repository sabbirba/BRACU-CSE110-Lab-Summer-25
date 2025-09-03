import java.util.Scanner;

public class c6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int r = 1;
        while (r <= rows) {
            int c = 1;
            while (c <= cols) {
                if (r == 1 || r == rows) {
                    // First or last row: print all digits
                    System.out.print(c);
                } else if (c == 1 || c == cols) {
                    // First or last column: print digit
                    System.out.print(c);
                } else {
                    // Middle: print space
                    System.out.print(" ");
                }
                c = c + 1;
            }
            System.out.println();
            r = r + 1;
        }
    }
}