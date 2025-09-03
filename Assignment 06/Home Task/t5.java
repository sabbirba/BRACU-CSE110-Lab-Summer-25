import java.util.*;

public class t5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String password = sc.nextLine();
        int n = name.length();
        int m = password.length();
        int found = 0;
        for (int i = 0; i <= m - n; i++) {
            int j;
            for (j = 0; j < n; j++) {
                if (password.charAt(i + j) != name.charAt(j)) {
                    break;
                }
            }
            if (j == n) {
                found = 1;
                break;
            }
        }
        if (found == 1) {
            System.out.println("Invalid");
        } else {
            System.out.println("Valid");
        }
    }
}
