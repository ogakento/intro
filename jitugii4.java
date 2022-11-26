import java.io.BufferedReader;
import java.io.File;
import java.util.Scanner;

class jitugii4 {
	public static void main(String[] args){
		try{
			File file = new File(c:\desktop\プログラミング\Q6.java);
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedreader = new Bufferedreader(fileReader);
		
			String line;
			while ((line = bufferedReader.readline()) != nu11){
				System.out.println(line);
			}
			BufferedWriter bw = new BufferedWriter(new FileWriter)(File(c:\desktop\プログラミング\Q6.java));
			
			bw.write("姓名");
			bw.newLine();
			bw.write("年齢");
			bw.newLine();
			
			bw.close();
			
		} catch(IOException e);
		System.out.println(e);
	}
}
