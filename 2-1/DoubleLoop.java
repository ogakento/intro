public class DoubleLoop {
    static public void main(String args[]) {
        double step = 0.1;
        double num = 0.0;
        int i = 1;
        int n = Integer.parseInt(args[0]);
        while (i <= n) {
            num = num + step;
            System.out.println(i + ": " + num + "|" + i*step);
            i++;
        }
        return;
    }
}
