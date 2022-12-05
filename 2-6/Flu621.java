public class Flu621 {
    static final int REGION_SIZE = 20;

    public static void main(String args[]) {
        int n, i, j;
        int n_in_region[][] = new int[REGION_SIZE][REGION_SIZE];
        for (i = 0; i < REGION_SIZE; i++) {
            for (j = 0; j < REGION_SIZE; j++) {
                n_in_region[i][j] = 0;
            }
        }
        for (n = 0; n < 1000; n++) {
            for (i = 0; i < REGION_SIZE; i++) {
                for (j = 0; j < REGION_SIZE; j++) {
                    n_in_region[i][j] = one_percent_increase_of(n_in_region[i][j]);
                }
            }
            // 表⽰が遅いと感じる場合下記有効で100⽇ごとに表⽰に変更
            // if ((n+1)%100==0) continue;
            System.out.print("day " + n + "\n");
            for (i = 0; i < REGION_SIZE; i++) {
                for (j = 0; j < REGION_SIZE; j++) {
                    System.out.printf("%3d ", n_in_region[i][j]);
                }
                System.out.print("\n");
            }
        }
        return;
    }

    static int one_percent_increase_of(int num) {
        int r;
        r = num;
        r *= 1.01;
        if (r < 100 && (int) (Math.random() * 100) < 1) {
            r += 1;
        }
        return r;
    }
}
