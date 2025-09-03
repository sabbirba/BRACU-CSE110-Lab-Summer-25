import java.util.*;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the length of array 1: ");
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        System.out.println("Please enter the elements of the arr1:");

        for (int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }

        System.out.print("Please enter the length of array 2: ");
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        System.out.println("Please enter the elements of the arr2:");

        for (int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }

        boolean subset = true;
        for (int v : a2) {
            boolean found = false;
            for (int u : a1) {
                if (u == v) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                subset = false;
                break;
            }
        }

        if (subset) {
            System.out.println("Array 2 is a subset of Array 1.");
        } else {
            System.out.println("Array 2 is not a subset of Array 1.");
        }

        sc.close();
    }
}
