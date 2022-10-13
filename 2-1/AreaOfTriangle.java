import java.util.Scanner;

class AreaOfTriangle {
    public static void main(String args[]) {
        int width;
        int height;
        int area;
        Scanner sc = new Scanner(System.in);

        System.err.print("width: ");
        width = sc.nextInt();

        System.err.print("height: ");
        height = sc.nextInt();

        area = 0;
        area = width * height / 2;

        System.out.println("area: " + area);

        return;
    }
}