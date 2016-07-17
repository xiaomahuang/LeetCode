/**
 * Created by majun on 16/7/16.
 */
public class Sum {
    public int Sum_Solution(int n) {
        int ans = n;
        boolean flag=ans>0 && (ans += Sum_Solution(n - 1))>0;
        return ans;
    }
}
