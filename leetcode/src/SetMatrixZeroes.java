import java.util.ArrayList;
import java.util.List;

/**
 * Created by majun on 16/9/9.
 */
public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        int row = matrix.length;
        int column = matrix[0].length;
        List<Integer> rowList = new ArrayList<>();
        List<Integer> columnList = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] == 0) {
                    if (!rowList.contains(i)) {
                        rowList.add(i);
                    }
                    if (!columnList.contains(j)) {
                        columnList.add(j);
                    }
                }
            }
        }
        for (int i = 0; i < rowList.size(); i++) {
            for (int j = 0; j < column; j++) {
                matrix[rowList.get(i)][j] = 0;
            }
        }
        for (int i = 0; i < columnList.size(); i++) {
            for (int j = 0; j < row; j++) {
                matrix[j][columnList.get(i)] = 0;
            }
        }
    }
}
