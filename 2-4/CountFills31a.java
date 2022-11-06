public class CountFills31a {
    public static void main(String args[]) {
        final int SIZE = 8;

        int c[][] = { { 0, 1, 1, 1, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 0, 0, 0, 1 },
                { 0, 0, 1, 1, 1, 1, 0, 1 },
                { 0, 0, 1, 0, 0, 1, 0, 1 },
                { 0, 0, 1, 1, 1, 1, 0, 1 },
                { 0, 0, 0, 0, 0, 0, 0, 1 },
                { 0, 0, 0, 0, 0, 0, 1, 1 },
                { 0, 0, 0, 0, 0, 0, 0, 0 } };
        int xZeroCount[] = new int[SIZE];
        int yZeroCount[] = new int[SIZE];
        int xNextOneCount[] = new int[SIZE];
        int yNextOneCount[] = new int[SIZE];
        int xZeroOneCount[][] = new int[SIZE][3];z
        int x, y;
        int i;

        for (i = 0; i < SIZE; i++) {
            xZeroCount[i] = 0;
            x = 0;
            while( x < SIZE && c[i][x] == 0 ) {
                xZeroCount[i] = xZeroCount[i] + 1;
                x++;
            }
            xNextOneCount[i] = 0;
            while( x < SIZE && c[i][x] == 1 ) {
                xNextOneCount[i] = xNextOneCount[i] + 1;
                x++;
            }

        }

        for (i = 0; i < SIZE; i++) {
            yZeroCount[i] = 0;
            y = 0;
            while( y < SIZE && c[y][i] == 0 ) {
                yZeroCount[i] = yZeroCount[i] + 1;
                y++;
            }
            yNextOneCount[i] = 0;
            while( y < SIZE && c[y][i] == 1 ) {
                yNextOneCount[i] = yNextOneCount[i] + 1;
                y++;
            }

        }


       
        for (y = 0; y < SIZE; y++) {
            for (x = 0; x < SIZE; x++) {
                System.out.print("" + c[y][x] + " ");
            }
            System.out.print(" || " + xZeroCount[y]);
            System.out.print("," + xNextOneCount[y]);
            System.out.print("\n");
        }
        System.out.print("---------------------\n");
        for (x = 0; x < SIZE; x++) {
            System.out.print("" + yZeroCount[x] + " ");
        }
        System.out.print("\n");
        for (x = 0; x < SIZE; x++) {
            System.out.print("" + yNextOneCount[x] + " ");
        }
        System.out.print("\n");
    }
}
