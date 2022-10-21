import java.util.Scanner;

public class Ex3_21 {
    public static void main(String arts[]) {
        Scanner sc = new Scanner(System.in);
        int total, payment, change;
        System.out.print("total: ");
        total = sc.nextInt();
        System.out.print("payment: ");
        payment = sc.nextInt();
        change = total - payment;

        System.out.print("change: " + change + "\n");
    }
}