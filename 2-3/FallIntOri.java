public class FallIntOri {
    public static void main(String args[]) { 
        int x, y, x_speed, y_speed; 
        int g;  

        g = -10; 
        x = 0;
        y = 200000;
        x_speed = 1000;
        y_speed = 0;

        while( y >= 0 ) {
            y_speed = y_speed + g;
            x = x + x_speed;
            y = y + y_speed;   
        }
        System.out.print("estimated distance = " + x + "\n");
    }
}