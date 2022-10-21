import java.util.Scanner;

public class FallInt {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x, y, x_speed, y_speed;
        int g;

        g = -10;

        x = 0;
        y = 100000;
        x_speed = sc.nextInt();
        y_speed = sc.nextInt();

        while( y >= 0 ) {
            y_speed = y_speed + g;
            x = x + x_speed;
            y = y + y_speed;
        }
        System.out.print("estimated distance = " + x + "\n");

        return;
    }  
}
