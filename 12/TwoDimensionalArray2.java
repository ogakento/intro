//TwoDimensionalArray
//２次元配列

class TwoDimensionalArray2 {
    static public void main(String[] args) {
        int[][] a = new int[2][];
        a[0] = new int[3];
        a[1] = new int[2];
        for (int i=0; i<2; i++){
            for (int j=0; j<a[i].length; j++){
                a[i][j] = (i+1)*(j+1);
            }
        }
        for (int i=0; i<2; i++){
            for (int j=0; j<a[i].length; j++){
                System.out.print("a["+i+"]["+j+"] = "+a[i][j]+ " /");
            }
            System.out.println();
        }
    }
}
