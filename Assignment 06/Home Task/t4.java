import java.util.*;

public class t4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        int upper = 0;
        int lower = 0;
        int digit = 0;
        int special = 0;
        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (c >= 'A' && c <= 'Z') upper = 1;
                else if (c >= 'a' && c <= 'z') lower = 1;
                else if (c >= '0' && c <= '9') digit = 1;
                else if (c != ' ') special = 1;
            }
        }
        if (password.length() >= 8 && upper == 1 && lower == 1 && digit == 1 && special == 1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
