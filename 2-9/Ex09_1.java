import java.io.*;
import java.net.*;
 
public class Ex09_1 {
    public static void main(String args[]) {
        try{
            URL theUrl = new URL(args[0]);
            HttpURLConnection huc = (HttpURLConnection)theUrl.openConnection();
            InputStream instream = huc.getInputStream();
            InputStreamReader isreader = new InputStreamReader(instream);
            BufferedReader bfreader = new BufferedReader(isreader);
            
            File theFile = new File(args[1]);
            if( theFile.exists() ) {
                System.err.print("File already exist:" + args[1] + "\n");
                return;
            }
            FileOutputStream foutstream = new FileOutputStream(theFile);
            OutputStreamWriter oswriter = new OutputStreamWriter(foutstream);
            BufferedWriter bfwriter = new BufferedWriter(oswriter);
            PrintWriter pwriter = new PrintWriter(bfwriter);
            
            String theLine;
            
            do {
                theLine = bfreader.readLine();
                if( theLine != null ) {
                    pwriter.println(theLine);
                }
            } while( theLine != null );
            
            pwriter.flush();
            pwriter.close();
            
        } catch (Exception e) {
            System.err.print(e);
        }
    }
}