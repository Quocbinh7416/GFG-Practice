package MissingNumberInArray;

/**
 * Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.
 * Example 1:
 * Input:
 * N = 5
 * A[] = {1,2,3,5}
 * Output: 4
 */

public class MissingNumberInArray {
    public static int MissingNumber(int array[], int n) {
        int a = n*(n+1)/2;
        int b = 0, c;
        for(int i = 0; i < array.length; i++){
            b += array[i];
        }
        c = a - b;
        return c;
    }
    public static void main(String[] args) {
        int array[] = new int[]{1,2,3,5};
        int n = 5;
        System.out.println(MissingNumber(array , n));
    }
}




