public class LabTask5 {
    // 5
    public static int calculate(int n) {
        if (n <= 0) {
            return 4;
        } else if (n % 2 != 0) {
            return n + calculate(n - 1);
        } else {
            return n * calculate(n - 2);
        }
    }

    public static void main(String[] args) {
        int result = calculate(8);
        System.out.println(result); // 1536
        int result2 = calculate(5);
        System.out.println(result2); // 37
    }

    // Tracing for calculate(8):
    // calculate(8) -> 8 * calculate(6)
    // calculate(6) -> 6 * calculate(4)
    // calculate(4) -> 4 * calculate(2)
    // calculate(2) -> 2 * calculate(0)
    // calculate(0) -> 4
    // So, 2*4=8, 4*8=32, 6*32=192, 8*192=1536

    // Tracing for calculate(5):
    // calculate(5) -> 5 + calculate(4)
    // calculate(4) -> 32 (as above)
    // 5 + 32 = 37
}
