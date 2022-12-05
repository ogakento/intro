public class Flu_rp613 {
    static final int INITIAL = 10;

    public static void main(String args[]) {
        int n, d;
        d = 30;
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
            r += fluInIwata(day - 1) * 0.01;
            r += fluInTokyo(day - 1) * 0.01;
            r *= 1.01;
            if (r < 100 && day % 10 == 0) {
                r += 1;
            }
        }
        return r;
    }

    static int fluInIwata(int day) {
        int i, r;
        if (day == 0) {
            return INITIAL;
        } else {
            r = fluInIwata(day - 1);
            /* r += fluInHamamatsu(day-1) * 0.1; */
            r *= 1.01;
            if (r < 100 && day % 10 == 0) {
                r += 1;
            }
        }
        return r;
    }

    static int fluInTokyo(int day) {
        int i, r;
        if (day == 0) {
            return INITIAL;
        } else {
            r = fluInTokyo(day - 1);
            r *= 1.10;
            if (r < 10 && day % 10 == 0) {
                r += 1;
            }
        }
        return r;
    }

}
