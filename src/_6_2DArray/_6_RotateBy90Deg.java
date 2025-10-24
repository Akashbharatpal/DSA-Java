package _6_2DArray;

public class _6_RotateBy90Deg {
    public void main(String[] args){
        int[][] mat = {{11, 12, 13, 14},
                       {21, 22, 23, 24},
                       {31, 32, 33, 34},
                       {41, 42, 43, 44}};
/*          algorithm:
            1. take a transpose of this matrix
            2. flip the matrix around the mid-axis.
*/
//        transpose
        for(int i=0; i<mat.length; i++) {
            for (int j = i + 1; j < mat[0].length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

//        flip it
       for(int j=0; j< mat[0].length/2; j++){
           for(int i=0; i<mat.length; i++){
               int temp = mat[i][j];
               mat[i][j] = mat[i][mat[0].length - j - 1];
               mat[i][mat[0].length - j - 1] = temp;
           }
       }

       for(int[] row: mat){
           for(int ele: row)
               System.out.print(ele + " ");
           System.out.println();
       }

    }
}
