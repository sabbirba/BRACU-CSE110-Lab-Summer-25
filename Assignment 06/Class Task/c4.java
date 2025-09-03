import java.util.Scanner;

public class c4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println();
        String s = sc.nextLine();

        
        System.out.println();
        char split = sc.nextLine().charAt(0);

        String part = ""; 

        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == split) {
                System.out.println(part); 
                part = ""; 
            } else {
                part += c; 
            }
        }

        
        System.out.println(part);
    }
}