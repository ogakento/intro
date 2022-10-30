public class CountFills1a {
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

        xcount[0] = 0;
        for (x = 0; x < 8; x++) {
            if (c[0][x] == 1) {
                xcount[0] = xcount[0] + 1;
            }
        }

        xcount[1] = 0;
        for (x = 0; x < 8; x++) {
            if (c[1][x] == 1) {
                xcount[1] = xcount[1] + 1;
            }
        }

        xcount[2] = 0;
        for (x = 0; x < 8; x++) {
            if (c[2][x] == 1) {
                xcount[2] = xcount[2] + 1;
            }
        }

        xcount[3] = 0;
        for (x = 0; x < 8; x++) {
            if (c[3][x] == 1) {
                xcount[3] = xcount[3] + 1;
            }
        }

        xcount[4] = 0;
        for (x = 0; x < 8; x++) {
            if (c[4][x] == 1) {
                xcount[4] = xcount[4] + 1;
            }
        }

        xcount[5] = 0;
        for (x = 0; x < 8; x++) {
            if (c[5][x] == 1) {
                xcount[5] = xcount[5] + 1;
            }
        }

        xcount[6] = 0;
        for (x = 0; x < 8; x++) {
            if (c[6][x] == 1) {
                xcount[6] = xcount[6] + 1;
            }
        }

        xcount[7] = 0;
        for (x = 0; x < 8; x++) {
            if (c[7][x] == 1) {
                xcount[7] = xcount[7] + 1;
            }
        }

        ycount[0] = 0;
        for (y = 0; y < 8; y++) {
            if (c[y][0] == 1) {
                ycount[0] = ycount[0] + 1;
            }
        }

        ycount[1] = 0;
        for (y = 0; y < 8; y++) {
            if (c[y][1] == 1) {
                ycount[1] = ycount[1] + 1;
            }
        }

        ycount[2] = 0;
        for (y = 0; y < 8; y++) {
            if (c[y][2] == 1) {
                ycount[2] = ycount[2] + 1;
            }
        }

        ycount[3] = 0;
        for (y = 0; y < 8; y++) {
            if (c[y][3] == 1) {
                ycount[3] = ycount[3] + 1;
            }
        }

        ycount[4] = 0;
        for (y = 0; y < 8; y++) {
            if (c[y][4] == 1) {
                ycount[4] = ycount[4] + 1;
            }
        }

        ycount[5] = 0;
        for (y = 0; y < 8; y++) {
            if (c[y][5] == 1) {
                ycount[5] = ycount[5] + 1;
            }
        }
        
        ycount[6] = 0;
        for (y = 0; y < 8; y++) {
            if (c[y][6] == 1) {
                ycount[6] = ycount[6] + 1;
            }
        }

        ycount[7] = 0;
        for (y = 0; y < 8; y++) {
            if (c[y][7] == 1) {
                ycount[7] = ycount[7] + 1;
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
