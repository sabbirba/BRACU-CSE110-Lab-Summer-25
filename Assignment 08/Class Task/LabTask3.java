public class LabTask3 {

    public static boolean isTriangle(int a, int b, int c) {
        return (a + b > c) && (b + c > a) && (c + a > b);
    }

    public static void triArea(int a, int b, int c) {
        if (!isTriangle(a, b, c)) {
            System.out.println("Can’t form triangle");
            return;
        }
        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.printf("%.3f\n", area);
    }

    public static void main(String[] args) {
        System.out.println(isTriangle(7, 5, 10));
        System.out.println(isTriangle(3, 2, 1));
        triArea(3, 2, 1);
        triArea(7, 5, 10);
    }

}
