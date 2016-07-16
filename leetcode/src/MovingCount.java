import java.util.ArrayList;
import java.util.List;

/**
 * Created by majun on 2016/6/25.
 */
public class MovingCount {
    public int movingCount(int threshold, int rows, int cols) {
        List<Integer> integers = new ArrayList<>();
        if (threshold < 0 || rows <= 0 || cols <= 0) {
            return 0;
        }
        getResult(threshold, rows, cols, 0, 0, integers);
        return integers.size();
    }

    public void getResult(int threshold, int rows, int cols, int i, int j, List<Integer> list) {
        if (i > rows - 1 || i < 0 || j > cols - 1 || j < 0 || list.contains(i * cols + j)) {
            return;
        }
        if ((getNum(i) + getNum(j)) <= threshold) {
            list.add(i * cols + j);
            getResult(threshold, rows, cols, i + 1, j, list);
            getResult(threshold, rows, cols, i, j + 1, list);
            getResult(threshold, rows, cols, i - 1, j, list);
            getResult(threshold, rows, cols, i, j - 1, list);

        }
    }

    public int getNum(int num) {
        int count = 0;
        while (num != 0) {
            count += (num % 10);
            num /= 10;
        }
        return count;
    }
}
