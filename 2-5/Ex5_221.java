public class Ex5_221 {

    static void printChar(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }

    static void printLine(int n, char c1, char c2) {
        int i;
        for (i = 0; i < n; i++) {
            printChar(n - i, c1);
            printChar(i + 1, c2);
            System.out.println();
        }

    }

    static public void main(String args[]) {
        printLine(10, ' ', '*');
        printLine(5, ' ', '*');
    }


}
