import java.util.*;

public class t3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = "";
        int alt = 0; 
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                if (alt % 2 == 0) {
                    if (c >= 'A' && c <= 'Z') {
                        result += (char)(c - 'A' + 'a');
                    } else {
                        result += c;
                    }
                } else {
                    if (c >= 'a' && c <= 'z') {
                        result += (char)(c - 'a' + 'A');
                    } else {
                        result += c;
                    }
                }
                alt++;
            } else {
                result += c;
            }
        }
        System.out.println(result);
    }
}
