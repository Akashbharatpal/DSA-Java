/*
* You are given a sorted array of size n;
* You are given a number d
* ceil is defined as value in array which is just greater than or equal to d
* floor is defined as value in array which is just lesser than or equal to d
* */
package DSA_Level_1._4_Array;

import java.util.Scanner;

public class _12_CeilAndFloor {
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int d = scn.nextInt();

        int floor = arr.length - 1, ceil = 0;
        while(ceil <= floor){
            int mid = (floor + ceil)/2;
            if(arr[mid] < d)
                ceil = mid + 1;
            else if(arr[mid] > d)
                floor = mid - 1;
            else{
                System.out.println("ceil: " + arr[mid]);
                System.out.println("floor: "+ arr[mid]);
                return;
            }
        }
        System.out.println("ceil: "+ arr[ceil]);
        System.out.println("floor: "+ arr[floor]);
    }
}
