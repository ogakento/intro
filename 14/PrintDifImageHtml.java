import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class PrintDifImageHtml {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }

        int a = sc.nextInt();

        for (int j = 0; j < a; j++) {
            

        }

        System.out.print("<HTML>\n");
        System.out.print("<HEAD><TITLE>Single Image Page </TITLE></HEAD>\n");
        System.out.print("<BODY>\n");
        System.out.print("<IMG SRC=\"1.jpg\"><BR>\n");
        System.out.print("</BODY>\n");
        System.out.print("</HTML>\n");
        System.err.print("処理は終了しました");
    } 
}
