import java.util.Scanner;

public class Gold{
    public static void main(String args[]) {
        int gold = 0;
        int silver = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("A");
        gold = sc.nextInt();
        System.out.print("B");
        silver = sc.nextInt();

        if (0 <= gold && gold <= 100 && 0 <= silver && silver <= 100 && 0 < (gold + silver)) {
            if (0 < gold && silver == 0) {
                System.out.println("Gold");
            } else if (gold == 0 && 0 < silver) {
                System.out.println("Silver");
            } else {
                System.out.println("Alloy");
            }
        } else {
            System.out.println("Error");
        }
    }
}
