import java.util.ArrayList;
import java.util.List;

/**
 * Created by majun on 2016/6/22.
 */
public class HasPath {

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        List<Integer> integers = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || rows <= 0 || cols <= 0) {
            return false;
        }
        if (str == null || str.length == 0) {
            return true;
        }
        boolean result = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result = result || getResult(matrix, i, j, rows, cols, str, 0,integers);
            }
        }
        return result;
    }

    public boolean getResult(char[] matrix, int i, int j, int rows, int cols, char[] str, int index,List<Integer> integers) {
        if (i > rows - 1 || i < 0 || j > cols - 1 || j < 0||integers.contains(i * cols + j)) {
            return false;
        }
        List<Integer> integers1 = new ArrayList<>(integers);
        if (matrix[i * cols + j] == str[index]) {
            integers1.add(i * cols + j);
            if (index == str.length - 1) {
                return true;
            }
            return getResult(matrix, i + 1, j, rows, cols, str, index + 1,integers1) || getResult(matrix, i - 1, j, rows, cols, str, index + 1,integers1) || getResult(matrix, i, j + 1, rows, cols, str, index + 1,integers1) || getResult(matrix, i, j - 1, rows, cols, str, index + 1,integers1);
        } else {
            return false;
        }
    }
}
