import java.io.*;
import java.net.*;
 
public class Ex09_2 {
    public static void main(String args[]) {
        try{
            ServerSocket ss = new ServerSocket(12354);
            while(true) {
                Socket s = ss.accept();
                InputStream instream = s.getInputStream();
                InputStreamReader isreader = new InputStreamReader(instream);
                BufferedReader bfreader = new BufferedReader(isreader);
                
                String theLine;
                theLine = bfreader.readLine();
                theLine = theLine.substring(theLine.indexOf(" ")+1);
                theLine = theLine.substring(0,theLine.indexOf(" "));
                theLine = theLine.substring(theLine.indexOf("/")+1);
                System.out.print("filename: " + theLine + "\n");
                File theFile = new File(theLine);
                if( theFile.exists() == false ) {
                    System.err.print("File does not exist:" + theLine + "\n");
                    s.close();
                    continue;
                }
                FileInputStream finstream = new FileInputStream(theFile);
                InputStreamReader fisreader = new InputStreamReader(finstream);
                BufferedReader fbfreader = new BufferedReader(fisreader);
                
                OutputStream outstream = s.getOutputStream();
                OutputStreamWriter oswriter = new OutputStreamWriter(outstream);
                BufferedWriter bfwriter = new BufferedWriter(oswriter);
                PrintWriter pwriter = new PrintWriter(bfwriter);
 
                // o ma ji na i !
                pwriter.print("HTTP/1.0 200 OK\r\nContent-Type: text/html\r\n\r\n");
                do {
                    theLine = fbfreader.readLine();
                    if( theLine != null ) {
                        // sleep(100);
                        pwriter.println(theLine);
                        // pwriter.flush();
                    }
                } while( theLine != null );
                
                pwriter.flush();
                pwriter.close();
            }
        } catch (Exception e) {
            System.err.print(e);
        }
    }
    
    static void sleep(long msec) {
        try{
            Thread.sleep(msec);
        }catch(InterruptedException ie) {
        }
    }
}