import java.util.Scanner;

public class Fall {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Double or Float? (d/f): ");
        String object = sc.next();
        char type = object.charAt(0);

        if (type == 'd') {
            double x, y, x_speed, y_speed;
            double g;

            g = -9.8;

            x = 0;
            y = 100000;
            x_speed = 800;
            y_speed = 0;

            System.out.print("Time resolutoin (s): ");
            double dt = sc.nextDouble();

            while (y >= 0) {
                y_speed = y_speed + g / dt;
                x = x + x_speed / dt;
                y = y + y_speed / dt;
            }
            System.out.print("estimated distance = " + x + "\n");
        } else if (type == 'f') {
            float x, y, x_speed, y_speed;
            float g;

            g = -9.8f;

            x = 0;
            y = 100000;
            x_speed = 800;
            y_speed = 0;

            System.out.print("Time resolutoin (s): ");
            float dt = sc.nextFloat();

            while (y >= 0) {
                y_speed = y_speed + g / dt;
                x = x + x_speed / dt;
                y = y + y_speed / dt;
            }
            System.out.print("estimated distance = " + x + "\n");
        } else {
            System.out.print("Erorr: Invalid input");
        }

    }

}
