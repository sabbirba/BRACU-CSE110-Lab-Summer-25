public class LabTask1 {

    public static void evenChecker(int n) {
        if (n % 2 == 0) {
            System.out.println("Even!!");
        } else {
            System.out.println("Odd!!");
        }
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static boolean isPos(int n) {
        return n > 0;
    }

    public static void sequence(int n) {
        if (isPos(n)) {
            for (int i = 0; i <= n; i++) {
                if (isEven(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            for (int i = n; i <= -1; i++) {
                if (!isEven(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        evenChecker(10);
        evenChecker(17);

        System.out.println(isEven(10));
        System.out.println(isEven(17));

        System.out.println(isPos(-5));
        System.out.println(isPos(12));

        sequence(10);
        sequence(-7);
        sequence(7);
        sequence(-8);
    }

}
