import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Start: ");
        int start = sc.nextInt();
        System.out.print("End: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers:");

        for (int num = start; num <= end; num++) { // loop through the range
            int temp = num;
            int digits = 0;
           
            for (int t = temp; t > 0; t /= 10) { // count the number of digits
                digits++;
            }
            int sum = 0;
            for (int t = num; t > 0; t /= 10) { // calculate sum of the digits raised to the power of the number of digits
                int d = t % 10;
                int pow = 1;
                for (int i = 0; i < digits; i++) { // raise d to the power of digits
                    pow *= d;
                }
                sum += pow;
            }
            if (sum == num) {
                System.out.println(num);
            }
        }
        sc.close();
    }
}
