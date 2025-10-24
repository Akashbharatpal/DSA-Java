package _7_RecursionAndBacktracking;

public class _9_DisplayAnArrayRecursive {
    private void displayRecursive(int[] arr, int i){
        if(i == arr.length) return;

        System.out.print(arr[i] + " ");
        displayRecursive(arr, i+1);
    }

    public void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50, 60};
        displayRecursive(arr, 0);
    }
}
