//TwoDimensionalArray
//２次元配列

class TwoDimensionalArray1 {
    static public void main(String[] args) {
        int[][] a = new int[2][3];
        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                a[i][j] = (i+1)*(j+1);
            }
        }
        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                System.out.print("a["+i+"]["+j+"] = "+a[i][j]+ " /");
            }
            System.out.println();
        }
    }
}
