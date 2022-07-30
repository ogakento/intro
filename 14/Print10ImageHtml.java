public class Print10ImageHtml {
    public static void main(String args[]) {
        System.out.print("<HTML>\n");
        System.out.print("<HEAD><TITLE>Ten Image Page </TITLE></HEAD>\n");
        System.out.print("<BODY>\n");

        for (int i = 0; i < 10; i++) {
            System.out.print("<IMG SRC=\"number_" + i + ".png\"><BR>\n");
        }

        System.out.print("</BODY>\n");
        System.out.print("</HTML>\n");
    }
}