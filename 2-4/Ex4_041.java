public class Ex4_041 {
    public static void main(String arts[]) {
        int i = 0, j = 0, total = 0;
        int[][] c = { { 0, 1, 2, 3, 4 },
                { 5, 6, 7, 8, 9 },
                { 10, 11, 12, 13, 14 }
        };
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 5; j++) {
                total = total + c[i][j];
            }
        }
        System.out.print("total = " + total + "\n");
    }

}
