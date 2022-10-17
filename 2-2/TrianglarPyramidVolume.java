import java.util.Scanner;

public class TrianglarPyramidVolume {
    public static void main(String args[]) {
        double height, round;
        double y;
        double a;
        double circleArea;
        double volume = 0.0;
        double d = 0.0001;
        int r = 1;
        int lastR;
        Scanner sc = new Scanner(System.in);
        System.err.print("height:");
        height = sc.nextDouble();
        lastR = (int)(height/d);
        System.err.print("round:");
        round = sc.nextDouble();
        a = round/height;


        while (r <= lastR) {
            y = a * (r*d);
            circleArea = y * y * Math.PI;
            volume = volume + d * circleArea;
            r++;
        }
        System.out.println("estimated volume:" + volume);
        System.out.println("          volume:" + round * round * height * Math.PI / 3);
    }
}