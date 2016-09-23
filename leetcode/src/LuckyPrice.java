
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//猿题库算法题
//输入价格price,不能包含nums中的数字,并且price只能比原来的数字要大

/**
 * Created by majun on 16/9/6.
 */
public class LuckyPrice {
    public int getLuckyPrice(int price, int[] nums) {
        int num = 0;
        Arrays.sort(nums);
        List<Integer> unLuckylist = new ArrayList<>();
        unLuckylist.add(0);
        for (int i = 0; i < nums.length; i++) {
            unLuckylist.add(nums[i]);
        }
        List<Integer> list = new ArrayList<>();
        while (price != 0) {
            list.add(price % 10);
            price /= 10;
        }
        list.add(0);
        int count = 0;
        while (!list.isEmpty()) {
            if (list.size() == 1 && list.get(0) == 0) {
                break;
            }
            if (unLuckylist.contains(list.get(0))) {
                int index = unLuckylist.indexOf(list.get(0));
                int temp = unLuckylist.get(index);
                while (unLuckylist.contains(temp)) {
                    if (temp == 9) {
                        temp = 1;
                        int a = list.get(1);
                        list.set(1, a + 1);
                    } else {
                        temp++;
                    }
                }
                num += temp * Math.pow(10, count);
            }
            list.remove(0);
            count++;
        }
        return num;
    }
}