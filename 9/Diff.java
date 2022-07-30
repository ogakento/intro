import java.util.Scanner;
class Diff{
  static public void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("a:"); int a = sc.nextInt();
    System.out.print("b:"); int b = sc.nextInt();
    if (a == b){
      System.out.println("a=bです");
    } else if (a < b){
      System.out.println("a<bです");
    } else {
      System.out.println("a>bです");
    }
  }
}
