import java.util.Scanner;
class Greater{
  static public void main (String arg[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("1つ目の値:");
    double a = sc.nextDouble();
    System.out.print("2つ目の値:");
    double b = sc.nextDouble();
    if (a==b){
      System.out.println(a+"(等しい値です)");
    }else if (a>b){
      System.out.println(a+"(1つ目のほうが大きい値です)");
    }else {
      System.out.println(b+"(2つ目のほうが大きい値です)");
    }
  }
}
