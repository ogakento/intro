import java.util.Scanner;

class SumAveNM2{
  static public void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("m:"); int m = sc.nextInt();
    System.out.print("n:"); int n = sc.nextInt();
    for (int i=0; i<m; i++){
    int j,sum=0;
      for (j=0; j<n; j++){
        int a = sc.nextInt();
        sum +=(double)a;
      }
      System.out.printf("sum:%.1f¥n",sum);
      System.out.println();
      if (j != 0)
      System.out.printf("ave:%.1f¥n",sum/j);
      System.out.println();
    }
    System.out.println();
  }
}
