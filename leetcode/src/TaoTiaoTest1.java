import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by majun on 16/9/21.
 */
public class TaoTiaoTest1 {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
            Arrays.sort(nums);
            int count = 0;
            int pre = 0;
            boolean continueAdd = true;
            for (int i = 1; i < nums.length; i++) {
                if (!continueAdd) {
                    pre = i;
                    continueAdd = true;
                    continue;
                }
                if (i - pre == 1 && nums[i] - nums[pre] <= 10) {

                } else if (i - pre == 1 && nums[i] - nums[pre] <= 20) {
                    continueAdd = false;
                    count++;
                } else if (i - pre == 1 && nums[i] - nums[pre] > 20) {
                    pre = i;
                    count++;
                    count++;
                } else if (i - pre == 2 && nums[i] - nums[pre] > 10) {
                    pre = i;
                    count++;
                } else {
                    continueAdd = false;
                }
            }
            count += 3 - (n - pre);
            System.out.println(count);
        }
    }
}
