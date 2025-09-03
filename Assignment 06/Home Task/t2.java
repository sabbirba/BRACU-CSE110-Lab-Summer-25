import java.util.*;

public class t2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String result = "";
        
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            boolean found = false;
            for (int j = 0; j < s2.length(); j++) {
                if (c == s2.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result += c;
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            boolean found = false;
            for (int j = 0; j < s1.length(); j++) {
                if (c == s1.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result += c;
            }
        }
        String upper = "";
        for (int i = 0; i < result.length(); i++) {
            char c = result.charAt(i);
            if (c >= 'a' && c <= 'z') {
                upper += (char)(c - 'a' + 'A');
            } else {
                upper += c;
            }
        }
        System.out.println(upper);
    }
}
