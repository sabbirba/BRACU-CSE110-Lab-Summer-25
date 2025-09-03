import java.util.Scanner;
public class HomeTask3 {

    // 3A
    public static double calcTax(int age, double salary) {
        if (age < 18) {
            return 0.0;
        }
        if (salary < 10000) {
            return 0.0;
        }
        if (salary <= 20000) {
            return (salary * 7) / 100;
        }
        return (salary * 14) / 100;
    }

    // 3B
    public static void calcYearlyTax() {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        double total = 0.0;
        for (int m = 1; m <= 12; m++) {
            double income = sc.nextDouble();
            double tax = calcTax(age, income);
            System.out.println("Month" + m + " tax: " + tax);
            total += tax;
        }
        System.out.println("Total Yearly Tax: " + total);
        sc.close();
    }

    public static void main(String[] args) {
        System.out.println(calcTax(16, 20000));
        calcYearlyTax();
    }

}
