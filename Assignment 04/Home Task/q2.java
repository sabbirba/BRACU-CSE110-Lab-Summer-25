import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();

        for (int i = 1; i <= width; i++) { // loop for each row
            for (int j = 1; j <= length; j++) { // loop for each column
                System.out.print(j);
                if (j < length) {
                    System.out.print(" "); 
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
