import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by majun on 16/8/28.
 */
public class ConstructQueue {
    public void constructQueue() {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        while (k != 0) {
            k--;
            int n = scanner.nextInt();
            Queue<Integer> queue = new LinkedList<>();
            for (int i = n; i > 0; i--) {
                queue.offer(i);
                int temp = queue.peek();
                queue.poll();
                queue.offer(temp);
            }
            int[] num = new int[queue.size()];
            int m = 0;
            while (!queue.isEmpty()) {
                num[m] = queue.poll();
                m++;
            }
            for (int i = num.length - 1; i >= 0; i--) {
                if (i == 0) {
                    System.out.println(num[i]);
                } else {
                    System.out.print(num[i] + " ");
                }
            }
        }
    }
}
