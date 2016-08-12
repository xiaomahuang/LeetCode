import java.util.ArrayList;
import java.util.List;

/**
 * Created by majun on 16/8/12.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs!=null&&strs.length==0){
            return "";
        }
        List<Character> list=new ArrayList<>();
        for(int i=0;i<strs[0].length();i++){
            list.add(strs[0].charAt(i));
        }
        for(int i=1;i<strs.length;i++)
        {
            int j=0;
            for(;j<strs[i].length()&&j<list.size();j++)
            {
                if(list.get(j)!=strs[i].charAt(j)||list.get(j)==' ')
                {
                    list.set(j,' ');
                    break;
                }
            }
            if(j<list.size())
            {
                list.set(j,' ');
            }
        }
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<list.size()&&list.get(i)!=' ';i++)
        {
            builder.append(list.get(i));
        }
        return builder.toString();
    }
}
