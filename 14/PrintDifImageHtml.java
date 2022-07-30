import java.util.Scanner;

public class PrintDifImageHtml {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 10 && n > 0) {

            System.out.print("<HTML>\n");
            System.out.print("<HEAD><TITLE>Single Image Page </TITLE></HEAD>\n");
            System.out.print("<BODY>\n");

            for (int i = 0; i < n; i++) {
                System.out.print("<IMG SRC=\"" + i + ".jpg\"><BR>\n");
            }

            System.out.print("</BODY>\n");
            System.out.print("</HTML>\n");
            System.err.print(n + "枚の画像を表示しました");

        } else {
            System.err.print("1以上10以下の値を入力してください");
        }

    }
}
