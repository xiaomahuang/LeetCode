import java.util.ArrayList;

/**
 * Created by majun on 2016/6/21.
 */
public class MaxInWindows {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> lists=new ArrayList<>();
        if(num==null||num.length==0||size<=0)
        {
            return lists;
        }
        for (int i=0;i<num.length-size+1;i++)
        {
            int max=Integer.MIN_VALUE;
            for (int j=i;j<i+size;j++)
            {
                if (num[j]>max)
                {
                    max=num[j];
                }
            }
            lists.add(max);
        }
        return lists;
    }
}
