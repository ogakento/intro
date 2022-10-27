import java.util.Scanner;

public class Fall2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double x, y, x_speed, y_speed;

        System.out.print("Initial altitude: ");
        y = sc.nextDouble();
        System.out.print("Initial vertical speed: ");
        y_speed = sc.nextDouble();
        System.out.print("Initial horizontal speed: ");
        x_speed = sc.nextDouble();

        System.out.print("Time resolutoin (s): ");
        double dt = sc.nextDouble();


        double x_d, y_d, x_speed_d, y_speed_d;
        double g_d;

        g_d = -9.8;

        x_d = 0;
        y_d = y;
        x_speed_d = x_speed;
        y_speed_d = y_speed;

        double dt_d = dt;

        while (y_d >= 0) {
            y_speed_d = y_speed_d + g_d / dt_d;
            x_d = x_d + x_speed_d / dt_d;
            y_d = y_d + y_speed_d / dt_d;
        }
        System.out.print("estimated distance (double) = " + x_d + "\n");
        float x_f, y_f, x_speed_f, y_speed_f;
        float g_f;

        g_f = -9.8f;

        x_f = 0;
        y_f = (float) y;
        x_speed_f = (float) x_speed;
        y_speed_f = (float) y_speed;

        float dt_f = (float) dt;

        while (y_f >= 0) {
            y_speed_f = y_speed_f + g_f / dt_f;
            x_f = x_f + x_speed_f / dt_f;
            y_f = y_f + y_speed_f / dt_f;
        }
        System.out.print("estimated distance (float) = " + x_f + "\n");

    }

}
