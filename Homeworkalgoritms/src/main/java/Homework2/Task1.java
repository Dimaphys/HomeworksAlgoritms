package Homework2;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 12, 32, 45, 65,444};
        System.out.println(binarySearch(arr, 444));

    }

    private static int binarySearch(int[] sortedArr, int key) {
        return midleElement(sortedArr, 0, sortedArr.length, key);
    }

    private static int midleElement(int[] sortedArr, int begin, int end, int key) {
        int length = end - begin;
        if (length == 1) {
            return sortedArr[begin] == key ? begin : -1;
        } else if (length > 1) {
            int midNum = length / 2 + begin;
            int midElem = sortedArr[midNum];
            if (midElem == key) {
                return midNum;
            } else if (midElem < key) {
                return midleElement(sortedArr, midNum + 1, end, key);
            } else {
                return midleElement(sortedArr, begin, midNum, key);

            }
        }
        return -1;
    }
}


//    Провести ассимптотический анализ для каждой функции.
//        Написать time complexity  и space complexity
//1) function test1(n)
//        {
//        if (n==1)
//        return;
//        for (i=1; i<=n; i++)
//        for (j=n; j>=1; j--)
//        console.out("*");
//        }
//        time O(n) = n^2
//        space = 2
//
//
//        2) function test2( n)
//        {
//        let a = 0;
//        for (i = 0; i < n; i++)
//        for (j = n; j > i; j--)
//        a = a + i + j;
//
//        }
//        time O(n) = n^2
//        space = 3
//
//
//        3) function test3( n)
//        {
//        let i, j, a = 0;
//        for (i = n/2; i <=n; i++)
//        for (j = 2; j <=n; j=j*2)
//        a=a+n/2;
//
//        }
//          time O(n) =n * log n
//          space = 3
//
//
//        Задачка со звёздочкой
//        *
//        4)function test4( n)
//        {
//        let a = 0, i = n;
//        while (i > 0) {
//        a += i;
//        i /= 2;
//        }
//        }
//         O(n) = infinity
//
