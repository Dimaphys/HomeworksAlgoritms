package Homework1;

public class Task1 {
    public static void main(String[] args) {
        int result = linearSearch(new int[]{1,34,43,1,2,-1,-45},43);
        System.out.println(result);
    }
    // space complexity O(1)
    // time complexity O(n)
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {  // traverse the array
            if (arr[i] == key) { // match the key element with array element
                return i; // return index
            }
        }
        return -1; // not found element
    }
}
