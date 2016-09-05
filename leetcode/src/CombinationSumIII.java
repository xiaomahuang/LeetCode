import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majun on 16/9/1.
 */
public class CombinationSumIII {
    List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        if (k <= 0 || n <= 0) {
            return lists;
        }
        List<Integer> list = new ArrayList<>();
        getLists(list, k, 0, n, 0, 0);
        return lists;
    }

    public void getLists(List<Integer> list, int k, int index, int n, int sum, int count) {
        if (count == k) {
            if (sum == n) {
                lists.add(list);
            }
            return;
        }
        for (int i = index + 1; i < 10 ; i++) {
            List<Integer> tempList = new ArrayList<>(list);
            tempList.add(i);
            getLists(tempList, k, i, n, sum + i, count + 1);
        }
    }
}
