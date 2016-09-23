import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by majun on 16/9/5.
 */
public class LuckyBag {
    int number = 0;

    public void solution() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            number = 0;
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
            Arrays.sort(nums);
            helper(nums, 0, 0, 1);
            System.out.println(number);
        }
    }

    public void helper(int[] nums, int index, int sum, int mul) {
        for (int i=index;i<nums.length;i++)
        {
            sum+=nums[i];
            mul*=nums[i];
            if (sum>mul)
            {
                number+=1;
                helper(nums,i+1,sum,mul);
            }else if (nums[i]==1)
            {
                helper(nums,i+1,sum,mul);
            }else {
                break;
            }
            sum-=nums[i];
            mul/=nums[i];
            while (i<nums.length-1&&nums[i]==nums[i+1]){
                i++;
            }
        }
    }
}
