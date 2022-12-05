import java.util.Random;

public class Insert {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[10];
        int[] r = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100);
            System.out.print(a[i] + " ");
        }

        System.out.println();

        r[0] = a[0];

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] > r[j]) {
                    if (r[j] >= 0 && j != i) {
                        r[j] = a[i];
                        a[i] = -1;
                        continue;
                    } else {
                        r[j - 1] = r[j];
                        r[j] = a[i];
                        a[i] = -1;
                        continue;
                    }
                } else {
                    continue;
                }
            }
            r[i] = a[i];
        }
        for (int k = 0; k < a.length; k++) {
            System.out.print(r[k] + " ");
        }

    }
}
