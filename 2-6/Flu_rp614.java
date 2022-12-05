public class Flu_rp614 {
    static final int INITIAL = 10;
    static int fluInHamamatsuHistory[] = new int[300];
    static int fluInIwataHistory[] = new int[300];
    static int fluInTokyoHistory[] = new int[300];

    public static void main(String args[]) {
        long n;
        int i, d;
        d = 299;
        for (i = 0; i <= d; i++) {
            fluInHamamatsuHistory[i] = 0;
            fluInIwataHistory[i] = 0;
            fluInTokyoHistory[i] = 0;
        }
        n = fluInHamamatsu(d);
        System.out.print("Total " + n + " people may have flu in day " + d +
                "\n");
        return;
    }

    static int fluInHamamatsu(int day) {
        int i, r;
        if (day == 0) {
            return INITIAL;
        } else if (fluInHamamatsuHistory[day] != 0) {
            return fluInHamamatsuHistory[day];
        } else {
            r = fluInHamamatsu(day - 1);
            r += fluInIwata(day - 1) * 0.01;
            r += fluInTokyo(day - 1) * 0.01;
            r *= 1.01;
            if (r < 100 && day % 10 == 0) {
                r += 1;
            }
            fluInHamamatsuHistory[day] = r;
        }
        System.out.println("Hamamatsu: " + day);
        return r;
    }

    static int fluInIwata(int day) {
        int i, r;
        if (day == 0) {
            return INITIAL;
        } else if (fluInIwataHistory[day] != 0) {
            return fluInIwataHistory[day];
        } else {
            r = fluInIwata(day - 1);
            r += fluInHamamatsu(day - 1) * 0.1;
            r *= 1.01;
            if (r < 100 && day % 10 == 0) {
                r += 1;
            }
            fluInIwataHistory[day] = r;
        }
        System.out.println("Iwata: " + day);
        return r;
    }

    static int fluInTokyo(int day) {
        int i, r;
        if (day == 0) {
            return INITIAL;
        } else if (fluInTokyoHistory[day] != 0) {
            return fluInTokyoHistory[day];
        } else {
            r = fluInTokyo(day - 1);
            r *= 1.10;
            if (r < 10 && day % 10 == 0) {
                r += 1;
            }
            fluInTokyoHistory[day] = r;
        }
        System.out.println("Tokyo: " + day);
        return r;
    }

}