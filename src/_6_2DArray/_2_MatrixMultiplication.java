/*
 * If 2 arrays representing 2 matrices of dimension r1 X c1 and r2 X c2 can be multiplied, display the contents of product array
 * If 2 arrays can't be multiplied then print "Invalid output"
 * */
package _6_2DArray;

public class _2_MatrixMultiplication {
    private int[][] matrixMultiplication(int[][] mat1, int[][] mat2){
        if(mat1[0].length != mat2.length){
            System.out.println("Invalid Output");
            return new int[][] {{0}};
        }

        int[][] res = new int[mat1.length][mat2[0].length];

        for(int i=0; i < res.length; i++){
            for(int j=0; j< res[0].length; j++){
                for(int k=0; k<mat2.length; k++)
                    res[i][j] += mat1[i][k] * mat2[k][j];
            }
        }
        return res;
    }

    public void main(String[] args) {
        int[][] mat1 = {{-5, 0, 6},
                        {5, -1, 1},
                        {2, -1, -6}};

        int[][] mat2 = {{0, -1},
                        {-3, -3},
                        {-2, -4}};

        int[][] res = matrixMultiplication(mat1, mat2);

        for(int[] row: res){
            for(int ele: row) System.out.print(ele + "\t");
            System.out.println();
        }

    }
}
