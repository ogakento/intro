import java.util.Scanner;

public class Ex3_24 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int total, payment, change;
        int count;
        int[] units = {10000, 5000, 1000, 500, 100, 50, 10, 5, 1};

        System.out.print("total: ");
        total = sc.nextInt();
        System.out.print("payment: ");
        payment = sc.nextInt();

        System.out.println("change:");
        change = payment - total;
        for (int i = 0; i < units.length; i++) {
            count = 0;
            while (change >= units[i]) {
                count++;
                change = change - units[i];
            }
            if (i <= 2) {
                System.out.println("    " + count + " x " + units[i] + " yen bill");
            } else {
                System.out.println("    " + count + " x " + units[i] + " yen coin");
            }
        }
    }
}
