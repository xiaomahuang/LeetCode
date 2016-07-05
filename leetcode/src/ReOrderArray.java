import java.util.ArrayList;
import java.util.List;

/**
 * Created by majun on 2016/6/30.
 */
public class ReOrderArray {
    public void reOrderArray(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (isEven(array[i])) {
                list2.add(array[i]);
            } else {
                list1.add(array[i]);
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            array[i] = list1.get(i);
        }
        for (int i = 0; i < list2.size(); i++) {
            array[list1.size() + i] = list2.get(i);
        }
    }

    public boolean isEven(int num) {
        if (num % 2 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
