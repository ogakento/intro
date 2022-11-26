public class Rp5_014 {
    static long f (int n) {
        long result, f_1;
        if (n == 1) {
            return 1;
        }
        f_1 = f(n - 1);
        result = n * f_1;
        System.out.println(" f(" + n + ") = " + n + " * " + f_1);
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
