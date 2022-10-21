public class FallDouble {
    public static void main(String args[]) {
        double x, y, x_speed, y_speed;
        double g;

        g = -10;

        x = 0;
        y = 100000;
        x_speed = 800;
        y_speed = 0;

        while(y >= 0){
            y_speed = y_speed + g/100000;
            x = x + x_speed/100000;
            y = y + y_speed/100000;
        }
        System.out.print("estimated distance = " + x + "\n");

        return;
    }
    
}
