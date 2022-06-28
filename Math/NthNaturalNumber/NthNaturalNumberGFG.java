package NthNaturalNumber;

public class NthNaturalNumberGFG {
    static long findNth(long N)
    {
        long count = 0;
        for(int i = 1; i > 0; i++ ){
            // call function digitnine() with i
            if(isDigitNine(i) == false)
            {
                count ++;
                if(count == N ) {
                    count = i; // once  count is equal to N then
                    break;    //assign last i to count and break the loop
                }
            }
        }
        return count ;
    }
    // isDigitNine function return true if number contain digit 9
    // else will return false
    static boolean isDigitNine(int i){
        while(i > 0){
            int rem = i % 10;
            if(rem == 9){
                return true;
            }
            i = i / 10;
        }
        return false;
    }
    public static void main(String[] args) {
        long N = 18;
        long ans = findNth(N);
        System.out.println(ans);

    }
}
