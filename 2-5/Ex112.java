public class Ex112 {
    static int f(int n) {
        int i;
        int result = n;
        for (i = n - 1; i > 1; i--) {
            result = result * i;
        }
        return result;
    }

    public static void main(String arts[]) {
        int ff;
        int i;
        for (i = 1; i <= 10; i++) {
            ff = f(i);
            System.out.println("f" + i + " = " + ff);
        }
    }
}
