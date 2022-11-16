package Homework1;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {12,23,43,554,64,25,67};
    revert(arr);

    System.out.println(Arrays.toString(arr));
    }
    private static void revert(int arr[]){
        for (int i = 0; i < arr.length/2; i++) {
            int last = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i];
            arr[i] = last;
        }
    }
}
