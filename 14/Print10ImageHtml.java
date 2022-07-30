public class Print10ImageHtml {
    public static void main(String args[]) {
        int n = 0;
        System.out.print("<HTML>\n");
        System.out.print("<HEAD><TITLE>Ten Image Page </TITLE></HEAD>\n");
        System.out.print("<BODY>\n");

        for (int i = 0; i < 10; i++) {
            n = i;
            System.out.print("<IMG SRC=\"number_" + n + ".png\"><BR>\n");
        }

        System.out.print("</BODY>\n");
        System.out.print("</HTML>\n");
    }
}