import java.util.Scanner;
class TriangleArea {
  static public void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("底辺:");
    double width = sc.nextDouble();
    System.out.print("高さ:");
    double height = sc.nextDouble();
    System.out.println("面積は"+(width*height)/2+"です");
  }
}
