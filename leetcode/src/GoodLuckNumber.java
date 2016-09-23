import java.util.Scanner;
//战争游戏的至关重要环节就要到来了，这次的结果将决定王国的生死存亡，小B负责首都的防卫工作。首都处于一个四面环山的盆地中，周围的n个小山构成一个环，作为预警措施，小B计划在每个小山上设置一个观察哨，日夜不停的瞭望周围发生的情况。
//一旦发生外敌入侵事件，山顶上的岗哨将点燃烽烟。若两个岗哨所在的山峰之间没有更高的山峰遮挡且两者之间有相连通路，则岗哨可以观察到另一个山峰上的烽烟是否点燃。由于小山处于环上，任意两个小山之间存在两个不同的连接通路。满足上述不遮挡的条件下，一座山峰上岗哨点燃的烽烟至少可以通过一条通路被另一端观察到。对于任意相邻的岗哨，一端的岗哨一定可以发现一端点燃的烽烟。
//        小B设计的这种保卫方案的一个重要特性是能够观测到对方烽烟的岗哨对的数量，她希望你能够帮她解决这个问题。

//5
//1 2 4 5 3


//4和7是两个幸运数字，我们定义，十进制表示中，每一位只有4和7两个数的正整数都是幸运数字。前几个幸运数字为：4,7,44,47,74,77,444,447...
//现在输入一个数字K，输出第K个幸运数。
/**
 * Created by majun on 16/9/5.
 */
public class GoodLuckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < nums.length; i++) {
                helper(scanner.nextInt());
            }
        }
    }

    public static void helper(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        double sum = Math.pow(2, count);
        while (num > sum) {
            count++;
            sum += Math.pow(2, count);
        }
        sum -= Math.pow(2, count);
        num = num - (int) sum - 1;
        for (int i = count - 1; i >= 0; i--) {
            if ((num & (int) Math.pow(2, i)) != 0) {
                stringBuilder.append('7');
            } else {
                stringBuilder.append('4');
            }
        }
        System.out.println(stringBuilder.toString());
    }

}
