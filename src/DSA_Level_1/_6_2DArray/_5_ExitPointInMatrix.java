/*
* You are given a matrix of size r*c with 0 and 1 elements.
* where you will traverse in east direction starting from 0,0 whenever you encounter 1 then you take a right turn. and continue travelling until you find another 1, or you don't exit
* the moment you exit the matrix then you have to print the co-ordinates.
* */
package DSA_Level_1._6_2DArray;

public class _5_ExitPointInMatrix {
    public void main(String[] args){
        int[][] mat = {{0, 0, 1, 0},
                       {1, 0, 0, 1},
                       {0, 0, 0, 1},
                       {1, 0, 1, 0}};

        int i=0, j=0, dir=0;
        while(true){
            dir += mat[i][j];
            switch (dir % 4){
                case 0:
                    j++;
                    break;
                case 1:
                    i++;
                    break;
                case 2:
                    j--;
                    break;
                case 3:
                    i--;
                    break;
            }

            if(i < 0){ i++; break;}
            else if(i >= mat.length) {i--; break;}
            else if(j < 0) { j++; break;}
            else if(j >= mat[0].length) { j--; break;}
        }
        System.out.print("("+ i + ", " + j +")");
    }
}
