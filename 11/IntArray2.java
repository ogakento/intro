class IntArray2{
  static public void main(String args[]){
    int[] a = new int[10];
    for (int i=0; i<a.length; i++){
      a[i] = i*i;
      System.out.printf("%2d  ",a[i]);
    }
    System.out.println();
    for (int i=1; i<a.length; i++){
      System.out.printf("  %2d",a[i]-a[i-1]);
    }
    System.out.println();
  }
}
