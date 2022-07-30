import java.util.Random;
import java.util.Scanner;
class Finger2{
  static public void main(String args[]){
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    System.out.print("何を出しますか(0:グー　1:チョキ　2:パー)?");
    int u = sc.nextInt();
    String msg1 = "";
    switch(u){
      case 0: msg1 = "グー";  break;
      case 1: msg1 = "チョキ"; break;
      case 2: msg1 = "パー";  break;
    }
    System.out.println("あなたの手："+msg1);
    int c = rand.nextInt(3);
    String msg2 = "";
    switch(c){
      case 0: msg2 = "グー";  break;
      case 1: msg2 = "チョキ"; break;
      case 2: msg2 = "パー";  break;
    }
    System.out.println("コンピュータの手："+msg2);
    if ((c-u+3) % 3 == 0){
      System.out.println("勝敗：あいこ　です");
    } else if ((c-u+3) % 3 == 1){
      System.out.println("勝敗：あなたの勝ちです");
    } else {
      System.out.println("勝敗：コンピュータの勝ちです");
    }
  }
}
