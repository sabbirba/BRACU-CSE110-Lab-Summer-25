import java.util.Scanner;

public class t6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = n; row >= 1; row--) {
            
            for (int s = 1; s <= n - row; s++) {
                System.out.print(" ");
            }

            
            for (int inc = 1; inc <= row; inc++) {
                System.out.print(inc);
            }

            
            for (int dec = row - 1; dec >= 1; dec--) {
                System.out.print(dec);
            }

            System.out.println();
        }
    }
}