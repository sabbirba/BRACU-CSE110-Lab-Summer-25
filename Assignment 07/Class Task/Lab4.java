import java.util.*;

public class Lab4 {
    public static void main(String[] args){
        int[] arr = {23,100,23,56,100};
        System.out.println("Input array:");
        for (int v: arr) System.out.print(v + " ");
        System.out.println();

        LinkedHashSet<Integer> uniq = new LinkedHashSet<>();
        for (int v: arr) uniq.add(v);

        System.out.println("New array:");
        for (int v: uniq) System.out.print(v + " ");
        System.out.println();
    }
}
