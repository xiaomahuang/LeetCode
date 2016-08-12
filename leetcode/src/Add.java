import java.util.HashMap;
import java.util.Map;

/**
 * Created by majun on 16/7/16.
 */
public class Add {
    public int Add(int num1,int num2) {
        while(num2!=0)
        {
            int temp=num1^num2;
            num2=num1&num2;
            num2=num2<<1;
            num1=temp;
        }
        return num1;
    }
}
