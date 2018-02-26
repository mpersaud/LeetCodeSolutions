package MakeChange;

public class Solution {
    static long getWays(long n, long[] c) {
        // Complete this function
        long[] comb = new long[(int) (n + 1)];
        comb[0] = 1;
        for (long coin : c) {
            for (long i = 0; i < comb.length; i++) {
                if (i >= coin)
                    comb[(int) i] += comb[(int) (i - coin)];
            }
        }
        return comb[(int) n];
    }
}
