package NthNaturalNumber;

public class NthNaturalNumberGFG2 {
    // Function to find Nth number in base 9
    static long findNthNumber(long N)
    {
        // Stores the Nth number
        long result = 0;
        long p = 1;

        // Iterate while N is greater than 0
        while (N > 0) {
            // Update result
            result += (p * (N % 9));
            // Divide N by 9
            N = N / 9;
            // Multiply p by 10
            p = p * 10;
        }
        return result;
    }
    public static void main(String[] args)
    {
        int N = 18;
        System.out.print(findNthNumber(N));
    }
}
