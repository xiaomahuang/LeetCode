/**
 * Created by majun on 2016/6/27.
 */
public class Find {
    public boolean find(int[][] array, int target) {
        if (array==null||array.length==0||array[0].length==0)
        {
            return false;
        }
        int rows=array.length;
        int cols=array[0].length;
        for (int i=0;i<rows;i++)
        {
            if (array[i][cols-1]>=target)
            {
                for (int j=cols-1;j>=0;j--)
                {
                    if (array[i][j]==target)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
