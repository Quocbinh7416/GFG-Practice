package NthNaturalNumber;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Given a positive integer N. You have to find Nth natural number after removing all the numbers containing digit 9.
 * <p>
 * Example 1:
 * Input:
 * N = 8
 * Output:
 * 8
 * Explanation:
 * After removing natural numbers which contains digit 9, first 8 numbers are 1,2,3,4,5,6,7,8 and 8th number is 8.
 * <p>
 * Example 2:
 * Input:
 * N = 9
 * Output:
 * 10
 * Explanation:
 * After removing natural numbers which contains digit 9, first 9 numbers are 1,2,3,4,5,6,7,8,10 and 9th number is 10.
 */
public class NthNaturalNumber {
    static long findNth(long N) {
        //TODO: need to complete
        int count = 0;
        for (int i = 1; i > 0; i++) {
            if (hasNine((long) i) == false) {
                count++;
                if (count == N) {
                    count = i;
                    break;
                }
            }
        }
        return count;
    }

    //    static boolean hasNine(long N){
//        long rem;
//        while (N>0){
//            rem = N % 10;
//            if(rem == 9){
//                return true;
//            }
//            N /= 10;
//        }
//        return false;
//    }
    static boolean hasNine(Long N) {
        String newString = N.toString();
        if (newString.indexOf("9") >= 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(findNth(18));
    }
}
