import java.util.Scanner;

public class Ex3_22 {
    public static void main(String arts[]) {
        Scanner sc = new Scanner(System.in);
        int total, payment, change;
        int count;

        System.out.print("total: ");
        total = sc.nextInt();
        System.out.print("payment: ");
        payment = sc.nextInt();

        change = payment - total;
        System.out.print("change:\n");

        // for 500 yen start
        count = 0;
        while (change >= 500) {
            count++;
            change = change - 500;
        }
        System.out.print("    " + count + " x 500 yen coin\n");
        // for 500 yen end

        System.out.print("    " + change + " x 1 yen coin\n");
    }
}
