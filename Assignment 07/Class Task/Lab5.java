import java.util.*;

public class Lab5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++) a[i] = sc.nextInt();

        System.out.println("Original Array:");
        for (int v: a) System.out.print(v + " ");
        System.out.println();

        // selection sort descending
        for (int i=0;i<n-1;i++){
            int maxIdx = i;
            for (int j=i+1;j<n;j++) if (a[j] > a[maxIdx]) maxIdx = j;
            int t = a[i]; a[i] = a[maxIdx]; a[maxIdx] = t;
        }

        System.out.println("Sorted Array:");
        for (int v: a) System.out.print(v + " ");
        System.out.println();
    }
}
