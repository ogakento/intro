import java.util.Scanner;

public class PassWord {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       String pass = "";
       int A = 0;
       int B = 0;
       int C = 0;
       int D = 0;

       pass = sc.next();
       A = pass.charAt(0)-'0';
       B = pass.charAt(1)-'0';
       C = pass.charAt(2)-'0';
       D = pass.charAt(3)-'0';

       if (0 <= A && A <= 9 && 0 <= B && B <= 9 && 0 <= C && C <= 9 && 0 <= D && D <= 9) {
           if (A == B && B == C && C == D) {
               System.out.println("Weak");
           } else if (D == (C + 1)%10 && C == (B + 1)%10 && B == (A + 1)%10) {
               System.out.println("Weak");
           } else {
            System.out.println("Strong");
           }
       } else {
           System.out.println("Error");
       }
    }
}
