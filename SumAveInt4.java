import java.util.Scanner;
class SumAveInt4{
  static public void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("a:"); int a = sc.nextInt();
    System.out.print("b:"); int b = sc.nextInt();
    System.out.print("c:"); int c = sc.nextInt();
    System.out.print("d:"); int d = sc.nextInt();
    System.out.println("合計:"+(a+b+c+d));
    System.out.println("平均:"+(a+b+c+d)/4);
  }
}
