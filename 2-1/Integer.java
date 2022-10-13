public class Integer {
    static public void main(String args[]) {
        int i = 1;
        int n = Integer.parseInt(args[0]);
        while (i <= n) {
            System.out.println(i);
            i++;
        }
        return;
    }
}
