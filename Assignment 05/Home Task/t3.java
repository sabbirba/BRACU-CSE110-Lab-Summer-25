import java.util.Scanner;

public class t3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            
            for (int s = 1; s <= n - row; s++) {
                System.out.print(" ");
            }

            
            int totalDigits = 2 * row - 1;
            for (int col = 1; col <= totalDigits; col++) {
                if (row == 1 || row == n) {
                    
                    System.out.print(col);
                } else if (col == 1 || col == totalDigits) {
                    
                    System.out.print(col);
                } else {
                    
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}