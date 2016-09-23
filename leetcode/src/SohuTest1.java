import java.util.Scanner;

/**
 * Created by majun on 16/9/21.
 */
public class SohuTest1 {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string = scanner.next();
            int n = scanner.nextInt();
            char[] cs = string.toCharArray();
            int[] nums = new int[cs.length - n];
            int numsIndex = 0;
            int index = 0;
            while (n != 0) {
                int max = cs[index] - '0';
                int record = index;
                for (int i = 0; i <= n; i++) {
                    if (max < cs[i + index] - '0') {
                        max = cs[i + index] - '0';
                        record = i + index;
                    }
                }
                nums[numsIndex++] = max;
                n -= (record - index);
                index = record + 1;
                if (numsIndex == nums.length) {
                    break;
                }
            }
            if (numsIndex != nums.length) {
                for (int i = index; i < cs.length; i++) {
                    nums[numsIndex++] = cs[i] - '0';
                }
            }
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < nums.length; i++) {
                builder.append(String.valueOf(nums[i]));
            }
            System.out.println(builder.toString());
        }
    }
}
