import java.util.Scanner;

public class c3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        String s = sc.nextLine();
        String rev = ""; 

        
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i); 
        }

        
        if (s.equals(rev)) {
            System.out.println("true"); 
        } else {
            System.out.println("false"); 
        }
    }
}