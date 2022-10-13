import java.util.Scanner;

class AreaOfTriangleDouble4 {
    public static void main(String args[]) {
        int width;
        int height;
        int i = 0;
        double area;
        Scanner sc = new Scanner(System.in);

        while (i < 2) {
            System.err.print("width: ");
            width = sc.nextInt();

            System.err.print("height: ");
            height = sc.nextInt();

            area = (double)width * height / 2;

            System.out.println("area: " + area);
            i++;
        }
        sc.close();
        return;
    }
}