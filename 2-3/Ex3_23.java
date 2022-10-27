import java.util.Scanner;

public class Ex3_23 {
    public static void main(String arts[]) {
        Scanner sc = new Scanner(System.in);
        int total, payment, change;
        int count10000, count5000, count1000, count500, count100, count50, count10, count5;

        System.out.print("total: ");
        total = sc.nextInt();
        System.out.print("payment: ");
        payment = sc.nextInt();

        change = payment - total;
        System.out.print("change:\n");

        // for 10000 yen start
        count10000 = 0;
        while (change >= 10000) {
            count10000++;
            change = change - 10000;
        }
        System.out.print("    " + count10000 + " x 10000 yen bill\n");
        // for 10000 yen end

        // for 5000 yen start
        count5000 = 0;
        while (change >= 5000) {
            count5000++;
            change = change - 5000;
        }
        System.out.print("    " + count5000 + " x 5000 yen bill\n");
        // for 5000 yen end

        // for 1000 yen start
        count1000 = 0;
        while (change >= 1000) {
            count1000++;
            change = change - 1000;
        }
        System.out.print("    " + count1000 + " x 1000 yen bill\n");
        // for 1000 yen end

        // for 500 yen start
        count500 = 0;
        while (change >= 500) {
            count500++;
            change = change - 500;
        }
        System.out.print("    " + count500 + " x 500 yen coin\n");
        // for 500 yen end

        // for 100 yen start
        count100 = 0;
        while (change >= 100) {
            count100++;
            change = change - 100;
        }
        System.out.print("    " + count100 + " x 100 yen coin\n");
        // for 100 yen end

        // for 50 yen start
        count50 = 0;
        while (change >= 50) {
            count50++;
            change = change - 50;
        }
        System.out.print("    " + count50 + " x 50 yen coin\n");
        // for 50 yen end

        // for 10 yen start
        count10 = 0;
        while (change >= 10) {
            count10++;
            change = change - 10;
        }
        System.out.print("    " + count10 + " x 10 yen coin\n");
        // for 10 yen end

        // for 5 yen start
        count5 = 0;
        while (change >= 5) {
            count5++;
            change = change - 5;
        }
        System.out.print("    " + count5 + " x 5 yen coin\n");
        // for 5 yen end

        // for 1 yen start
        System.out.print("    " + change + " x 1 yen coin\n");
        // for 1 yen end
    }
}