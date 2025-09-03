import java.util.Scanner;

public class t4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        
        for (int row = 1; row <= n; row++) {
            
            for (int s = 1; s <= n - row; s++) {
                System.out.print(" ");
            }

            
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (col == 1 || col == 2 * row - 1) {
                    System.out.print(col);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        
        for (int row = n - 1; row >= 1; row--) {
            
            for (int s = 1; s <= n - row; s++) {
                System.out.print(" ");
            }

            
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (col == 1 || col == 2 * row - 1) {
                    System.out.print(col);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}