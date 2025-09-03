import java.util.*;

public class task5 {
    public static void main(String[] args) {
        int[] marks = {85, 90, 75, 44, 99};
        String[] names = {"Bob", "Alice", "Max", "Marry", "Rosy"};

        int n = marks.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {
                    int t = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = t;

                    String s = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = s;
                }
            }
        }

        System.out.println("Sorted Array:");
        for (int v : marks) {
            System.out.print(v + " ");
        }
        System.out.println();

        for (String s : names) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
