/**
 * Created by majun on 16/9/7.
 */
public class LongestIncreasingSubsequence {
    int length = 0;

    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            helper(nums, i, 1);
        }
        return length;
    }

    public void helper(int[] nums, int index, int count) {
        if (nums.length == index) {
            if (count > length) {
                length = count;
            }
            return;
        }
        for (int i = index + 1; i < nums.length; i++) {
            if (nums[i] > nums[index]) {
                helper(nums, i, count + 1);
            }
        }
        if (count > length) {
            length = count;
        }
    }

    public int lengthOfLIS1(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int max = 0, i = 0, j = 0, cur = 0;
        int[] memo = new int[nums.length];
        for(i = 0; i < memo.length; i++) {
            memo[i] = 1;
        }
        for(i = nums.length - 1; i >= 0; i--) {
            cur = 0;
            for(j = i; j < nums.length; j++) {
                if (nums[i] < nums[j] && (cur == 0 || cur < memo[j])) {
                    memo[i] = memo[j] + 1;
                    cur = memo[j];
                }
            }
        }
        for (i = 0; i < memo.length; i++) {
            if(memo[i] > max) {
                max = memo[i];
            }
        }
        return max;
    }
}
