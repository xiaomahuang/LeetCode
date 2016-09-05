/**
 * Created by majun on 16/7/16.
 */
public class StrToInt {
    public int StrToInt(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        boolean flag = false;
        int temp = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 && chars[i] == '-' && chars.length > 1) {
                flag = true;
                continue;
            }
            if (i == 0 && chars[i] == '0' && chars.length > 1) {
                return 0;
            }
            if ('9' < chars[i] || chars[i] < '0') {
                return 0;
            }
            int num = chars[i] - '0';
            if (flag) {
                temp -= temp;
            } else {
                temp += num * Math.pow(10, chars.length - i - 1);

            }
        }
        return temp;
    }

    public int myAtoi(String str) {
        if(str==null||str.length()==0)
        {
            return 0;
        }
        str=str.trim();
        char[] cs=str.toCharArray();
        if(cs.length==1&&(cs[0]=='-'||cs[0]=='+'))
        {
            return 0;
        }
        boolean flag=false;
        if(cs[0]=='-')
        {
            flag=true;
        }
        int sum=0;
        for(int i=0;i<cs.length;i++)
        {
            if(i==0&&(cs[0]=='-'||cs[0]=='+'))
            {
                continue;
            }
            if(cs[i]<'0'||cs[i]>'9')
            {
                if(flag){
                    sum=-sum;
                }
                return sum;
            }
            // if((sum>0x7fffffff/10)||(sum==0x7fffffff/10&&Integer.parseInt(cs[i]+"")>0x7fffffff%10))
            // {
            //     if(flag){
            //         return 0x80000000;
            //     }
            //     return 0x7fffffff;
            // }
            if((sum>Integer.MAX_VALUE/10)||(sum==Integer.MAX_VALUE/10&&Integer.parseInt(cs[i]+"")>Integer.MAX_VALUE%10))
            {
                if(flag){
                    return Integer.MIN_VALUE;
                }
                return Integer.MAX_VALUE;
            }
            sum=sum*10+Integer.parseInt(cs[i]+"");
        }
        if(flag)
        {
            sum=-sum;
        }
        return sum;
    }
}
