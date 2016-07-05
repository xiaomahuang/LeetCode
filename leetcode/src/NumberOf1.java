/**
 * Created by majun on 2016/6/30.
 */
public class NumberOf1 {
    public int  numberOf1(int n) {
        int i=0;
        int count=0;
        if(n==0)
        {
            return 0;
        }
        if (n<0)
        {
            n=-n;
            count+=1;
            n=Integer.MAX_VALUE-n;
        }
        while (Math.pow(2,i)<=n)
        {
            if (((int)Math.pow(2,i)&n)>0)
            {
                count++;
            }
            i++;
        }
        return count;
    }
}
