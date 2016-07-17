import java.util.ArrayList;
import java.util.List;

/**
 * Created by majun on 16/7/17.
 */
public class Duplicate {
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        if (numbers == null || numbers.length <= 1 || numbers.length != length) {
            return false;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (list.contains(numbers[i])) {
                duplication[0] = numbers[i];
                return true;
            } else {
                list.add(numbers[i]);
            }
        }
        return false;
    }

    public boolean duplicate2(int numbers[], int length, int[] duplication) {
        if (numbers == null || numbers.length <= 1 || numbers.length != length) {
            return false;
        }
        for (int i = 0; i < numbers.length; i++) {
            while (numbers[i]!=i)
            {
                if (numbers[i]==numbers[numbers[i]])
                {
                    duplication[0]=numbers[i];
                    return true;
                }else {
                    int temp=numbers[i];
                    numbers[i]=numbers[numbers[i]];
                    numbers[numbers[i]]=temp;
                }
            }
        }
        return false;
    }
}
