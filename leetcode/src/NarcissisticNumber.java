import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by majun on 16/8/28.
 */
public class NarcissisticNumber {
    public void narcissisticNumber() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = n; i <= m; i++) {
                if (getNum(i) == i) {
                    list.add(i);
                }
            }
            if (list.isEmpty()) {
                System.out.println("no");
            } else {
                Iterator<Integer> iterator = list.iterator();

                while (iterator.hasNext()) {
                    System.out.print(iterator.next());
                    if (iterator.hasNext()) {
                        System.out.print(" ");
                    } else {
                        System.out.println();
                    }
                }
            }
        }
    }

    private int getNum(int n) {
        int count = 0;
        while (n != 0) {
            count += Math.pow(n % 10, 3);
            n = n / 10;
        }
        return count;
    }
}
