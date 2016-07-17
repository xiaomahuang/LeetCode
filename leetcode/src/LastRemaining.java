import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import java.util.ArrayList;
/**
 * Created by majun on 16/7/16.
 */
public class LastRemaining {
    public int LastRemaining_Solution(int n, int m) {
        if (n <= 0 || m < 0) {
            return -1;
        }
        int[] ints=new int[n];
        int sum=n;
        int start=-1;
        int step=0;
        while (sum>0)
        {
            start++;
            if (start>=n)
            {
                start=0;
            }
            if (ints[start]==-1)
            {
                continue;
            }
            step++;
            if (step==m)
            {
                ints[start]=-1;step=0;
                sum--;
            }
        }
        return start;
    }
}
