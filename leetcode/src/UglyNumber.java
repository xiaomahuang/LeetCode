/**
 * Created by majun on 16/9/6.
 */
public class UglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        if (primes == null || primes.length == 0 || n <= 0) {
            return 0;
        }
        int[] uglyNumber = new int[n];
        uglyNumber[0]=1;
        int index = 1;
        int[] nums = new int[primes.length];
        while (index < n) {
            uglyNumber[index] = getMin(uglyNumber, nums, primes);
            for (int i = 0; i < primes.length; i++) {
                while (uglyNumber[index] >= uglyNumber[nums[i]] * primes[i]) {
                    nums[i]++;
                }
            }
            index++;
        }
        return uglyNumber[n-1];
    }

    public int getMin(int[] uglyNumber, int[] nums, int[] primes) {
        int num = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (uglyNumber[nums[i]] * primes[i] < num) {
                num = uglyNumber[nums[i]] * primes[i];
            }
        }
        return num;
    }
}
