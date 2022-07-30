import java.util.Random;

class IntMinMax10{
    static public void main(String args[]) {
        Random rand = new Random();
        int[] a = new int[10];
        int max = -1; int min = 1000;
        for (int i=0; i < a.length; i++) {
            a[i] = rand.nextInt(1000);
        }
        for (int i=0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            } else if (max < a[i]) {
                max = a[i];
            }
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("max: "+ max + "  min: "+ min );
    }
}
