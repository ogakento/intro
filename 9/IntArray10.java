class IntArray10 {
    static public void main(String[] args) {
        int[] a = {10, 8, 6, 4, 2, 0};

        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
        for (int v: a) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
