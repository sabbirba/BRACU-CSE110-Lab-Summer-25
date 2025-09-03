import java.util.*;

public class Lab1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i=0;i<N;i++) a[i] = sc.nextInt();

        System.out.println("The elements of the array are:");
        for (int i=0;i<N;i++) System.out.println(i + ": " + a[i]);

        int extra = sc.nextInt();
        int[] b = Arrays.copyOf(a, N+1);
        b[N] = extra;
        System.out.println("After resizing the array:");
        for (int i=0;i<b.length;i++){
            System.out.print(b[i] + (i==b.length-1?"":" "));
        }
        System.out.println();
    }
}
