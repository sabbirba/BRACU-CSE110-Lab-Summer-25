import java.util.Scanner;

public class c5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        String s = sc.nextLine();

        String word = ""; 
        String rev = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') { 
                rev = word + " " + rev; 
                word = ""; 
            } else {
                word += c; 
            }
        }
        rev = word + " " + rev;
        String finalRev = "";
        for (int i = 0; i < rev.length() - 1; i++) {
            if (!(i == rev.length() - 1 && rev.charAt(i) == ' ')) {
                finalRev += rev.charAt(i);
            }
        }

        System.out.println(finalRev);
    }
}