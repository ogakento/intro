import java.util.Random;

class ArrayMethod {
    static public int sum(int[] x) {
        int s=0;
        for(int a: x){
            s+=a;
        }
        return s;
    }
    
    static public double ave(int[] x) {
        return (double)sum(x)/x.length;
    }

    static public void printArrayInfo(int[] x){
        int sumResult = sum(x);
        double aveResult = ave(x);
        for(int tmp: x){
            System.out.print(tmp + " ");
        }
        System.out.println();
        System.out.printf("sum=%d/ave=%.3f\n",sumResult,aveResult);
    }
    
    static public void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[9];
        for (int i=0;i<9;i++){
            a[i] = rand.nextInt(1000); //0-999
        }
        printArrayInfo(a);
    }
}
