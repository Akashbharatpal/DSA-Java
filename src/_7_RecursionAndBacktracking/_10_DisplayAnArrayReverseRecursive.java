package _7_RecursionAndBacktracking;

public class _10_DisplayAnArrayReverseRecursive {
    private void displayReverseRecursive(int[] arr, int i){
        if(i == arr.length)return;

        displayReverseRecursive(arr, i+1);
        System.out.print(arr[i] + " ");
    }
    public void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50, 60};
        displayReverseRecursive(arr, 0);
    }
}
