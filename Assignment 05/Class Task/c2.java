import java.util.Scanner;

public class c2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int r = 1;
        while (r <= rows) {
            int c = 1;
            while (c <= cols) {
                System.out.print(c);
                c = c + 1;
            }
            System.out.println();
            r = r + 1;
        }
    }
}