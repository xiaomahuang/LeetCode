import java.util.Scanner;

/**
 * Created by majun on 16/8/27.
 */
public class Shuffle {
    public void shuffle() {
        Scanner reader = new Scanner(System.in);
        while (reader.hasNextInt()) {
            int T = reader.nextInt();
            for (int i = 0; i < T; i++) {
                int n = reader.nextInt();
                int k = reader.nextInt();
                int[] nums = new int[2 * n];
                for (int j = 0; j < 2 * n; j++) {
                    nums[j] = reader.nextInt();
                }
                solveProblem(nums, k, 2 * n);
                for (int j = 0; j < 2 * n; j++) {
                    System.out.print(nums[j]);
                    if (j != 2 * n - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    public void solveProblem(int[] nums, int k, int n) {
        while (k != 0) {
            int[] temps = new int[n];
            int j = 0;
            for (int i = 0; i < n / 2; i++) {
                temps[j++] = nums[i];
                temps[j++] = nums[n / 2 + i];
            }
            for (int i = 0; i < n; i++) {
                nums[i] = temps[i];
            }
            k--;
        }
    }
}
