import java.util.Scanner;

public class ImputTextE {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 10) {
            System.out.println("今入力された数は" + n + "です");
        } else {
            System.out.println("10以下の数字を入力してください");
        }
    }
}
