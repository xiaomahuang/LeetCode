import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by majun on 16/8/28.
 * 网易
 */
public class MixedPigments {
    public void mixed() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(scanner.nextInt());
            }
            Collections.sort(list);
            int bigMax=list.size()-1;
            int bigSecond=bigMax-1;
            int result=0;
            while (list.size()>2)
            {
                if (getLength(list.get(bigMax))==getLength(list.get(bigSecond)))
                {
                    int temp=list.get(bigMax)^list.get(bigSecond);
                    if (!list.contains(temp))
                    {
                        list.add(temp);
                        Collections.sort(list);
                        bigMax=list.size()-1;
                        bigSecond=bigMax-1;
                    }
                }else {
                    result++;
                }
                list.remove(bigMax);
                bigMax=bigSecond;
                bigSecond--;
            }
            System.out.println(result+2);
        }
    }

    public int getLength(int n){
        int count=0;
        while (n>0)
        {
            count++;
            n=n>>1;
        }
        return count;
    }
}
