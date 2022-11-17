package Homework1;

public class Task2 {
    public static void main(String[] args) {
        int result = findElement(new int[]{4, 4, 5, 5, 6});
        System.out.println(result);
    }

    public static int findElement(int arr[]) {
        int size = arr.length;

        if (size == 1 || size == 0) {
            return -1;
        }


        for (int i = 0; i < size; i += 2) {
            if (i == size - 1 || arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }

        return -1;
    }
// space complexity O(1)
// time complexity O(n)
}
