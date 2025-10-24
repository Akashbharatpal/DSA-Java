/*
* You are given a 2D array of size n*n
* You are required to find the saddle point of the matrix which is defined as the value which is smallest in its row but largest in its column.
* */
package _6_2DArray;

public class _9_SaddlePoint {
    public void main(String[] args){
        int[][] mat = {{11, 12, 13, 14},
                       {21, 22, 23, 24},
                       {31, 32, 33, 34},
                       {41, 42, 43, 44}};

        for (int[] value : mat) {
            int mi = 0;
            for (int j = 0; j < mat[0].length; j++)
                if (value[j] < value[mi])
                    mi = j;

            boolean flag = true;
            for (int[] ints : mat) {
                if (ints[mi] > value[mi]) {
                    flag = false;
                    break;
                }
            }
            if(flag)
                System.out.print(value[mi]);
        }
    }
}
