import java.util.Scanner;

public class DoubleLoop {
    static public void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double step = 0.1;
        double num = 0.0;
        int i = 1;
        int n = sc.nextInt();
        while (i <= n) {
            num = num + step;
            System.out.println(i + ": " + num + "|" + i*step);
            i++;
        }
        return;
    }
}
