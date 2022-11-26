public class Ex5_212 {
    static void printSpace(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }

    static void printStar(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    public static void main(String args[]) {
        int i;

        for (i = 0; i < 10; i++) {
            printSpace(10 - i);
            printStar(i + 1);
            System.out.println();
        }

        for (i = 0; i < 5; i++) {
            printSpace(5 - i);
            printStar(i + 1);
            System.out.println();
        }
    }
}
