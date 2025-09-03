import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            
            for (int s = 1; s <= n - row; s++) {
                System.out.print(" ");
            }

            
            for (int col = n - row + 1; col <= n; col++) {
                if (row == 1 || row == 2 || row == n) {
                    
                    System.out.print(col);
                } else if (col == n - row + 1 || col == n) {
                    
                    System.out.print(col);
                } else {
                    
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}