import java.util.Scanner;

/**
 * Created by majun on 16/9/1.
 */
public class LadderProblem {
    public void LadderProblem() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int[][] nums = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    nums[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    getLength(nums, m, n, i, j, 0);
                }
            }
            System.out.println(length + 1);
        }
    }

    static int length = 0;

    public void getLength(int[][] nums, int m, int n, int x, int y, int count) {
        if (length < count) {
            length = count;
        }
        if (y > 0 && nums[x][y] > nums[x][y - 1]) {
            getLength(nums, m, n, x, y - 1, count + 1);
        }
        if (x > 0 && nums[x][y] > nums[x - 1][y]) {
            getLength(nums, m, n, x - 1, y, count + 1);
        }
        if (y < n - 1 && nums[x][y] > nums[x][y + 1]) {
            getLength(nums, m, n, x, y + 1, count + 1);
        }
        if (x < m - 1 && nums[x][y] > nums[x + 1][y]) {
            getLength(nums, m, n, x + 1, y, count + 1);
        }
    }
}
