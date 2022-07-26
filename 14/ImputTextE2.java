import java.util.Scanner;

public class ImputTextE2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("表示したい画像の枚数を10以下の数字で入力してください");
        int n = sc.nextInt();
        if (n <= 10) {
            System.out.println("今入力された数は" + n + "です");
        } else {
            System.out.println("10以下の数字を入力してください");
        }
    }
}
