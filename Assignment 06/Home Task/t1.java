import java.util.*;

public class t1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();

    int vowels = 0;
    int consonants = 0;
        
    for (int i = 0; i < line.length(); i++) {
        char c = line.charAt(i);
        if (c >= 'A' && c <= 'Z') {
                
        c = (char) (c + ('a' - 'A'));
        }
            if (c >= 'a' && c <= 'z') {
                
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        if (vowels > 0 && consonants > 0 && vowels % 3 == 0 && consonants % 5 == 0) {
            System.out.println("Aaarr! Me Plunder!!");
        } else {
            System.out.println("Blimey! No Plunder!!");
        }
    }
}
