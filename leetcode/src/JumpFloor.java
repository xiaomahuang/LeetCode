/**
 * Created by majun on 2016/6/29.
 */
public class JumpFloor {
    //一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法
    public int jumpFloor(int target) {
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        int[] ints = new int[target];
        ints[0] = 1;
        ints[1] = 2;
        for (int i = 2; i < target; i++) {
            ints[i] = ints[i - 1] + ints[i - 2];
        }
        return ints[target - 1];
    }


    //一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
    public int jumpFloorII(int target) {

        if (target == 1) {
            return 1;
        }
        int jumpCount = 1;
        for (int i = 1; i < target; i++) {
            jumpCount += jumpFloorII(i);
        }
        return jumpCount;
    }

    //我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
    public int rectCover(int target) {
        if (target <= 2) {
            return target;
        }
        int[] ints = new int[target];
        ints[0] = 1;
        ints[1] = 2;
        for (int i = 2; i < target; i++) {
            ints[i] = ints[i - 1] + ints[i - 2];
        }
        return ints[target - 1];
    }
}
