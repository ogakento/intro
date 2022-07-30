import java.util.Scanner;
class SumAveNM{
  static public void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("m:"); int m = sc.nextInt();
    System.out.print("n:"); int n = sc.nextInt();
    for (int i=0; i<m; i++){
    double j,sum=0;
      for (j=0; j<n; j++){
        int a = sc.nextInt();
        sum += a;
      }
      System.out.println("sum:"+sum);
      if (j != 0)
      System.out.println("ave:"+sum/j);
    }
    System.out.println();
  }
}
