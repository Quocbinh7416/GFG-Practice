package TrailingZeroInFactorial;

public class TrailingZeroInFactorial {
    /*
    1st Solution, 2 loop
     */
//    static int trailingZeroes(int N){
//        // Write your code here
//        long factorial = 1;
//        for(int i = 1; i<=N; i++){
//            factorial *= i;
//        }
//        int a = 0;
//        while (factorial % 10 == 0) {
//            a++;
//            factorial /= 10;
//        }
//        return a;
//    }
    static int trailingZeroes(int N){
        if(N<0)
            return -1;
        int count = 0;
        for(int i = 5; N/i >= 1; i*=5){
            count += N/i;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(trailingZeroes(10));
    }
}
