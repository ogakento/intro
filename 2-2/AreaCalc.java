import java.util.Scanner;

public class AreaCalc {
    static public void main(String args[]) {
        double width, height; //幅、高さ
        double y;
        double area = 0.0;
        double d = 0.0001;
        int r = 1;
        int lastR;
        Scanner sc = new Scanner(System.in);
        System.err.print("width:");
        width = sc.nextDouble();
        lastR = (int)(width/d);
        System.err.print("height:");
        height = sc.nextDouble();

        while (r <= lastR) {
            y = height;
            area = area + d * y;
            r++;
        }
        System.out.println("estimated area:" + area);
        System.out.println("          area:" + width * height);
        return;
    }
}