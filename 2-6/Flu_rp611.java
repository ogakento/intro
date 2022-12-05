public class Flu_rp611 {
    static final int INITIAL = 10;

    public static void main(String args[]) {
        int n, d;
        d = 300;
        n = fluInHamamatsu(d);
        System.out.print("Total " + n + " people may have flu in day " + d + "\n");
        return;
    }

    static int fluInHamamatsu(int day) {
        int i, r;
        if (day == 0) {
            return INITIAL;
        } else {
            r = fluInHamamatsu(day - 1);
            r *= 1.01;
            if (r < 100 && (int) (Math.random() * 100) < 1) {
                r += 1;
            }
        }
        return r;
    }
}
