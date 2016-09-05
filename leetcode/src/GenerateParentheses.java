import java.util.ArrayList;
import java.util.List;

/**
 * Created by majun on 16/9/1.
 */
public class GenerateParentheses {
    List<String> list = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        if (n <= 0) {
            return null;
        }
        int[] ints = new int[2 * n];
        ints[0] = 1;
        getList(ints, 0, 1, n);
        return list;
    }

    public void getList(int[] ints, int index, int count, int n) {
        if (count == n) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < 2 * n; i++) {
                if (ints[i] == 1) {
                    builder.append('(');
                } else {
                    builder.append(')');
                }
            }
            list.add(builder.toString());
            return;
        }
        for (int i = index + 1; i <= (index + count + 1); i++) {
            ints[i] = 1;
            getList(ints, i, count + 1, n);
        }
    }
}
