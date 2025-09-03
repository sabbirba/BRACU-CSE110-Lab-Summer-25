import java.util.*;

public class Lab3 {
    public static void main(String[] args){
        int[] arr = {9, -5, 7, 9, -5, 5, 7};
        System.out.println("Before removing duplicates:");
        for (int v: arr) System.out.print(v + " ");
        System.out.println();

        // mark duplicates after first occurrence with 0
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if (!seen.containsKey(arr[i])) seen.put(arr[i], i);
            else arr[i] = 0;
        }

        System.out.println("After replacing duplicates with 0:");
        for (int v: arr) System.out.print(v + " ");
        System.out.println();
    }
}
