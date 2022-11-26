public class Rp5_022 {
    static long[] f = new long[30];

    static long f(int n) {
        long result;
        if (f[n] != 0) {
            return f[n];
        }
        result = n;
        for (int i = n - 1; i >= 1; i--) {
            if (f[i] != 0) {
                result *= f[i];
                System.out.println(" result = " + result + " * f(" + i + ")");
                break;
            } else {
                result *= i;
                System.out.println(" result = " + result + " * " + i);
            }
        }
        f[n] = result;
        return result;
    }

    public static void main(String arts[]) {
        int i;
        long r;
        for (i = 1; i <= 15; i++) {
            r = f(i);
            System.out.println("f(" + i + ") = " + r);
        }

    }
}