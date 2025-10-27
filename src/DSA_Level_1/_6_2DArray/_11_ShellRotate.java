package DSA_Level_1._6_2DArray;

import java.util.Scanner;

public class _11_ShellRotate {
    private void setShell(int[][] arr, int s, int[] oneDShell){
        int rmn = s-1, cmn = s-1;
        int rmx = arr.length - s, cmx = arr.length - s;

        int k = 0; // iterator for res array;
        for(int i = rmn; i < rmx; i++)
            arr[i][cmn] = oneDShell[k++];

        for(int i = cmn; i < cmx; i++)
            arr[rmx][i] = oneDShell[k++];

        for(int i = rmx; i > rmn; i--)
            arr[i][cmx] = oneDShell[k++];

        for(int i = cmx; i > cmn; i--)
            arr[rmn][i] = oneDShell[k++];
    }

    private void reverse(int[] arr, int lo, int hi){
        while(lo < hi){
            int temp = arr[lo];
            arr[lo++] = arr[hi];
            arr[hi--] = temp;
        }
    }

    private void rotate(int[] arr, int r){
        r = r % arr.length;
        if(r < 0) r += arr.length;

        reverse(arr, 0, arr.length - r-1);
        reverse(arr, arr.length - r, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }

    private int[] getShell(int[][] arr, int s){
//        simplify this equation for size --> 4 * (arr.length - 2*(s-1)) - 4;
        int size = 4 * (arr.length - 2*s + 1);
        int[] res = new int[size];

        int rmn = s-1, cmn = s-1;
        int rmx = arr.length - s, cmx = arr.length - s;

        int k = 0; // iterator for res array;
        for(int i = rmn; i < rmx; i++)
            res[k++] = arr[i][cmn];

        for(int i = cmn; i < cmx; i++)
            res[k++] = arr[rmx][i];

        for(int i = rmx; i > rmn; i--)
            res[k++] = arr[i][cmx];

        for(int i = cmx; i > cmn; i--)
            res[k++] = arr[rmn][i];

        return res;
    }
    private void shellRotate(int[][] arr, int s, int r){
        int[] oneDShell = getShell(arr, s);
        rotate(oneDShell, r);
        setShell(arr, s, oneDShell);
    }

    public void main(String[] args){
        int[][] arr = {{11, 12, 13, 14, 15, 16, 17},
                {21, 22, 23, 24, 25, 26, 27},
                {31, 32, 33, 34, 35, 36, 37},
                {41, 42, 43, 44, 45, 46, 47},
                {51, 52, 53, 54, 55, 56, 57},
                {61, 62, 63, 64, 65, 66, 67},
                {71, 72, 73, 74, 75, 76, 77}};
        Scanner scn = new Scanner(System.in);
        int s = scn.nextInt(), r = scn.nextInt();
        shellRotate(arr, s, r);

        for(int[] row: arr){
            for(int ele: row)
                System.out.print(ele + " ");
            System.out.println();
        }
    }
}
