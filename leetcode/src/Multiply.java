/**
 * Created by majun on 16/7/17.
 */
public class Multiply {
    public int[] multiply(int[] A) {
        if (A==null||A.length==0)
        {
            return null;
        }
        int length=A.length;
        int[] nums=new int[length];
        for (int i=0;i<length;i++)
        {
            nums[i]=1;
        }
        for (int i=0;i<length;i++)
        {
            for (int j=0;j<i;j++)
            {
                nums[i]*=A[j];
            }
        }
        for (int i=length-1;i>=0;i--)
        {
            for (int j=length-1;j>i;j--)
            {
                nums[i]*=A[j];
            }
        }
        return nums;
    }
}
