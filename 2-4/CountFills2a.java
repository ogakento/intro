public class CountFills2a {
    public static void main(String args[]) {

        int c[][] = { { 0, 1, 1, 1, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 1, 0, 0, 1 },
                { 0, 0, 1, 1, 1, 1, 0, 1 },
                { 0, 0, 1, 0, 1, 1, 0, 1 },
                { 0, 0, 1, 1, 1, 1, 0, 1 },
                { 0, 0, 0, 0, 1, 0, 0, 1 },
                { 0, 0, 0, 0, 1, 0, 1, 1 },
                { 0, 0, 0, 0, 1, 0, 0, 0 } };
        int xZeroCount[] = new int[8];
        int yZeroCount[] = new int[8];
        int x, y;

        for (y = 0; y < 8; y++) {
            xZeroCount[y] = 0;
            for (x = 0; x < 8; x++) {
                if (c[y][x] == 0) {
                    xZeroCount[y] = xZeroCount[y] + 1;
                }
            }
        }

        for (x = 0; x < 8; x++) {
            yZeroCount[x] = 0;
            for (y = 0; y < 8; y++) {
                if (c[y][x] == 0) {
                    yZeroCount[x] = yZeroCount[x] + 1;
                }
            }
        }

        for (y = 0; y < 8; y++) {
            for (x = 0; x < 8; x++) {
                System.out.print("" + c[y][x] + " ");
            }
            System.out.print(" || " + xZeroCount[y]);
            System.out.print("\n");
        }
        System.out.print("---------------------\n");
        for (x = 0; x < 8; x++) {
            System.out.print("" + yZeroCount[x] + " ");
        }
        System.out.print("\n");
    }
}
