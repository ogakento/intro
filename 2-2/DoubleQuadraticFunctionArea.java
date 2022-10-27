import java.util.Scanner;

public class DoubleQuadraticFunctionArea {
    public static void main(String args[]) {
        double a, b, c; //関数y1の係数
        double d, e, f; //関数y2の係数
        double x1, x2; //定義域の範囲
        double y1, y2; //関数Fの値
        double area = 0.0;
        double y1area = 0.0;
        double y2area = 0.0;
        double truey1area = 0.0;
        double truey2area = 0.0;
        double truearea = 0.0;
        double delta = 0.0001; //分解能
        int r = 1;
        int lastR;
        Scanner sc = new Scanner(System.in);

        System.err.println("y1 = ax^2 + bx + c");
        System.err.print("a:");
        a = sc.nextDouble();
        System.err.print("b:");
        b = sc.nextDouble();
        System.err.print("c:");
        c = sc.nextDouble();
        System.err.println("y2 = dx^2 + ex + f");
        System.err.print("d:");
        d = sc.nextDouble();
        System.err.print("e:");
        e = sc.nextDouble();
        System.err.print("f:");
        f = sc.nextDouble();
        System.err.println("x1 <= x <= x2");
        System.err.print("x1:");
        x1 = sc.nextDouble();
        System.err.print("x2:");
        x2 = sc.nextDouble();
        lastR = (int)((x2 - x1)/delta);

        if (x1 <= x2) {
            while (r <= lastR) {
                y1 = a * (r*delta + x1) * (r*delta + x1) + b * (r*delta + x1) + c;
                y2 = d * (r*delta + x1) * (r*delta + x1) + e * (r*delta + x1) + f;
                y1area = y1area + delta * y1;
                y2area = y2area + delta * y2;
                r++;
            }
            area = y2area - y1area;
            if (area < 0) {
                area = -area;
            } else {
                area = area;
            }

            truey1area = a * x1 * x1 * x1 / 3 + b * x1 * x1 / 2 + c * x1 - a * x2 * x2 * x2 / 3 - b * x2 * x2 / 2 - c * x2;
            truey2area = d * x1 * x1 * x1 / 3 + e * x1 * x1 / 2 + f * x1 - d * x2 * x2 * x2 / 3 - e * x2 * x2 / 2 - f * x2;
            if (truey1area < truey2area) {
                truearea = truey2area - truey1area;
            } else {
                truearea = truey1area - truey2area;
            }
            System.out.println("estimated area:" + area);
            System.out.println("          area:" + truearea);
        } else {
            System.err.println("x1 > x2");
            return;
        }

    }
}
