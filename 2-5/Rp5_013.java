class Rp5_013 {
    static int f(int n) {
        int result, f_1;
        if (n == 1) {
            return 1;
        }
        f_1 = f(n - 1);
        result = n * f_1;
        System.out.println(" f(" + n + ") = " + n + " * " + f_1);
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