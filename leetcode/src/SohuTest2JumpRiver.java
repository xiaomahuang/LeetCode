import java.util.Scanner;

/**
 * Created by majun on 16/9/21.
 */
public class SohuTest2JumpRiver {
    int sum = Integer.MAX_VALUE;

    public void test() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
            helper(nums, 0, 0);
            if (sum == Integer.MAX_VALUE) {
                System.out.println("-1");
            } else {
                System.out.println(sum);
            }
        }
    }

    public void helper(int[] nums, int index, int count) {
        if (index >= nums.length) {
            if (count < sum) {
                sum = count;
            }
            return;
        }
        for (int i = 1; i <= nums[index]; i++) {
            helper(nums, index + i, count + 1);
        }
    }
}
