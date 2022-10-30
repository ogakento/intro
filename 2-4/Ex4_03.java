public class Ex4_03 {
    public static void main(String arts[]) {
        int i = 0, j = 0;
        for (i = 0; i < 10; i++) {
            System.out.print(i + ": ");
            for (j = i; j < 10; j++) {
                System.out.print(j + "");
            }
            System.out.print("\n");
        }
        System.out.print("i=" + i + "/j=" + j + "\n");
    }

}
