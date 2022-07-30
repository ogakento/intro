//TwoDimensionalArray
//２次元配列

class TwoDimensionalArray3 {
    static public void main(String[] args) {
        int[][] a = {
            {0, 1, 2, 3},
            {1, 2, 4, 6},
            {2, 4, 8, 16}
        };
        
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                System.out.print("a["+i+"]["+j+"] = "+a[i][j]+ " /");
            }
            System.out.println();
        }
    }
}
