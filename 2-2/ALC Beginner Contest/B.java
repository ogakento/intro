import java.util.Scanner;

public class B {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        if (A <= B && C <= D && 0 <= A && 0 <= C && B <= 1000000000000000000L && D <= 1000000000000000000L) {
            if (B >= C && A >= D) {
                System.out.print("Yes");
                
            } else {
                System.out.print("No");
                
            }
        } else {
            System.out.print("Error");
            
        }
    }
}
