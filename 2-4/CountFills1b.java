public class CountFills1b {
    public static void main(String args[]) {
        int c[][] = { { 0, 1, 1, 1, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 0, 0, 0, 1 },
                { 0, 0, 1, 1, 1, 1, 0, 1 },
                { 0, 0, 1, 0, 0, 1, 0, 1 },
                { 0, 0, 1, 1, 1, 1, 0, 1 },
                { 0, 0, 0, 0, 0, 0, 0, 1 },
                { 0, 0, 0, 0, 0, 0, 1, 1 },
                { 0, 0, 0, 0, 0, 0, 0, 0 } };
        int xcount[] = new int[8];
        int ycount[] = new int[8];
        int x, y;

        for (y = 0; y < 8; y++) {
            xcount[y] = 0;
            for (x = 0; x < 8; x++) {
                if (c[y][x] == 1) {
                    xcount[y] = xcount[y] + 1;
                }
            }
        }

        for (x = 0; x < 8; x++) {
            ycount[x] = 0;
            for (y = 0; y < 8; y++) {
                if (c[y][x] == 1) {
                    ycount[x] = ycount[x] + 1;
                }
            }
        }
        for (y = 0; y < 8; y++) {
            for (x = 0; x < 8; x++) {
                System.out.print("" + c[y][x] + " ");
            }
            System.out.print(" || " + xcount[y]);
            System.out.print("\n");
        }
        System.out.print("---------------------\n");
        for (x = 0; x < 8; x++) {
            System.out.print("" + ycount[x] + " ");
        }
        System.out.print("\n");

    }

}
