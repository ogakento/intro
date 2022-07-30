import java.util.Scanner;

public class PrintDifImageHtml {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("<HTML>\n");
        System.out.print("<HEAD><TITLE>Single Image Page </TITLE></HEAD>\n");
        System.out.print("<BODY>\n");

        for (int i = 0; i < n; i++) {
        System.out.print("<IMG SRC=\"" + i + ".jpg\"><BR>\n");
        }

        System.out.print("</BODY>\n");
        System.out.print("</HTML>\n");
        System.err.print(n + "枚の画像を表示しました");
    } 
}
