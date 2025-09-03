import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        
        for (int row = 1; row <= n; row++) {
            
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            
            for (int digit = 1; digit <= 2 * row - 1; digit++) {
                System.out.print(digit);
            }
            System.out.println();
        }

        
        for (int row = n - 1; row >= 1; row--) {
            
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            
            for (int digit = 1; digit <= 2 * row - 1; digit++) {
                System.out.print(digit);
            }
            System.out.println();
        }
    }
}