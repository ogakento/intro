import java.util.Scanner;

/**
 * プログラム名：13.5.1 年齢計算
 * 作成者：70211056 古川優
 * 作成日： Thu Nov 10 17:50:20 JST 2022
 */
public class HowOld {

    // 起動処理
    public static void main(String[] args) {
        HowOld main = new HowOld();
        main.run();
    }

    // メイン処理
    public void run() {Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        getAge(int year) {
            int Year;
            int age;
            System.out.println(" 西暦年齢変換プログラムを開始します");
            System.out.println("西暦を入力してください");
            Year = scanner.nextInt();
            age = 2022 - Year;
            return age;
        }
    }

}
