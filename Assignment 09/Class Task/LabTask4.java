public class LabTask4 {
    // 4
    public static String reverse_string(String s, int idx) {
        if (idx == s.length()) return "";
        return reverse_string(s, idx + 1) + s.charAt(idx);
    }

    public static void main(String[] args) {
        System.out.println(reverse_string("Hello", 0));
    }
}
