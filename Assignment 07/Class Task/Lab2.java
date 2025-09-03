import java.util.*;

public class Lab2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++) a[i] = sc.nextInt();

        // Out-of-place reverse
        int[] r = new int[n];
        for (int i=0;i<n;i++) r[i] = a[n-1-i];
        System.out.println("Reversed using a new array:");
        for (int v: r) System.out.print(v + " ");
        System.out.println();

        // In-place reverse
        for (int i=0;i<n/2;i++){
            int t = a[i]; a[i] = a[n-1-i]; a[n-1-i] = t;
        }
        System.out.println();
        System.out.println("Reversed the original array:");
        for (int v: a) System.out.print(v + " ");
        System.out.println();
    }
}
