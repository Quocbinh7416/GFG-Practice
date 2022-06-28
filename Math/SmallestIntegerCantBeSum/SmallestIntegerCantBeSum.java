package SmallestIntegerCantBeSum;

import java.util.Arrays;

public class SmallestIntegerCantBeSum {
     static class Solution {
        long smallestPositive(long[] array, int n) {
            Arrays.sort(array);
            long result = 1;
            for(int i = 0; i < n; i++){
                if(array[i] > result){
                    return result;
                }
                result += array[i];
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        long[] array = new long[]{34, 1, 92, 10, 3, 25, 90, 97, 49, 3, 67, 66, 50, 30, 7, 4, 96, 12, 81, 10, 1, 16, 86, 80, 89, 77,
                50, 23, 49, 80, 56, 70, 75, 81, 88, 1, 73, 45, 76, 57, 81, 79, 59, 63, 40, 7, 33, 19, 24};
        int n = 49;
        System.out.println(solution.smallestPositive(array, n));
    }
}
