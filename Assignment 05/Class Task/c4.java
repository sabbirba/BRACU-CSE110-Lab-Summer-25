import java.util.Scanner;

public class c4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        while (row <= n) {
            int space = n - row;
            int s = 1;
            while (s <= space) {
                System.out.print(" ");
                s = s + 1;
            }
            int col = n - row + 1;
            while (col <= n) {
                System.out.print(col);
                col = col + 1;
            }
            System.out.println();
            row = row + 1;
        }
    }
}