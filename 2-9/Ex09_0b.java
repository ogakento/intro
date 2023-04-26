import java.io.*;
import java.net.*;
 
public class Ex09_0b {
    public static void main(String args[]) {
        URL theUrl;
        try{
            theUrl = new URL(args[0]);
        } catch( MalformedURLException mue ) {
            return;
        }

        HttpURLConnection huc;
        try {
            huc = (HttpURLConnection)theUrl.openConnection();
        } catch( IOException ioe ) {
            return;
        }
        InputStream instream;
        try {
            instream = huc.getInputStream();
        } catch( IOException ioe ) {
            return;
        }
            InputStreamReader isreader = new InputStreamReader(instream);
            BufferedReader bfreader = new BufferedReader(isreader);
            String theLine;
            
            do {
                try {
                    theLine = bfreader.readLine();
                } catch( IOException ioe ) {
                    return;
                }
                if( theLine != null ) {
                    System.out.println(theLine);
                }
            } while( theLine != null );
            
    }
}