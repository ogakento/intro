public class Ex4_042 {
    public static void main(String arts[]) {
        int i = 0, j = 0, total = 0;
        int[][] c = new int[3][];
        c[0] = new int[5];
        c[1] = new int[5];
        c[2] = new int[5];
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 5; j++) {
                c[i][j] = i * 5 + j;
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 5; j++) {
                total = total + c[i][j];
            }
        }
        System.out.print("total = " + total + "\n");
    }

}
