public class Rp5_012 {
    static int f(int n) {
        int result;
        if (n == 1) {
            return 1;
        }
        result = n * f(n - 1);
        return result;
    }

    public static void main(String arts[]) {
        int i, r;
        for (i = 1; i <= 15; i++) {
            r = f(i);
            System.out.println("f(" + i + ") = " + r);
        }
    }
}
