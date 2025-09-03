public class HomTracingHomeTask5 {
    public static String fun(String s, int n) {
        if (s.length() == 4) {
            return n + s + n;
        } else if (n % 2 == 0) {
            System.out.println(s + n + n + 3);
            return fun(s + n, n + 3);
        } else {
            System.out.println(s + n + (n - 1));
            return fun(s + n, n - 1);
        }
    }

    public static void main(String[] args) {
        String s = fun("", 1);
        System.out.println(s);
    }

    // Tracing for fun("",1):
    // fun("",1): s.length=0 !=4, 1%2!=0, print ""+1+(0) = "10"
    // return fun("1",0)
    // fun("1",0): length=1 !=4, 0%2==0, print "1"+0+0+3 = "1003"
    // return fun("10",3)
    // fun("10",3): length=2 !=4, 3%2!=0, print "10"+3+(2) = "1032"
    // return fun("103",2)
    // fun("103",2): length=3 !=4, 2%2==0, print "103"+2+2+3 = "10323"
    // return fun("1032",5)
    // fun("1032",5): length=4 ==4, return 5+"1032"+5 = "510325"
    // Output: 1003
    // 1032
    // 10323
    // 510325
}
